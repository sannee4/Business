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
    private String SQL_SELECT_DEVELOPER = "SELECT * FROM developers WHERE id = ?";
    private String SQL_SELECT_STARTUPER = "SELECT * FROM startupers WHERE id = ?";
    private String SQL_SELECT_INVESTOR = "SELECT * FROM investors WHERE id = ?";
    private String SQL_SELECT_ALL_DEVELOPERS = "SELECT * FROM developers";
    private String SQL_SELECT_ALL_INVESTORS = "SELECT * FROM investors";
    private String SQL_SELECT_ALL_STARTUPERS = "SELECT * FROM startupers";

    private Connection connection;

    public PeopleDAO(){
        try {
            connection = ConnectHelper.getConnection();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<Developer> getAll(){
        return null;
    }

    public void getAccount(Roles role, int account_id) {

    }

    public Developer getDeveloperById(int id){
        Developer developer = null;
        PreparedStatement st = null;

        try {
            st = connection.prepareStatement(SQL_SELECT_DEVELOPER);
            st.setInt(1, id);
            ResultSet rs =  st.executeQuery();
            if(rs.next()){
                developer=new Developer(id, rs.getString("name"), rs.getString("surname"), rs.getString("country"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        } return developer;
    }

    public Investor getInvestorById(int id){
        Investor investor = null;
        PreparedStatement st = null;

        try{
            st = connection.prepareStatement(SQL_SELECT_INVESTOR);
            st.setInt(1,id);
            ResultSet rs = st.executeQuery();
            if (rs.next()){
                investor = new Investor(id, rs.getString("name"), rs.getString("surname"), rs.getString("country"), rs.getString("experience"));

            }
        }catch (SQLException e){
            e.printStackTrace();
        } return investor;
    }

    public Startuper getStartuperById(int id){
        Startuper startuper = null;
        PreparedStatement st = null;

        try{
            st = connection.prepareStatement(SQL_SELECT_STARTUPER);
            ResultSet rs = st.executeQuery();
            if (rs.next()){
                startuper = new Startuper(id, rs.getString("name"), rs.getString("surname"), rs.getString("country"), rs.getString("experience"));

            }

        }catch (SQLException e){
            e.printStackTrace();
        } return startuper;
    }

    public List<Developer> getAllDevelopers(){
        List<Developer> developers = new ArrayList<>();
        PreparedStatement st = null;

        try{
            st= connection.prepareStatement(SQL_SELECT_ALL_DEVELOPERS);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                Developer developer = new Developer(Integer.parseInt(rs.getString("id")), rs.getString("name"),rs.getString("surname"), rs.getString("country") );
                developers.add(developer);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }return developers;
    }

    public List<Investor> getAllInvestors(){
        List<Investor> investors = new ArrayList<>();
        PreparedStatement st = null;

        try{
            st= connection.prepareStatement(SQL_SELECT_ALL_INVESTORS);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
               Investor investor = new Investor(Integer.parseInt(rs.getString("id")), rs.getString("name"), rs.getString("surname"), rs.getString("country"), rs.getString("budget"));
                investors.add(investor);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }return investors;
    }
    public List<Startuper> getAllStartupers(){
        List<Startuper> startupers = new ArrayList<>();
        PreparedStatement st = null;

        try{
            st= connection.prepareStatement(SQL_SELECT_ALL_STARTUPERS);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                Startuper startuper = new Startuper(Integer.parseInt(rs.getString("id")), rs.getString("name"), rs.getString("surname"), rs.getString("country"), rs.getString("budget"));
               startupers.add(startuper);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }return startupers;
    }

}
