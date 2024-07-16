package FootballFantacy;

public class Football {
    private String teamName;
    private String captain;
    private String coach;
    private String city;

    public Football(String teamName, String captain, String coach, String city) {
        this.teamName = teamName;
        this.captain = captain;
        this.coach = coach;
        this.city = city;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getCaptain() {
        return captain;
    }

    public String getCoach() {
        return coach;
    }

    public String getCity() {
        return city;
    }
}
