/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MarchMadness;
    import java.util.*;                                                         // system importation for I/O and Scanner classes
    import java.io.*;
//    import java.util.logging.Level;
//    import java.util.logging.Logger;

/**
 *
 * @author 1029983
 */
public class TeamManager {
    
    /**
     * @param args the command line arguments
     */
    private final Team[] teams;                                                 // variable declaration for TeamManager
    private String teamName;
    private String teamMascot;
    private String teamLatitude;
    private String teamLongitude;
    private int teamSeed;
    private int teamTuition;
    private int teamSize;
    private int teamCounter;
    
    public TeamManager() throws IOException                                     // constructor for TeamManager
    {
        teams = new Team[64];
        teamName = "";
        teamMascot = "";
        teamLatitude = "";
        teamLongitude = "";
        teamSeed = 0;
        teamTuition = 0;
        teamSize = 0;
        teamCounter = 0;
    }
//    
//        public void writeToFile() throws IOException                          // write to file - testing file cretaion
//        {
//            String output = "";
//            BufferedWriter writer = new BufferedWriter(new FileWriter("TeamsManager.txt"));
//                        output = "Duke" + "," + 
//                     "1" + "," +
//                    "Blue Devils" + "," +
//                    "55960" + "," +
//                    "6692" + "," +
//                    "36.0°N" + "," +
//                     "78.9°W" + "\r\n";
//            //write to file
//            
//            writer.write(output);
//            writer.close();
//        }
        
    public void teamInformation() throws IOException                            // takes stored data from "TeamsManager" and stores in in object array "teams"
    {
        Scanner scan = new Scanner(new File("TeamsManager.txt"));
        
        while(scan.hasNextLine())
        {
            String input = scan.nextLine();
            String[] data = input.split(",");
            
            teamName = data[0];
            teamSeed = Integer.parseInt(data[1]);
            teamMascot = data[2];
            teamTuition = Integer.parseInt(data[3]);
            teamSize = Integer.parseInt(data[4]);
            teamLatitude = data[5];
            teamLongitude = data[6];
                
            teams[teamCounter] = new Team(teamName, teamMascot, teamLatitude, teamLongitude, teamSeed, teamTuition, teamSize);
            teamCounter++;
        }
    }
    
//    public void printInformation()                                            // test out file information storage in object array by displaying information in console
//    {
//        System.out.println(teams[0].getTeamName());
//        System.out.println(teams[0].getTeamMascot());
//        System.out.println(teams[0].getTeamLatitude());
//        System.out.println(teams[0].getTeamLongitude());
//        System.out.println(teams[0].getTeamSeed());
//        System.out.println(teams[0].getTeamTuition());
//        System.out.println(teams[0].getTeamSize());
//    }

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        TeamManager app = new TeamManager();
        app.teamInformation();
//        app.printInformation();
        
        
//        try {                                                                 // try-catch to write to and create the file (test)
//            app.writeToFile();
//        } catch (IOException ex) {
//            Logger.getLogger(TeamManager.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
}
