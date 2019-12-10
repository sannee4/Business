package models;

public class Startuper {
    private int id;
    private int startuper_id;
    private String name;
    private String surname;
    private String country;
    private String experience;

    public Startuper(int id, int startuper_id, String name, String surname, String country, String experience) {
        this.id = id;
        this.startuper_id = startuper_id;
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.experience = experience;
    }

    public int getStartuper_id() {
        return startuper_id;
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

    public String getExperience() {
        return experience;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
