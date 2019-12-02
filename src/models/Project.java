package models;

public class Project {
    private int id;
    private String name;
    private String author;
    private String data;
    private String describe;

    public Project(int id, String name, String author, String data, String describe) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.data = data;
        this.describe = describe;
    }

    public int getProject_id() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getData() {
        return data;
    }

    public String getDescribe() {
        return describe;
    }
}
