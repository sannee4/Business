package models;

public class Investor {
    private int id;
    private int investor_id;
    private String name;
    private String surname;
    private String country;
    private String budget;

    public Investor(int id, int investor_id, String name, String surname, String country, String budget) {
        this.id = id;
        this.investor_id = investor_id;
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.budget = budget;
    }

    public int getInvestor_id() {
        return investor_id;
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

    public String getBudget() {
        return budget;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
