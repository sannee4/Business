package services;

import dao.ProjectDAO;
import models.*;

import java.sql.Timestamp;
import java.util.List;

public class ProjectService {

    private ProjectDAO projectDAO = new ProjectDAO();

    public List<Project> getAllProject() {
        return projectDAO.getAll();
    }

    public Project getProject(int id) {
        return projectDAO.buId(id);
    }

    public List<Developer> getDevelopers(int project_id) {
        return projectDAO.getDevelopers(project_id);
    }

    public List<Investor> getInvestors(int project_id) {
        return projectDAO.getInvestors(project_id);
    }

    public List<Startuper> getStartupers(int project_id) {
        return projectDAO.getStartupers(project_id);
    }

    public List<Comment> getComments(int project_id) {
        return projectDAO.getComments(project_id);
    }

    public void addComment(String user, String text, Timestamp timestamp, int project_id) {
        projectDAO.addComment(user, text, timestamp, project_id);
    }


    public List<Project> getTopProjects() {
        return projectDAO.getTopProject();
    }

    public List<Project> getContestProjects() {
        return projectDAO.getContestProject();
    }

    public List<Project> getByLikePattern(String pattern){
        return projectDAO.getByLikePattern(pattern);
    }
}
