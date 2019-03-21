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
    private String teamMascotType = "";
    private String teamLatitude = "";
    private String teamLongitude = "";
    private int teamSeed = 0;
    private long teamSize = 0;
    private long teamTuition = 0;
                                                                                // constructor for object array "teams"
    public Team(String teamName, String teamMascot, String teamMascotType, String teamLatitude, String teamLongitude, int teamSeed, long teamTuition, long teamSize)
    {
        this.teamName = teamName;
        this.teamMascot = teamMascot;
        this.teamMascotType = teamMascotType;
        this.teamLatitude = teamLatitude;
        this.teamLongitude = teamLongitude;
        this.teamSeed = teamSeed;
        this.teamSize = teamSize;
        this.teamTuition = teamTuition;
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

    public String getTeamMascotType() {
        return teamMascotType;
    }

    public void setTeamMascotType(String teamMascotType) {
        this.teamMascotType = teamMascotType;
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

    public long getTeamTuition() {
        return teamTuition;
    }

    public void setTeamTuition(int teamTuition) {
        this.teamTuition = teamTuition;
    }

    public long getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
    
    
}
