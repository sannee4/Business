package services;

import dao.PeopleDAO;
import models.Developer;
import models.Investor;
import models.Startuper;

import java.util.List;

public class PeopleService {

    PeopleDAO peopleDAO = new PeopleDAO();

    public void createDeveloper(int developer_id, String name, String surname, String country) {
        peopleDAO.createDeveloper(developer_id, name, surname, country);
    }

    public void createInvestor(int investor_id, String name, String surname, String country, String budget) {
        peopleDAO.createInvestor(investor_id, name, surname, country, budget);
    }

    public void createStaruper(int startuper_id, String name, String surname, String country, String experience) {
        peopleDAO.createStartuper(startuper_id, name, surname, country, experience);
    }

    public Developer getDeveloper(int id, int user_id) {
        return peopleDAO.getDeveloperById(id, user_id);
    }

    public Developer getDeveloper(int id) {
        return peopleDAO.getDeveloperByUserId(id);
    }

    public Investor getInvestor(int id, int user_id) {
        return peopleDAO.getInvestorById(id, user_id);
    }

    public Investor getInvestor(int id) {
        return peopleDAO.getInvestorByUserId(id);
    }

    public Startuper getStartuper(int id) {
        return peopleDAO.getStartuperByUserId(id);
    }

    public Startuper getStartuper(int id, int user_id) {
        return peopleDAO.getStartuperById(id, user_id);
    }

    public List<Developer> getAllDevelopers() {
        return peopleDAO.getAllDevelopers();
    }

    public List<Investor> getAllInvestors() {
        return peopleDAO.getAllInvestors();
    }

    public List<Startuper> getAllStartupers() {
        return peopleDAO.getAllStartupers();
    }
}

