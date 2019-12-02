package dao;

import helpers.ConnectHelper;
import models.*;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ProjectDAO {
    private String SQL_SELECT_BY_ID = "SELECT * FROM projects WHERE id = ?";
    private String SQL_GET_ALL = "SELECT * FROM projects";
    private String SQL_SELECT_BY_NAME = "SELECT * FROM projects WHERE name = ?";
    private String SQL_SELECT_DEVELOPERS = "SELECT * FROM developers WHERE id IN (SELECT developer_id FROM developer_project WHERE project_id = ?)";
    private String SQL_SELECT_INVESTORS = "SELECT * FROM investors WHERE id IN (SELECT investor_id FROM investor_project WHERE project_id = ?)";
    private String SQL_SELECT_PROJECTS = "SELECT * FROM projects WHERE id IN (SELECT project_id FROM helpertable_project WHERE helpertable_id = ?)";
    private String SQL_SELECT_STARTUPERS = "SELECT * FROM startupers WHERE id IN (SELECT startuper_id FROM startuper_project WHERE project_id = ?)";
    private String SQL_SELECT_COMMENTS = "SELECT * FROM comments WHERE project_id = ?";
    private String SQL_INSERT_COMMENT = "INSERT INTO comments (user_name, text, date, project_id) VALUES (?, ?, ?, ?)";
    private String SQL_SELECT_TOP = "SELECT * FROM project ORDER BY (SELECT COUNT(*) FROM likes WHERE project_id = projects.id) DESC LIMIT 4";
    private String SQL_SELECT_CONTEST = "SELECT * FROM projects WHERE DATE(date) > current_timestamp";
    private String SQL_SELECT_LIKE ="SELECT * FROM projects WHERE NAME LIKE ?";

    private Connection connection;

    public ProjectDAO() {
        try {
            connection = ConnectHelper.getConnection();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Project buId(int id) {
        Project project = null;

        try {
            PreparedStatement st = connection.prepareStatement(SQL_SELECT_BY_ID);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                String date = new SimpleDateFormat("dd.MM.YYYY").format(rs.getTime("date"));
                project = new Project(rs.getInt("id"), rs.getString("name"), rs.getString("author"), date, rs.getString("text"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return project;
    }

    public List<Project> getAll() {
        List<Project> projects = new ArrayList<>();
        PreparedStatement st = null;
        try {
            st = connection.prepareStatement(SQL_GET_ALL);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String date = new SimpleDateFormat("dd.MM.YYYY").format(rs.getTimestamp("date"));
                Project project =new Project(rs.getInt("id"), rs.getString("name"), rs.getString("author"), date, rs.getString("text"));
                projects.add(project);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return projects;
    }

    public Project getByName(String name){
        Project project = null;
        try{
            PreparedStatement st = connection.prepareStatement(SQL_SELECT_BY_NAME);
            st.setString(1, name);
            ResultSet rs = st.executeQuery();
            if (rs.next()){
                project = new Project(rs.getInt("id"),rs.getString("name"), rs.getString("author"), rs.getString("data"), rs.getString("describing"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        } return project;
    }


    public List<Developer> getDevelopers(int project_id){
        List<Developer> developers = new ArrayList<>();
        PreparedStatement st = null;
         try{
             st = connection.prepareStatement(SQL_SELECT_DEVELOPERS);
             st.setInt(1, project_id);
             ResultSet rs = st.executeQuery();
             while (rs.next()){
                 Developer developer = new Developer(rs.getInt("id"), rs.getString("name"), rs.getString("surname"), rs.getString("country"));
                 developers.add(developer);
             }

         }catch (SQLException e){
             e.printStackTrace();
         }return developers;
    }

    public List<Investor> getInvestors (int project_id){
        List<Investor> investors = new ArrayList<>();
        PreparedStatement st = null;
        try{
            st = connection.prepareStatement(SQL_SELECT_INVESTORS);
            st.setInt(1, project_id);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                Investor investor= new Investor(rs.getInt("id"), rs.getString("name"), rs.getString("surname"), rs.getString("country"), rs.getString("budget"));
                investors.add(investor);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }return investors;
    }

    public List<Startuper> getStartupers (int project_id){
        List<Startuper> startupers = new ArrayList<>();
        PreparedStatement st = null;
        try{
            st = connection.prepareStatement(SQL_SELECT_DEVELOPERS);
            st.setInt(1, project_id);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
               Startuper startuper= new Startuper(rs.getInt("id"), rs.getString("name"), rs.getString("surname"), rs.getString("country"), rs.getString("experience"));
                startupers.add(startuper);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }return startupers;
    }

    public List<Project> getProjects(int helpertable_id) {
        List<Project> projects = new ArrayList<>();
        PreparedStatement st = null;
        try {
            st = connection.prepareStatement(SQL_SELECT_PROJECTS);
            st.setInt(1, helpertable_id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Project project = new Project(rs.getInt("id"),rs.getString("name"), rs.getString("author"), rs.getString("data"), rs.getString("describing"));

                projects.add(project);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return projects;
    }


    public List<Comment> getComments(int project_id) {
        List<Comment> comments = new ArrayList<>();
        PreparedStatement st = null;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm dd.MM.yy");
        try {
            st = connection.prepareStatement(SQL_SELECT_COMMENTS);
            st.setInt(1, project_id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Comment comment = new Comment(rs.getInt("comment_id"), rs.getString("user_name"),
                        rs.getString("text"), sdf.format(rs.getTimestamp("date")),
                        rs.getInt("project_id"));
                comments.add(comment);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return comments;
    }

    public void addComment(String user, String text, Timestamp date, int project_id) {
        PreparedStatement st = null;
        try {
            st = connection.prepareStatement(SQL_INSERT_COMMENT);
            st.setString(1, user);
            st.setString(2, text);
            st.setTimestamp(3, date);
            st.setInt(4, project_id);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Project> getTopProject() {
        List<Project> projects = new ArrayList<>();
        PreparedStatement st = null;
        try {
            st = connection.prepareStatement(SQL_SELECT_TOP);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String date = new SimpleDateFormat("dd.MM.YYYY").format(rs.getTimestamp("date"));
                Project project = new Project(rs.getInt("id"), rs.getString("name"), rs.getString("author"), date, rs.getString("text"));
                projects.add(project);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return projects;
    }

    public List<Project> getContestProject(){
        List<Project> projects = new ArrayList<>();
        PreparedStatement st = null;
        try{
            st = connection.prepareStatement(SQL_SELECT_CONTEST);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                String date = new SimpleDateFormat("dd.MM.YYYY").format(rs.getTimestamp("date"));
                Project project = new Project(rs.getInt("id"), rs.getString("name"), rs.getString("author"), date, rs.getString("text"));
                projects.add(project);
            }

        } catch (SQLException e){
            e.printStackTrace();
        }return projects;
    }

    public List<Project> getByLikePattern(String pattern){
        List<Project> projects = new ArrayList<>();
        try{
            PreparedStatement st = connection.prepareStatement(SQL_SELECT_LIKE);
            st.setString(1, "%" + pattern + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String date = new SimpleDateFormat("dd.MM.YYYY").format(rs.getTimestamp("date"));
                Project project = new Project(rs.getInt("id"), rs.getString("name"), rs.getString("author"), date, rs.getString("text"));

            }
        }catch (SQLException e){
            e.printStackTrace();
        } return projects;
    }





}
