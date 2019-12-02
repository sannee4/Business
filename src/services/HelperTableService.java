package services;

import dao.HelperTableDAO;
import dao.ProjectDAO;
import models.HelperTable;
import models.Project;

import java.util.List;

public class HelperTableService {
    HelperTableDAO  helperTableDAO = new HelperTableDAO();
    ProjectDAO projectDAO = new ProjectDAO();

    public void add(String helpertable, int user_id){
        helperTableDAO.insert(helpertable,user_id);
    }

    public List<HelperTable> getAllById(int id){
        return helperTableDAO.getAllById(id);
    }

    public List<Project> getProject(int helpertable_id){
        return projectDAO.getProjects(helpertable_id);
    }

    public void addProjects(String helpertable, int user_id, int project_id){
        helperTableDAO.insertProject(helpertable,user_id,project_id);
    }

    public void deleteProject(int helpertable_id, int project_id){
        helperTableDAO.deleteProject(helpertable_id,project_id);
    }

    public HelperTable getHelpertableById(int helpertable_id){
        return helperTableDAO.getById(helpertable_id);
    }
    public void deleteHelperTable(int helpertable_id){
        helperTableDAO.deleteHelperTable(helpertable_id);
    }
}
