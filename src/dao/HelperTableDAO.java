package dao;

import helpers.ConnectHelper;
import models.HelperTable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HelperTableDAO {

    private String SQL_INSERT = "INSERT INTO helpertables (name, user_id) VALUES (?, ?)";
    private String SQL_DELETE_HELP ="DELETE FROM helpertable_project WHERE helpertable_id = ? AND project_id = ?";
    private String SQL_GET_ALL_BY_ID = "SELECT * FROM heplertables WHERE user_id = ?";
    private String SQL_GET_ALL = "SELECT * FROM helpertables";
    private String SQL_INSERT_IN = "INSERT INTO helpertable_project (helpertable_id, project_id) VALUES ((SELECT helpertable_id FROM helpertables WHERE user_id = ? AND name = ?), ?);";
    private String SQL_GET_BY_ID = "SELECT * FROM helpertables WHERE helpertable_id = ?";
    private String SQL_DELETE_TB = "DELETE FROM helpertables WHERE helpertable_id = ?";

    private Connection connection;

    public HelperTableDAO(){
        try{
            connection = ConnectHelper.getConnection();

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public void insert(String helpertable, int user_id){
        PreparedStatement st = null;
        try{
            st = connection.prepareStatement(SQL_INSERT);
            st.setString(1, helpertable);
            st.setInt(2, user_id);
            st.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public HelperTable getById(int id){
        HelperTable helperTable = null;
        PreparedStatement st =null;
        try{
            st = connection.prepareStatement(SQL_GET_BY_ID);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                helperTable = new HelperTable(id, rs.getString("name"), rs.getInt("user_id"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return helperTable;
    }

    public List<HelperTable> getAll(){
        List<HelperTable> helperTables = new ArrayList<>();
        PreparedStatement st = null;
        try{
            st = connection.prepareStatement(SQL_GET_ALL);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                HelperTable helperTable = new HelperTable(rs.getInt("helpertable_id"), rs.getString("name"), rs.getInt("user_id"));
                helperTables.add(helperTable);
            }
        }catch (SQLException e){
            e.printStackTrace();
        } return helperTables;
    }

    public List<HelperTable> getAllById(int id){
        List<HelperTable> helperTables = new ArrayList<>();
        PreparedStatement st = null;
        try{
            st = connection.prepareStatement(SQL_GET_ALL_BY_ID);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                HelperTable helperTable = new HelperTable(rs.getInt("helpertable_id"), rs.getString("name"), rs.getInt("user_id"));
                helperTables.add(helperTable);
            }
        }catch (SQLException e){
            e.printStackTrace();
        } return helperTables;
    }

    public void insertProject (String helpertable, int user_id, int project_id){
        PreparedStatement st = null;
        try{
            st = connection.prepareStatement(SQL_INSERT_IN);
            st.setInt(1, user_id);
            st.setString(2, helpertable);
            st.setInt(3, project_id);
            st.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteProject(int helpertable_id, int project_id){
        PreparedStatement st = null;
        try{
            st = connection.prepareStatement(SQL_DELETE_HELP);
            st.setInt(1, helpertable_id);
            st.setInt(2, project_id);
            st.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public HelperTable deleteHelperTable(int helpertable_id){
        PreparedStatement st = null;
        try{
            st= connection.prepareStatement(SQL_DELETE_TB);
            st.setInt(1,helpertable_id);
            st.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
