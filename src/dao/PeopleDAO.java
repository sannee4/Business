package dao;

import helpers.ConnectHelper;
import models.Developer;
import models.Investor;
import models.Roles;
import models.Startuper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PeopleDAO {
    private String SQL_SELECT_DEVELOPER = "SELECT * FROM developers WHERE id = ? AND developer_id = ?";
    private String SQL_SELECT_STARTUPER = "SELECT * FROM startupers WHERE id = ? AND startuper_id = ?";
    private String SQL_SELECT_INVESTOR = "SELECT * FROM investors WHERE id = ? AND investor_id = ?";
    private String SQL_SELECT_ALL_DEVELOPERS = "SELECT * FROM developers";
    private String SQL_SELECT_ALL_INVESTORS = "SELECT * FROM investors";
    private String SQL_SELECT_ALL_STARTUPERS = "SELECT * FROM startupers";
    private String SQL_INSERT_DEVELOPER = "INSERT INTO developers (developer_id, name, surname, country) VALUES(?, ?, ?, ?)";
    private String SQL_SELECT_DEVELOPER_BY_USER_ID = "SELECT * FROM developers WHERE developer_id = ?";
    private String SQL_INSERT_INVESTOR = "INSERT INTO investors (investor_id, name, surname, country, budget) VALUES(?, ?, ?, ?, ?)";
    private String SQL_SELECT_INVESTOR_BY_USER_ID = "SELECT * FROM investors WHERE investor_id = ?";
    private String SQL_INSERT_STARTUPER = "INSERT INTO startupers (startuper_id, name, surname, country, experience) VALUES(?, ?, ?, ?, ?)";
    private String SQL_SELECT_STARTUPER_BY_USER_ID = "SELECT * FROM startupers WHERE startuper_id = ?";


    private Connection connection;

    public PeopleDAO() {
        try {
            connection = ConnectHelper.getConnection();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<Developer> getAll() {
        return null;
    }

    public void createDeveloper(int developer_id, String name, String surname, String country) {
        PreparedStatement st = null;
        try {
            st = connection.prepareStatement(SQL_INSERT_DEVELOPER);
            st.setInt(1, developer_id);
            st.setString(2, name);
            st.setString(3, surname);
            st.setString(4, country);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createInvestor(int investor_id, String name, String surname, String country, String budget) {
        PreparedStatement st = null;
        try {
            st = connection.prepareStatement(SQL_INSERT_INVESTOR);
            st.setInt(1, investor_id);
            st.setString(2, name);
            st.setString(3, surname);
            st.setString(4, country);
            st.setString(5, budget);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createStartuper(int startuper_id, String name, String surname, String country, String experience) {
        PreparedStatement st = null;
        try {
            st = connection.prepareStatement(SQL_INSERT_STARTUPER);
            st.setInt(1, startuper_id);
            st.setString(2, name);
            st.setString(3, surname);
            st.setString(4, country);
            st.setString(5, experience);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Developer getDeveloperById(int id, int user_id) {
        Developer developer = null;
        PreparedStatement st = null;

        try {
            st = connection.prepareStatement(SQL_SELECT_DEVELOPER);
            st.setInt(1, id);
            st.setInt(2, user_id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                developer = new Developer(id, user_id, rs.getString("name"), rs.getString("surname"), rs.getString("country"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return developer;
    }

    public Developer getDeveloperByUserId(int user_id) {
        Developer developer = null;
        PreparedStatement st = null;

        try {
            st = connection.prepareStatement(SQL_SELECT_DEVELOPER_BY_USER_ID);
            st.setInt(1, user_id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                developer = new Developer(rs.getInt("id"), user_id, rs.getString("name"), rs.getString("surname"), rs.getString("country"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return developer;
    }

    public Investor getInvestorByUserId(int user_id) {
        Investor investor = null;
        PreparedStatement st = null;

        try {
            st = connection.prepareStatement(SQL_SELECT_INVESTOR_BY_USER_ID);
            st.setInt(1, user_id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                investor = new Investor(rs.getInt("id"), user_id, rs.getString("name"), rs.getString("surname"), rs.getString("country"), rs.getString("budget"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return investor;
    }

    public Startuper getStartuperByUserId(int user_id) {
        Startuper startuper = null;
        PreparedStatement st = null;

        try {
            st = connection.prepareStatement(SQL_SELECT_STARTUPER_BY_USER_ID);
            st.setInt(1, user_id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                startuper = new Startuper(rs.getInt("id"), user_id, rs.getString("name"),rs.getString("surname"), rs.getString("country"), rs.getString("experience") );
            }
        } catch (SQLException e){
            e.printStackTrace();
        } return startuper;

    }

    public Investor getInvestorById(int id, int user_id) {
        Investor investor = null;
        PreparedStatement st = null;

        try {
            st = connection.prepareStatement(SQL_SELECT_INVESTOR);
            st.setInt(1, id);
            st.setInt(2, user_id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                investor = new Investor(id, user_id, rs.getString("name"), rs.getString("surname"), rs.getString("country"), rs.getString("experience"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return investor;
    }


    public Startuper getStartuperById(int id, int user_id) {
        Startuper startuper = null;
        PreparedStatement st = null;

        try {
            st = connection.prepareStatement(SQL_SELECT_STARTUPER);
            ResultSet rs = st.executeQuery();
            st.setInt(1, id);
            st.setInt(2, user_id);
            if (rs.next()) {
                startuper = new Startuper(id, user_id, rs.getString("name"), rs.getString("surname"), rs.getString("country"), rs.getString("experience"));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return startuper;
    }

    public List<Developer> getAllDevelopers() {
        List<Developer> developers = new ArrayList<>();
        PreparedStatement st = null;

        try {
            st = connection.prepareStatement(SQL_SELECT_ALL_DEVELOPERS);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Developer developer = new Developer(Integer.parseInt(rs.getString("id")), (Integer.parseInt(rs.getString("developer_id"))), rs.getString("name"), rs.getString("surname"), rs.getString("country"));
                developers.add(developer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return developers;
    }

    public List<Investor> getAllInvestors() {
        List<Investor> investors = new ArrayList<>();
        PreparedStatement st = null;

        try {
            st = connection.prepareStatement(SQL_SELECT_ALL_INVESTORS);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Investor investor = new Investor(Integer.parseInt(rs.getString("id")), (Integer.parseInt(rs.getString("investor_id"))), rs.getString("name"), rs.getString("surname"), rs.getString("country"), rs.getString("budget"));
                investors.add(investor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return investors;
    }

    public List<Startuper> getAllStartupers() {
        List<Startuper> startupers = new ArrayList<>();
        PreparedStatement st = null;

        try {
            st = connection.prepareStatement(SQL_SELECT_ALL_STARTUPERS);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Startuper startuper = new Startuper(Integer.parseInt(rs.getString("id")), (Integer.parseInt(rs.getString("startuper_id"))), rs.getString("name"), rs.getString("surname"), rs.getString("country"), rs.getString("budget"));
                startupers.add(startuper);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return startupers;
    }

}
