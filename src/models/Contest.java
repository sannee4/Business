package models;

public class Contest {
    private int contest_id;
    private String name;
    private String participants;
    private String data;
    private String conditions;

    public Contest(int contest_id, String name, String participants, String data, String conditions) {
        this.contest_id = contest_id;
        this.name = name;
        this.participants = participants;
        this.data = data;
        this.conditions = conditions;
    }

    public int getContest_id() {
        return contest_id;
    }

    public String getName() {
        return name;
    }

    public String getParticipants() {
        return participants;
    }

    public String getData() {
        return data;
    }

    public String getConditions() {
        return conditions;
    }
}
