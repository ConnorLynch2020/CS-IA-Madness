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
    final Team[] teams;                                                         // variable declaration for TeamManager
    private String teamName;
    private String teamMascot;
    private String teamMascotType;
    private String teamLatitude;
    private String teamLongitude;
    private int teamSeed;
    private long teamSize;
    private long teamTuition;                                                   // changed from int to long to account for tuition and size
    private int teamCounter;
    
    public TeamManager() throws IOException                                     // constructor for TeamManager
    {
        teams = new Team[64];
        teamName = "";
        teamMascot = "";
        teamMascotType = "";
        teamLatitude = "";
        teamLongitude = "";
        teamSeed = 0;
        teamSize = 0;
        teamTuition = 0;
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
        
        for (int i = 0; i < teams.length; i++)
        {
            String input = scan.nextLine();
            String[] data = input.split(",");
            
//            System.out.println(data.length);                                  // printed the length of the array to test if or where array out of bounds was occuring
            teamName = data[0];
            teamSeed = Integer.parseInt(data[1]);
            teamMascot = data[2];
            teamMascotType = data[3];
            teamSize = Long.parseLong(data[4]);
            teamTuition = Long.parseLong(data[5]);
            teamLatitude = data[6];
            teamLongitude = data[7];
            
            teams[teamCounter] = new Team(teamName, teamMascot, teamMascotType, teamLatitude, teamLongitude, teamSeed, teamTuition, teamSize);
            teamCounter++; 
        }
            String errorFix = teams[0].teamName.substring(1,teams[0].teamName.length());      // fixing weird space error for first teamName String
            teams[0].setTeamName(errorFix);
    }
    
    public void displayMainScreen() throws IOException                          // starts up the main menu to the program
    {
        if (teams[0].getTeamName().equals("Virginia"))
        {
            new MainScreen().setVisible(true);
        }
        else
        {
            System.out.println("There is an error with the file information given.");
        }
    }
    
//    public void printInformation()                                              // test out file information storage in object array by displaying information in console
//    {
//        for (int i = 0; i < teams.length; i++)
//        {
//            System.out.println(teams[i].getTeamName());
//            System.out.println(teams[i].getTeamMascot());
//            System.out.println(teams[i].getTeamMascotType());
//            System.out.println(teams[i].getTeamLatitude());
//            System.out.println(teams[i].getTeamLongitude());
//            System.out.println(teams[i].getTeamSeed());
//            System.out.println(teams[i].getTeamTuition());
//            System.out.println(teams[i].getTeamSize());
//        }
//    }

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        TeamManager manager = new TeamManager();
        
        manager.teamInformation();
        manager.displayMainScreen();
//        manager.printInformation();
        
        
//        try {                                                                 // try-catch to write to and create the file (test)
//            app.writeToFile();
//        } catch (IOException ex) {
//            Logger.getLogger(TeamManager.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
}
