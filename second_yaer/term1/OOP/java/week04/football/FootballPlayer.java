public class FootballPlayer extends Player {
    private int playerNumber;
    private String position;

    public void setPlayerNumber(int n) {
        this.playerNumber = n;
    }
    
    public void setPosition(String p) {
        this.position = p;
    }

    public int getPlayerNumber() {
        return this.playerNumber;
    }

    public String getPosition() {
        return this.position;
    }

    public boolean isSamePosition(FootballPlayer p) {
        if ((p.getPosition().equals(this.position)) & (p.getTeam().equals(this.getTeam()))) {
            return true;
        } else {
            return false;
        }
    }
}