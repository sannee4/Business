package models;

public class Developer {
    private int id;
    private int developer_id;
    private String name;
    private String surname;
    private String country;

    public Developer(int id, int developer_id, String name, String surname, String country) {
        this.id = id;
        this.developer_id = developer_id;
        this.name = name;
        this.surname = surname;
        this.country = country;
    }

    public int getDeveloper_id() {
        return developer_id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCountry() {
        return country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
