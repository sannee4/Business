package models;

public class User {

    private int id;
    private String name;
    private String login;
    private String password;
    private Roles role;

    public User(int id, String name, String login, String password, Roles role) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public static Roles getRoleFromString(String roleName) {
        try {
            return Roles.valueOf(roleName);
        } catch(IllegalArgumentException ex) {
            return null;
        }
    }
}
