package dao;

import helpers.ConnectHelper;
import models.Roles;
import models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    private String SQL_FIND_USER_BY_ID = "SELECT * FROM users WHERE id = ?";
    private String SQL_GET_ALL = "SELECT * FROM users";
    private String SQL_INSERT = "INSERT INTO users (name, login, password, role) VALUES (?, ?, ?, ?)";
    private String SQL_DELETE = "DELETE FROM users WHERE id = ?";
    private String SQL_SELECT = "SELECT * FROM users WHERE login = ? AND password = ?";
    private String SQL_SELECT_LOGIN = "SELECT * FROM users WHERE login = ?";
    private String SQL_UPDATE = "UPDATE users SET name = ? , login = ?, password = ? WHERE id = ?";

    private Connection connection;

    public UserDAO(){
        try{
            connection = ConnectHelper.getConnection();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public void insert(String name, String login, String password, Roles role) {
        PreparedStatement st = null;
        try {
            st = connection.prepareStatement(SQL_INSERT);
            st.setString(1, name);
            st.setString(2, login);
            st.setString(3, password);
            st.setString(4, role.name());
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public User getById(int id) {
        User user = null;
        try {
            PreparedStatement st = connection.prepareStatement(SQL_FIND_USER_BY_ID);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                user = new User(id, rs.getString("name"), rs.getString("login"), rs.getString("password"), Roles.valueOf(rs.getString("role")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;

    }

    public void update(int id, String name, String login, String password) {
        try {
            PreparedStatement st = connection.prepareStatement(SQL_UPDATE);
            st.setString(1, name);
            st.setString(2, login);
            st.setString(3, password);
            st.setInt(4, id);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        try {
            PreparedStatement st = connection.prepareStatement(SQL_DELETE);
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        PreparedStatement st = null;
        try {
            st = connection.prepareStatement(SQL_GET_ALL);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                User user = new User(rs.getInt("id"), rs.getString("name"),
                        rs.getString("login"), rs.getString("password"), Roles.valueOf(rs.getString("role")));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    public boolean isExist(String login, String password) {
        PreparedStatement st = null;
        try {
            st = connection.prepareStatement(SQL_SELECT);
            st.setString(1, login);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public User getUserByLogin(String login) {
        User user = null;
        PreparedStatement st = null;
        try {
            st = connection.prepareStatement(SQL_SELECT_LOGIN);
            st.setString(1, login);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                user = new User(rs.getInt("id"), rs.getString("name"),
                        login, rs.getString("password"), Roles.valueOf(rs.getString("role")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
