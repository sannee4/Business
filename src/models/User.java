package models;

public class User {

    private int id;
    private String name;
    private String login;
    private String password;
    private Roles role;
    private int account_id;

    public User(int id, String name, String login, String password, Roles role,int account_id) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.password = password;
        this.role = role;
        this.account_id = account_id;
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

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
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
