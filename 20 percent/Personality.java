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
    private int family;
    private int documentary;
    private int horror;
    private int cartoon;
    private int scienceFiction;
    private int musicals;
    private int classics;
    private int sports;
    private int anime;
    private String name;
    private static Scanner input = new Scanner(System.in);
    private int screwUp;
    private boolean com;
    private boolean act;
    private boolean dram;
    private boolean hor;
    private boolean clas;
    private boolean mus;
    private boolean sport;
    private boolean sci;
    public Personality()
    {
        System.out.println("This program is dedicated to John Elizarraras");
        System.out.println("Hello, welcome to El Pato, a program designed to help you find what movies and tv shows best fit your personality on Netflix. What is your name?");
        name = input.nextLine();
        System.out.println("Hello " + name + ", if you would like to take a personality test type 'test', if you would like to exit, type 'exit', or if you would like to see a list of movies type 'list'");
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
            movieList();
        }
        else
        {
            System.out.println("I do not understand that command. Try again");
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
                movieList();
            }
            else
            {
                System.out.println("I do not understand that command. Try again");
            }
        }
    }

    public void personalityTest(){
        System.out.println("Welcome to the personality test. This test determines which tv shows and movies are suitable for you on Netflix. You will now begin\n");
        comedyVDramaTest();
        System.out.println("You will now start the action vs. horror part of the quiz");    
        actionVHorrorTest();
    }

    public void movieList()
    {
        System.out.println("coming soon"); 
    }

    public void comedyVDramaTest(){
        System.out.println("You will start on the Comedy vs. Drama section of the quiz");
        System.out.println("A girl gets dumped on her birthday for a second time by the same guy. Do you find this funny or sad?");
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
        System.out.println("A horse attempts to jump a hurdle, trips, does a front-flip in mid air and breaks a leg. Funny or Sad?");
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
                System.out.println("Did you not understand before? Please try not to screw up next time");
            }
            else{
                System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?");
            }
        }
        System.out.println("Would you rather watch an sad movie or tv show with crying and scandals or a funny tv show or movie with lots of laughs?(Hint: type 'funny' or 'sad')");
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
                System.out.println("Did you not understand before? Please try not to screw up next time");
            }
            else{
                System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?");
            }
        }
        System.out.println("A 12 year kid was riding his bike with no helmet on. He hits a small metal stake and flips over his front tire. He falls into a 3 foot hole, hits his head on a rock,and lands in dog poop. Funny or sad?");
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
                System.out.println("Did you not understand before? Please try not to screw up next time");
            }
            else{
                System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?");
            }
        }
        System.out.println("A kid is trying to get onto a bus and because his backpack is too large he falls off the steps. Funny or Sad?");
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
                System.out.println("Did you not understand before? Please try not to screw up next time");
            }
            else{
                System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?");
            }
        }
        if(comedy > drama){
            System.out.println("You seem to like comedy more than drama. Do you think this is accurate? If not then I can change it for you");
            in = input.nextLine();
            com = true;
            if (in.toLowerCase().trim().equals("yes")){
                System.out.println("You like comedy more than drama");
                System.out.println("We will now move to the action vs horror section of the quiz");
            }
            else if(in.toLowerCase().trim().equals("no")){
                com = false;
                dram = true;
                System.out.println("You like drama more than comedy");
                System.out.println("We will now move to the action vs horror section of the quiz");
            }
            else{
                System.out.println("I do not understand that command, try again");
                if (in.toLowerCase().trim().equals("yes")){
                    System.out.println("You like comedy more than drama");
                    System.out.println("We will now move to the action vs horror section of the quiz");
                }
                else if(in.toLowerCase().trim().equals("no")){
                    System.out.println("You like drama more than comedy");
                    System.out.println("We will now move to the action vs horror section of the quiz");
                }
                else{
                    System.out.println("I do not understand that command, try again");
                }
            } 
        } 
        else if(comedy == drama){
            comEdram();
        }
        else{
            System.out.println("You seem to like drama more than comedy. Do you think this is accurate? If not then I can change it for you");
            in = input.nextLine();
            dram = true;
            if (in.toLowerCase().trim().equals("yes")){
                System.out.println("You like drama more than comedy");
                System.out.println("We will now move to the action vs horror section of the quiz");
            }
            else if(in.toLowerCase().trim().equals("no")){
                com = true;
                dram = false;
                System.out.println("You like comedy more than drama");
                System.out.println("We will now move to the action vs horror section of the quiz");
            }
            else{
                System.out.println("I do not understand that command, try again");
                if (in.toLowerCase().trim().equals("yes")){
                    System.out.println("You like drama more than comedy");
                    System.out.println("We will now move to the action vs horror section of the quiz");
                }
                else if(in.toLowerCase().trim().equals("no")){
                    System.out.println("You like comedy more than drama");
                    System.out.println("We will now move to the action vs horror section of the quiz");
                }
                else{
                    System.out.println("I do not understand that command, try again");
                }
            } 
        }
    }

    public void actionVHorrorTest(){
        System.out.println("Would you rather go to a haunted house or go paintballing?");
        System.out.println("Hint: type 'haunted house' or 'paintballing'");
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
                System.out.println("Did you not understand before? Please try not to screw up next time");
            }
            else{
                System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?");
            }
        }
        System.out.println("Would you rather watch a guy kill zombies with a chainsaw or watch a guy get killed by zombies with chainsaws?\n Hint: Type 'kill' for the first one and 'killed' for the second");
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
                System.out.println("Did you not understand before? Please try not to screw up next time");
            }
            else{
                System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?");
            }
        }
        System.out.println("Do you like creepy dolls or awesome guns?");
        System.out.println("Hint: type 'dolls' or 'guns'");
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
                System.out.println("Did you not understand before? Please try not to screw up next time");
            }
            else{
                System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?");
            }
        }
        System.out.println("Would you rather spend your time watching Jason Bourne or Chuckie? Don't know these titles? Type 'idk' and we'll give you another one");
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
            System.out.println("Do you like fighting or frighting?");
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
                    System.out.println("Did you not understand before? Please try not to screw up next time");
                }
                else{
                    System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?");
                }
            }    
        }
        else{
            screwUp++;
            if (screwUp > 2){
                System.out.println("Did you not understand before? Please try not to screw up next time");
            }
            else{
                System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?");
            }
        }
        System.out.println("Do you like Spider-man or Spider Man?(To be clear the first one is the super hero and the second is a creepy spider dude)");
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
                System.out.println("Did you not understand before? Please try not to screw up next time");
            }
            else{
                System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?");
            }
        }
        if(action > horror){
            System.out.println("You seem to like Action more than horror. Do you think this is accurate? If not then I can change it for you");
            in = input.nextLine();
            act = true;
            if (in.toLowerCase().trim().equals("yes")){
                act = false;
                hor = true;
                System.out.println("You like Horror more than Comedy");
                System.out.println("We will now move to the Classics vs Musicals section of the quiz");
            }
            else if(in.toLowerCase().trim().equals("no")){
                System.out.println("You like comedy more than drama");
                System.out.println("We will now move to the Classics vs Musicals section of the quiz");
            }
            else{
                System.out.println("I do not understand that command, try again");
                if (in.toLowerCase().trim().equals("yes")){
                    act = false;
                    hor = true;
                    System.out.println("You like drama more than comedy");
                    System.out.println("We will now move to the Classics vs Musicals section of the quiz");
                }
                else if(in.toLowerCase().trim().equals("no")){
                    System.out.println("You like comedy more than drama");
                    System.out.println("We will now move to the Classics vs Musicals section of the quiz");
                }
                else{
                    System.out.println("I do not understand that command, try again");
                }
            } 
        } 
        else if(action == horror){
            actEhor();    
        }
        else{
            System.out.println("You seem to like horror more than action. Do you think this is accurate? If not I can change it for you");
            in = input.nextLine();
            if (in.toLowerCase().trim().equals("yes")){
                System.out.println("You like Action more than Horror");
                System.out.println("We will now move to the Classics vs Musicals section of the quiz");
            }
            else if(in.toLowerCase().trim().equals("no")){
                act = true;
                hor = false;
                System.out.println("You like Action more than Horror");
                System.out.println("We will now move to the Classics vs Musicals section of the quiz");
            }
            else{
                System.out.println("I do not understand that command, try again");
                if (in.toLowerCase().trim().equals("yes")){
                    act = true;
                    hor = false;
                    System.out.println("You like Action more than Horror");
                    System.out.println("We will now move to the Classics vs Musicals section of the quiz");
                }
                else if(in.toLowerCase().trim().equals("no")){
                    System.out.println("You like Action more than Horror");
                    System.out.println("We will now move to the Classics vs Musicals section of the quiz");
                }
                else{
                    System.out.println("I do not understand that command, try again");
                }
            } 
        }
    }

    public void ClassicsVsMusicals(){
        System.out.println("Welcome to the Classical vs Musical section of the quiz");
        System.out.println("WARNING: This section contains lots of references from the 1960's to present(ish) if you would like to skip this section type 'skip' or type 'continue' to continue");
        String in = input.nextLine();
        if(in.toLowerCase().trim().equals("skip")){

        }
        else{
            System.out.println("Would you rather watch 'Where the Red Fern Grows' or 'Grease'?");
            System.out.println("Hint: type 'fern' or 'grease'");
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
                    System.out.println("Did you not understand before? Please try not to screw up next time");
                }
                else{
                    System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?");
                }
            }
            System.out.println("Would you rather watch 'Ferris Bueller's Day Off' or 'High School Musical'?");
            System.out.println("Hint: type 'day off' or 'musical'");
            System.out.println("Don't understand these references? Type 'idk' for another question");
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
                    System.out.println("Did you not understand before? Please try not to screw up next time");
                }
                else{
                    System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?");
                }
            }
            System.out.println("Would you rather watch a 60's movie with terrible quality but a good story, or a 60's movie with terrible quality and good singing");
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
                    System.out.println("Did you not understand before? Please try not to screw up next time");
                }
                else{
                    System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?");
                }
            }
            System.out.println("Do you prefer 'Hairspray' or 'Old Yeller'?");
            System.out.println("Hint: type 'hair' or 'dog'");
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
                    System.out.println("Did you not understand before? Please try not to screw up next time");
                }
                else{
                    System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?");
                }
            }
            System.out.println("Do you prefer 'Fiddler on the Roof' or 'Mr. Smith Goes Washington'?");
            System.out.println("Hint: type 'fiddle' or 'smith'");
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
                    System.out.println("Did you not understand before? Please try not to screw up next time");
                }
                else{
                    System.out.println("I do not understand that command, so we will just ignore that and go to the next question. Try not to screw up again ok?");
                }
            }
        }
        if(classics > musicals){
            System.out.println("You seem to like Classics more than Musicals. Do you think this is accurate? If not then I can change it for you");
            in = input.nextLine();
            clas = true;
            if (in.toLowerCase().trim().equals("yes")){
                clas = false;
                mus = true;
                System.out.println("You like Muscials more than Classics");
                System.out.println("We will now move to the Classics vs Musicals section of the quiz");
            }
            else if(in.toLowerCase().trim().equals("no")){
                System.out.println("You like Classics more than Muscials");
                System.out.println("We will now move to the Classics vs Musicals section of the quiz");
            }
            else{
                System.out.println("I do not understand that command, try again");
                if (in.toLowerCase().trim().equals("yes")){
                    clas = false;
                    mus = true;
                    System.out.println("You like Musicals more than Classics");
                    System.out.println("We will now move to the Classics vs Musicals section of the quiz");
                }
                else if(in.toLowerCase().trim().equals("no")){
                    System.out.println("You like Classics more than Muscials");
                    System.out.println("We will now move to the Classics vs Musicals section of the quiz");
                }
                else{
                    System.out.println("I do not understand that command, try again");
                }
            } 
        } 
        else if(classics == musicals){
            classEmusic();    
        }
        else{
            System.out.println("You seem to like Musicals more than Classics. Do you think this is accurate? If not I can change it for you");
            in = input.nextLine();
            if (in.toLowerCase().trim().equals("yes")){
                clas = true;
                mus = false;
                System.out.println("You like Classics more than Musicals");
                System.out.println("We will now move to the Sports vs Science section of the quiz");
            }
            else if(in.toLowerCase().trim().equals("no")){
                System.out.println("You like Muicals more than Classics");
                System.out.println("We will now move to the Sports vs Science section of the quiz");
            }
            else{
                System.out.println("I do not understand that command, try again");
                if (in.toLowerCase().trim().equals("yes")){
                    clas = true;
                    mus = false;
                    System.out.println("You like Classics more than Musicals");
                    System.out.println("We will now move to the Sports vs Science section of the quiz");
                }
                else if(in.toLowerCase().trim().equals("no")){
                    System.out.println("You like Musicals more than Classics");
                    System.out.println("We will now move to the Sports vs Science section of the quiz");
                }
                else{
                    System.out.println("I do not understand that command, try again");
                }
            } 
        }
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
        System.out.println("You tested equal in both Classics and Musicals. WOuld you please choose your favorite?");
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
}