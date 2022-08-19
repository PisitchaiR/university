public class Player {
    private String name;
    private String team;

    public void setName(String n) {
        this.name = n;
    }
    public void setTeam(String t) {
        this.team = t;
    }
    public String getName() {
        return name;
    }
    public String getTeam() {
        return team;
    }
    public boolean isSameTeam(Player p) {
        return(team.equals(p.team));
    }
}