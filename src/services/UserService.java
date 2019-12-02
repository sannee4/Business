package services;

import dao.UserDAO;
import models.User;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class UserService {

    private UserDAO userDAO = new UserDAO();

    public void register(String name, String login, String password) throws NoSuchAlgorithmException {
        System.out.println("in userservice");
        userDAO.insert(name, login, hash(password));
    }

    public boolean find(String login, String password) throws NoSuchAlgorithmException {
        return userDAO.isExist(login, hash(password));
    }

    public String hash(String password) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.reset();
        messageDigest.update(password.getBytes());
        byte[] digest = messageDigest.digest();
        StringBuffer hash = new StringBuffer();
        for (byte b : digest) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hash.append('0');
            hash.append(hex);
        }
        return hash.toString();
    }

    public User getUser(String login) {

        return userDAO.getUserByLogin(login);
    }

    public User getUser(int id) {

        return userDAO.getById(id);
    }

    public void update(int id, String name, String login, String password) throws NoSuchAlgorithmException {
        userDAO.update(id, name, login, hash(password));
    }
}
