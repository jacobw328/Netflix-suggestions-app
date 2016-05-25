import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
/**
 * Write a description of class Personality here.
 * 
 * @author Jacob Wagner 
 * @version (a version number or a date)
 */
public class Personality 
{
    private int comedy;
    private int drama;
    private int action;
    private int horror;
    private int scifi;
    private int musicals;
    private int classics;
    private int sports;
    private String name;
    private static Scanner input = new Scanner(System.in);
    private int screwUp;
    public boolean com = false;
    public boolean act = false;
    public boolean dram = false;
    public boolean hor = false;
    public boolean clas = false;
    public boolean mus = false;
    public boolean sport = false;
    public boolean sci = false;
    public int skip = 0;
    public boolean[] one = new boolean[8];
    public Personality()
    {
        System.out.println("This program is dedicated to John Elizarraras");
        System.out.println("Hello, welcome to Wizflix, a program designed to help you find what movies and tv shows best fit your personality on Netflix. What is your name?");
        name = input.nextLine();
        System.out.println("Hello " + name);
        name();
        personality();
    }

    public void name(){
        System.out.println("Are you satisfied with your name " + name +  "? If so, type 'yes', otherwise type 'no'");
        String in = input.nextLine();
        if(in.toLowerCase().equals("no")){
            System.out.println("Ok, type your new name");
            name = input.nextLine();
        }
        else if(in.toLowerCase().equals("yes")){

        }
        else if(in.toLowerCase().equals("exit")){
            System.exit(1);
        }
        else{
            System.out.println("I do not understand that command, lets try again");
            name();
        }
    }

    public void personality(){
        System.out.println("If you would like to take a personality test type 'test', if you would like to exit, type 'exit', or if you would like to see a list of movies type 'list'");
        String in = input.nextLine();
        if((in.toLowerCase().trim().equals("exit")))
        {
            System.out.println("Have a nice day " + name);
            System.exit(1);
        }
        else if(in.toLowerCase().trim().equals("test"))
        {
            personalityTest();     
        }
        else if(in.toLowerCase().trim().equals("list"))
        {
            System.out.println("Comedy");
            for(String str :ListContainer.get("comedy")) System.out.println(str);
            System.out.println("Drama");
            for(String str :ListContainer.get("drama")) System.out.println(str);
            System.out.println("Action");
            for(String str :ListContainer.get("action")) System.out.println(str);
            System.out.println("Horror");
            for(String str :ListContainer.get("horror")) System.out.println(str);
            System.out.println("Sci-fi");
            for(String str :ListContainer.get("scifi")) System.out.println(str);
            System.out.println("Classics");
            for(String str :ListContainer.get("classics")) System.out.println(str);
            System.out.println("Musicals");
            for(String str :ListContainer.get("musicals")) System.out.println(str);
            System.out.println("Sports");
            for(String str :ListContainer.get("sport")) System.out.println(str);
        }
        else
        {
            System.out.println("I do not understand that command. Try again");
            personality();
        } 
    }

    public void personalityTest(){
        System.out.println("Welcome to the personality test. This test determines which tv shows and movies are suitable for you on Netflix. You will now begin\n");
        comedyVDramaTest();
        System.out.println(name + " You will now start the action vs. horror part of the quiz");    
        actionVHorrorTest();
        System.out.println(name + " You will now start the classics vs muscials part of the quiz");  
        classicsVsMusicals();
        System.out.println(name + " You will now start the sports vs sci-fi part of the quiz");
        sportsVsSci();
        if(com == true)one[0] = true;
        if(dram == true)one[1] = true;
        if(act == true)one[2] = true;
        if(hor == true)one[3] = true;
        if(clas == true)one[4] = true;
        if(mus == true)one[5] = true;
        if(sport == true)one[6] = true;
        if(sci == true)one[7] = true;
        new Interpret(this);
    }

    public void movieList()
    {
        System.out.println("coming soon"); 
    }

    public void comedyVDramaTest(){
        System.out.println("You will start on the Comedy vs. Drama section of the quiz " + name + "\n");
        System.out.println("A girl gets dumped on her birthday for a second time by the same guy. Do you find this funny or sad?\n");
        String in = input.nextLine();
        if (in.toLowerCase().trim().equals("funny")){
            comedy ++;
        }
        else if (in.toLowerCase().trim().equals("sad"))
        {
            drama ++;
        }
        else if(in.toLowerCase().trim().equals("exit"))
        {
            System.out.println("Have a nice day " + name);
            System.exit(1);
        }
        else{
            System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?");
            screwUp++;
        } 
        System.out.println("\nA horse attempts to jump a hurdle, trips, does a front-flip in mid air and breaks a leg. Funny or Sad?\n");
        in = input.nextLine();
        if (in.toLowerCase().trim().equals("funny")){
            comedy ++;
        }
        else if (in.toLowerCase().trim().equals("sad"))
        {
            drama ++;
        }
        else if(in.toLowerCase().trim().equals("exit"))
        {
            System.out.println("Have a nice day " + name);
            System.exit(1);
        }
        else{
            screwUp++;
            if (screwUp > 2){
                System.out.println("Did you not understand before" + name + "? Please try not to screw up next time");
            }
            else{
                System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?");
            }
        }
        System.out.println("\nWould you rather watch an sad movie or tv show with crying and scandals or a funny tv show or movie with lots of laughs?\n");
        System.out.println("Hint: type 'funny' or 'sad'\n");
        in = input.nextLine();
        if (in.toLowerCase().trim().equals("funny")){
            comedy++;
        }
        else if(in.toLowerCase().trim().equals("sad")){
            drama++;
        }
        else if(in.toLowerCase().trim().equals("exit"))
        {
            System.out.println("Have a nice day " + name);
            System.exit(1);
        }
        else{
            screwUp++;
            if (screwUp > 2){
                System.out.println("Did you not understand before? Please try not to screw up next time\n");
            }
            else{
                System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?\n");
            }
        }
        System.out.println("\nA 12 year kid was riding his bike with no helmet on. He hits a small metal stake and flips over his front tire."); 
        System.out.println("He falls into a 3 foot hole, hits his head on a rock,and lands in dog poop. Funny or sad?\n");
        in = input.nextLine();
        if (in.toLowerCase().trim().equals("funny")){
            comedy++;
        }
        else if(in.toLowerCase().trim().equals("sad")){
            drama++;
        }
        else if(in.toLowerCase().trim().equals("exit"))
        {
            System.out.println("Have a nice day " + name);
            System.exit(1);
        }
        else{
            screwUp++;
            if (screwUp > 2){
                System.out.println("Did you not understand before? Please try not to screw up next time\n");
            }
            else{
                System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?\n");
            }
        }
        System.out.println("\nA kid is trying to get onto a bus and because his backpack is too large he falls off the steps. Funny or Sad?\n");
        in = input.nextLine();
        if (in.toLowerCase().trim().equals("funny")){
            comedy++;
        }
        else if(in.toLowerCase().trim().equals("sad")){
            drama++;
        }
        else if(in.toLowerCase().trim().equals("exit"))
        {
            System.out.println("Have a nice day " + name);
            System.exit(1);
        }
        else{
            screwUp++;
            if (screwUp > 2){
                System.out.println("Did you not understand before? Please try not to screw up next time\n");
            }
            else{
                System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?\n");
            }
        }
        compareCD();
    }

    public void actionVHorrorTest(){
        System.out.println("\nWould you rather go to a haunted house or go paintballing?\n");
        System.out.println("Hint: type 'haunted house' or 'paintballing'\n");
        String in = input.nextLine();
        if (in.toLowerCase().trim().equals("haunted house")){
            horror++;
        }
        else if(in.toLowerCase().trim().equals("paintballing")){
            action++;
        }
        else if(in.toLowerCase().trim().equals("exit"))
        {
            System.out.println("Have a nice day " + name);
            System.exit(1);
        }
        else{
            screwUp++;
            if (screwUp > 2){
                System.out.println("Did you not understand before? Please try not to screw up next time\n");
            }
            else{
                System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?\n");
            }
        }
        System.out.println("\nWould you rather watch a guy kill zombies with a chainsaw or watch a guy get killed by zombies with chainsaws?\n");
        System.out.println("Hint: Type 'kill' for the first one and 'killed' for the second\n");
        in = input.nextLine();
        if (in.toLowerCase().trim().equals("killed")){
            horror++;
        }
        else if(in.toLowerCase().trim().equals("kill")){
            action++;
        }
        else if(in.toLowerCase().trim().equals("exit"))
        {
            System.out.println("Have a nice day " + name);
            System.exit(1);
        }
        else{
            screwUp++;
            if (screwUp > 2){
                System.out.println("Did you not understand before? Please try not to screw up next time\n");
            }
            else{
                System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?\n");
            }
        }
        System.out.println("\nDo you like creepy dolls or awesome guns?\n");
        System.out.println("Hint: type 'dolls' or 'guns'\n");
        in = input.nextLine();
        if (in.toLowerCase().trim().equals("dolls") || in.toLowerCase().trim().equals("creepy dolls")){
            horror++;
        }
        else if(in.toLowerCase().trim().equals("guns") || in.toLowerCase().trim().equals("awesome guns")){
            action++;
        }
        else if(in.toLowerCase().trim().equals("exit"))
        {
            System.out.println("Have a nice day " + name);
            System.exit(1);
        }
        else{
            screwUp++;
            if (screwUp > 2){
                System.out.println("Did you not understand before? Please try not to screw up next time\n");
            }
            else{
                System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?\n");
            }
        }
        System.out.println("\nWould you rather spend your time watching Jason Bourne or Chuckie? Don't know these titles? Type 'idk' and we'll give you another one\n");
        in = input.nextLine();
        if (in.toLowerCase().trim().equals("chuckie")){
            horror++;
        }
        else if(in.toLowerCase().trim().equals("jason bourne")){
            action++;
        }
        else if(in.toLowerCase().trim().equals("exit"))
        {
            System.out.println("Have a nice day " + name);
            System.exit(1);
        }
        else if(in.toLowerCase().trim().equals("idk")){
            System.out.println("Do you like fighting or frighting?\n");
            in = input.nextLine();
            if (in.toLowerCase().trim().equals("frighting") || in.toLowerCase().trim().equals("creepy dolls")){
                horror++;
            }
            else if(in.toLowerCase().trim().equals("fighting") || in.toLowerCase().trim().equals("awesome guns")){
                action++;
            }
            else if(in.toLowerCase().trim().equals("exit"))
            {
                System.out.println("Have a nice day " + name);
                System.exit(1);
            }
            else{
                screwUp++;
                if (screwUp > 2){
                    System.out.println("Did you not understand before? Please try not to screw up next time\n");
                }
                else{
                    System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?\n");
                }
            }    
        }
        else{
            screwUp++;
            if (screwUp > 2){
                System.out.println("Did you not understand before? Please try not to screw up next time\n");
            }
            else{
                System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?\n");
            }
        }
        System.out.println("\nDo you like Spider-man or Spider Man?(To be clear the first one is the super hero and the second is a creepy spider dude)\n");
        in = input.nextLine();
        if (in.toLowerCase().trim().equals("spider-man")){
            action++;
        }
        else if(in.toLowerCase().trim().equals("spider man")){
            horror++;
        }
        else if(in.toLowerCase().trim().equals("exit"))
        {
            System.out.println("Have a nice day " + name);
            System.exit(1);
        }
        else{
            screwUp++;
            if (screwUp > 2){
                System.out.println("Did you not understand before? Please try not to screw up next time\n");
            }
            else{
                System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?\n");
            }
        }
        compareAH();
    }

    public void classicsVsMusicals(){
        System.out.println("Welcome to the Classical vs Musical section of the quiz\n");
        System.out.println("WARNING: This section contains lots of references from the 1960's to present(ish) if you would like to skip this section type 'skip' or type 'continue' to continue\n");
        String in = input.nextLine();
        outer:{
            if(in.toLowerCase().trim().equals("skip")){
                skip = 1;
                break outer;
            }
            else{
                System.out.println("\nWould you rather watch 'Where the Red Fern Grows' or 'Grease'?\n");
                System.out.println("Hint: type 'fern' or 'grease'\n");
                in = input.nextLine();
                if(in.toLowerCase().trim().equals("fern")){
                    classics++;
                }
                else if(in.toLowerCase().trim().equals("grease")){
                    musicals++;
                }
                else if(in.toLowerCase().trim().equals("exit")){
                    System.exit(1);
                }
                else{
                    screwUp++;
                    if (screwUp > 2){
                        System.out.println("Did you not understand before? Please try not to screw up next time\n");
                    }
                    else{
                        System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?\n");
                    }
                }
                System.out.println("\nWould you rather watch 'Ferris Bueller's Day Off' or 'High School Musical'\n?");
                System.out.println("Hint: type 'day off' or 'musical'\n");
                in = input.nextLine();
                if(in.toLowerCase().trim().equals("day off")){
                    classics++;
                }
                else if(in.toLowerCase().trim().equals("musical")){
                    musicals++;
                }
                else if(in.toLowerCase().trim().equals("exit")){
                    System.exit(1);
                }
                else{
                    screwUp++;
                    if (screwUp > 2){
                        System.out.println("Did you not understand before? Please try not to screw up next time\n");
                    }
                    else{
                        System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?\n");
                    }
                }
                System.out.println("\nWould you rather watch a 60's movie with terrible quality but a good story, or a 60's movie with terrible quality and good singing\n");
                System.out.println("Hint: type 'story' or 'singing'");
                in = input.nextLine();
                if(in.toLowerCase().trim().equals("story")){
                    classics++;
                }
                else if(in.toLowerCase().trim().equals("singing")){
                    musicals++;
                }
                else if(in.toLowerCase().trim().equals("exit")){
                    System.exit(1);
                }
                else{
                    screwUp++;
                    if (screwUp > 2){
                        System.out.println("Did you not understand before? Please try not to screw up next time\n");
                    }
                    else{
                        System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?\n");
                    }
                }
                System.out.println("\nDo you prefer 'Hairspray' or 'Old Yeller'?\n");
                System.out.println("Hint: type 'hair' or 'dog'\n");
                in = input.nextLine();
                if(in.toLowerCase().trim().equals("dog")){
                    classics++;
                }
                else if(in.toLowerCase().trim().equals("hair")){
                    musicals++;
                }
                else if(in.toLowerCase().trim().equals("exit")){
                    System.exit(1);
                }
                else{
                    screwUp++;
                    if (screwUp > 2){
                        System.out.println("Did you not understand before? Please try not to screw up next time\n");
                    }
                    else{
                        System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?\n");
                    }
                }
                System.out.println("\nDo you prefer 'Fiddler on the Roof' or 'Mr. Smith Goes Washington'?\n");
                System.out.println("Hint: type 'fiddle' or 'smith'\n");
                in = input.nextLine();
                if(in.toLowerCase().trim().equals("smith")){
                    classics++;
                }
                else if(in.toLowerCase().trim().equals("fiddle")){
                    musicals++;
                }
                else if(in.toLowerCase().trim().equals("exit")){
                    System.exit(1);
                }
                else{
                    screwUp++;
                    if (screwUp > 2){
                        System.out.println("Did you not understand before? Please try not to screw up next time\n");
                    }
                    else{
                        System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?\n");
                    }
                }
            }
            compareCM();
        }
    }

    public void sportsVsSci(){
        System.out.println("Welcome to the Sports vs Science section of the quiz\n"); 
        System.out.println("Would you rather watch SC or Bill Nye?\n");
        String in = input.nextLine();
        if(in.toLowerCase().equals("sc")){
            sports++;    
        }
        else if(in.toLowerCase().equals("bill nye")){
            scifi++;
        }
        else if(in.toLowerCase().equals("exit")){
            System.exit(1);
        }
        else{
            screwUp++;
            if (screwUp > 2){
                System.out.println("Did you not understand before? Please try not to screw up next time\n");
            }
            else{
                System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?\n");
            }
        }
        System.out.println("\nWould you rather watch a movie about football or aliens?\n");
        in = input.nextLine();
        if(in.toLowerCase().equals("football")){
            sports++;    
        }
        else if(in.toLowerCase().equals("aliens")){
            scifi++;
        }
        else if(in.toLowerCase().equals("exit")){
            System.exit(1);
        }
        else{
            screwUp++;
            if (screwUp > 2){
                System.out.println("Did you not understand before? Please try not to screw up next time\n");
            }
            else{
                System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?\n");
            }
        }
        System.out.println("\nWould you rather watch Maze Runner or Goosebumps?\n");
        System.out.println("HINT: type 'maze' or 'gb'\n");
        in = input.nextLine();
        if(in.toLowerCase().equals("maze")){
            sports++;    
        }
        else if(in.toLowerCase().equals("gb")){
            scifi++;
        }
        else if(in.toLowerCase().equals("exit")){
            System.exit(1);
        }
        else{
            screwUp++;
            if (screwUp > 2){
                System.out.println("Did you not understand before? Please try not to screw up next time\n");
            }
            else{
                System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?\n");
            }
        }
        System.out.println("\nWould you rather The Blind Side or Ender's Game?\n");
        System.out.println("HINT: type blind or game\n");
        in = input.nextLine();
        if(in.toLowerCase().equals("blind")){
            sports++;    
        }
        else if(in.toLowerCase().equals("game")){
            scifi++;
        }
        else if(in.toLowerCase().equals("exit")){
            System.exit(1);
        }
        else{
            screwUp++;
            if (screwUp > 2){
                System.out.println("Did you not understand before? Please try not to screw up next time\n");
            }
            else{
                System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?\n");
            }
        }
        System.out.println("\nWould you rather watch Talledega Knights or Batman?\n");
        System.out.println("HINT: type 'knight' or 'batman'\n");
        in = input.nextLine();
        if(in.toLowerCase().equals("knight")){
            sports++;    
        }
        else if(in.toLowerCase().equals("batman")){
            scifi++;
        }
        else if(in.toLowerCase().equals("exit")){
            System.exit(1);
        }
        else{
            screwUp++;
            if (screwUp > 2){
                System.out.println("Did you not understand before? Please try not to screw up next time\n");
            }
            else{
                System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?\n");
            }
        }
        compareSS();
    }

    private void comEdram(){
        System.out.println("You tested equal in both comedy and drama. Would you please choose your favorite?");
        String in = input.nextLine();
        if(in.toLowerCase().trim().equals("comedy")){
            com = true;
        }
        else if(in.toLowerCase().trim().equals("drama")){
            dram = true;
        }
        else if(in.toLowerCase().trim().equals("exit")){
            System.exit(1);
        }
        else{
            System.out.println("I do not understand that command");
            comEdram();
        }
    }

    private void actEhor(){
        System.out.println("You tested equal in both Action and Horror. Would you please choose your favorite?");
        String in = input.nextLine();
        if(in.toLowerCase().trim().equals("action")){
            act = true;
        }
        else if(in.toLowerCase().trim().equals("horror")){
            hor = true;
        }
        else if(in.toLowerCase().trim().equals("exit")){
            System.exit(1);
        }
        else{
            System.out.println("I do not understand that command");
            actEhor();
        }
    }

    private void classEmusic(){
        System.out.println("You tested equal in both Classics and Musicals. Would you please choose your favorite?");
        String in = input.nextLine();
        if(in.toLowerCase().trim().equals("classics")){
            act = true;
        }
        else if(in.toLowerCase().trim().equals("musicals")){
            hor = true;
        }
        else if(in.toLowerCase().trim().equals("exit")){
            System.exit(1);
        }
        else{
            System.out.println("I do not understand that command");
            actEhor();
        }
    }

    private void sportsESci(){
        System.out.println("You tested equal in both Sports and Science. Would you please choose your favorite?");
        String in = input.nextLine();
        if(in.toLowerCase().trim().equals("sports")){
            sport = true;
        }
        else if(in.toLowerCase().trim().equals("science")){
            sci = true;
        }
        else if(in.toLowerCase().trim().equals("exit")){
            System.exit(1);
        }
        else{
            System.out.println("I do not understand that command");
            sportsESci();
        }
    }

    private void interpret(){
        Interpret interpreter = new Interpret(this); 
    }

    private void compareAH(){
        if(action > horror){
            System.out.println("\nYou seem to like Action more than horror. Do you think this is accurate? If not then I can change it for you\n");
            String in = input.nextLine();
            act = true;
            if (in.toLowerCase().trim().equals("yes")){
                System.out.println("\nYou like Action more than Horror\n");
                System.out.println("We will now move to the Classics vs Musicals section of the quiz\n");
            }
            else if(in.toLowerCase().trim().equals("no")){
                act = false;
                hor = true;
                System.out.println("\nYou like Horror more than Action\n");
                System.out.println("We will now move to the Classics vs Musicals section of the quiz\n");
            }
            else{
                System.out.println("I do not understand that command, try again");
                compareAH();
            } 
        } 
        else if(action == horror){
            actEhor();    
        }
        else{
            System.out.println("\nYou seem to like horror more than action. Do you think this is accurate? If not I can change it for you\n");
            String in = input.nextLine();
            if (in.toLowerCase().trim().equals("yes")){
                System.out.println("\nYou like Horror more than Action\n");
                System.out.println("We will now move to the Classics vs Musicals section of the quiz\n");
            }
            else if(in.toLowerCase().trim().equals("no")){
                act = true;
                hor = false;
                System.out.println("\nYou like Action more than Horror\n");
                System.out.println("We will now move to the Classics vs Musicals section of the quiz\n");
            }
            else{
                System.out.println("I do not understand that command, try again");
                compareAH();
            } 
        }
    }

    public void compareCD(){
        if(comedy > drama){
            System.out.println("\nYou seem to like comedy more than drama. Do you think this is accurate? If not then I can change it for you\n");
            String in = input.nextLine();
            com = true;
            if (in.toLowerCase().trim().equals("yes")){
                System.out.println("\nYou like comedy more than drama\n");
                System.out.println("We will now move to the action vs horror section of the quiz\n");
            }
            else if(in.toLowerCase().trim().equals("no")){
                com = false;
                dram = true;
                System.out.println("\nYou like drama more than comedy\n");
                System.out.println("We will now move to the action vs horror section of the quiz\n");
            }
            else{
                System.out.println("I do not understand that command, try again");
                compareCD();
            } 
        } 
        else if(comedy == drama){
            comEdram();
        }
        else{
            System.out.println("\nYou seem to like drama more than comedy. Do you think this is accurate? If not then I can change it for you\n");
            String in = input.nextLine();
            dram = true;
            if (in.toLowerCase().trim().equals("yes")){
                System.out.println("\nYou like drama more than comedy\n");
                System.out.println("We will now move to the action vs horror section of the quiz\n");
            }
            else if(in.toLowerCase().trim().equals("no")){
                com = true;
                dram = false;
                System.out.println("\nYou like comedy more than drama\n");
                System.out.println("We will now move to the action vs horror section of the quiz\n");
            }
            else{
                System.out.println("I do not understand that command, try again");
                compareCD();
            } 
        }
    }

    public void compareCM(){
        if(classics > musicals){
            System.out.println("\nYou seem to like Classics more than Musicals. Do you think this is accurate? If not then I can change it for you\n");
            String in = input.nextLine();
            clas = true;
            if (in.toLowerCase().trim().equals("yes")){
                System.out.println("\nYou like Classics more than Musicals\n");
                System.out.println("We will now move to the Sports vs Science section of the quiz\n");
            }
            else if(in.toLowerCase().trim().equals("no")){
                clas = false;
                mus = true;
                System.out.println("\nYou like Muscials more than classics\n");
                System.out.println("We will now move to the Sports vs Science section of the quiz\n");
            }
            else{
                System.out.println("I do not understand that command, try again");
                compareCM();
            } 
        } 
        else if(classics == musicals){
            classEmusic();    
        }
        else{
            System.out.println("\nYou seem to like Musicals more than Classics. Do you think this is accurate? If not I can change it for you\n");
            String in = input.nextLine();
            mus = true;
            if (in.toLowerCase().trim().equals("yes")){
                System.out.println("\nYou like Musicals more than Classics\n");
                System.out.println("We will now move to the Sports vs Science section of the quiz\n");
            }
            else if(in.toLowerCase().trim().equals("no")){
                clas = true;
                mus = false;
                System.out.println("\nYou like Classics more than Musicals\n");
                System.out.println("We will now move to the Sports vs Science section of the quiz\n");
            }
            else{
                System.out.println("I do not understand that command, try again");
                compareCM();
            } 
        }
    }

    public void compareSS(){
        if (sports > scifi){
            sport = true;
            System.out.println("\nYou seem to like sports more than science. Do you think this is accurate? If not I can change it for you\n");
            String in = input.nextLine();
            if(in.toLowerCase().equals("yes")){
                System.out.println("\nYou like sports more than science, we will now interpret your results\n");
                interpret();
            }
            else if(in.toLowerCase().equals("no")){
                System.out.println("\nYou like sci-fi more than sports\n");
                sport = false;
                sci = true;
            }
            else if(in.toLowerCase().equals("exit")){
                System.exit(1);
            }
            else{
                System.out.println("I do not understand that command, try again");
                compareSS();
            }
        }
        else if(scifi > sports){
            sci = true;
            System.out.println("\nYou seem to like science more than sports. Do you think this is accurate? If not I can change it for you\n");
            String in = input.nextLine();
            if(in.toLowerCase().equals("yes")){
                System.out.println("\nYou like scifi more than sports, we will now interpret your results\n");
            }
            else if(in.toLowerCase().equals("no")){
                System.out.println("\nYou like sports more than sci-fi\n");
                sport = true;
                sci = false;
            }
            else if(in.toLowerCase().equals("exit")){
                System.exit(1);
            }
            else{
                System.out.println("I do not understand that command, try again");
                compareSS();
            }
        }
        else{
            sportsESci();
        }
    }

    public int count(){
        if(skip == 0)return 4;
        else return 3;
    }
}