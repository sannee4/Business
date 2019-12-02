package models;

public class Request {
    private int request_id;
    private String data;
    private String participant;
    private String contest_name;

    public Request(int request_id, String data, String participant, String contest_name) {
        this.request_id = request_id;
        this.data = data;
        this.participant = participant;
        this.contest_name = contest_name;
    }

    public int getRequest_id() {
        return request_id;
    }

    public String getData() {
        return data;
    }

    public String getParticipant() {
        return participant;
    }

    public String getContest_name() {
        return contest_name;
    }
}
