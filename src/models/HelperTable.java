package models;

public class HelperTable {
    private int helpertable_id;
    private String name;
    private int id_user;

    public HelperTable(int helpertable_id, String name, int id_user) {
        this.helpertable_id = helpertable_id;
        this.name = name;
        this.id_user = id_user;
    }

    public int getHelpertable_id() {
        return helpertable_id;
    }

    public String getName() {
        return name;
    }

    public int getId_user() {
        return id_user;
    }
}
