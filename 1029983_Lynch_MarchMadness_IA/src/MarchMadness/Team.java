/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MarchMadness;

/**
 *
 * @author 1029983
 */
public class Team {
    
    String teamName = "";                                                       // variable declaration for the object array
    private String teamMascot = "";
    private String teamLatitude = "";
    private String teamLongitude = "";
    private int teamSeed = 0;
    private int teamTuition = 0;
    private int teamSize = 0;
                                                                                // constructor for object array "teams"
    public Team(String teamName, String teamMascot, String teamLatitude, String teamLongitude, int teamSeed, int teamTuition, int teamSize)
    {
        this.teamName = teamName;
        this.teamMascot = teamMascot;
        this.teamLatitude = teamLatitude;
        this.teamLongitude = teamLongitude;
        this.teamSeed = teamSeed;
        this.teamTuition = teamTuition;
        this.teamSize = teamSize;
    }
                                                                                // getters and setters for all variables
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamMascot() {
        return teamMascot;
    }

    public void setTeamMascot(String teamMascot) {
        this.teamMascot = teamMascot;
    }

    public String getTeamLatitude() {
        return teamLatitude;
    }

    public void setTeamLatitude(String teamLatitude) {
        this.teamLatitude = teamLatitude;
    }

    public String getTeamLongitude() {
        return teamLongitude;
    }

    public void setTeamLongitude(String teamLongitude) {
        this.teamLongitude = teamLongitude;
    }

    public int getTeamSeed() {
        return teamSeed;
    }

    public void setTeamSeed(int teamSeed) {
        this.teamSeed = teamSeed;
    }

    public int getTeamTuition() {
        return teamTuition;
    }

    public void setTeamTuition(int teamTuition) {
        this.teamTuition = teamTuition;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
    
    
}
