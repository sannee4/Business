package services;

import dao.PeopleDAO;
import models.Developer;
import models.Investor;
import models.Startuper;

import java.util.List;

public class PeopleService {

    PeopleDAO peopleDAO = new PeopleDAO();

    public Developer getDeveloper(int id) {
        return peopleDAO.getDeveloperById(id);
    }

    public Investor getInvestor(int id) {
        return peopleDAO.getInvestorById(id);
    }

    public Startuper getStartuper(int id) {
        return peopleDAO.getStartuperById(id);
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

