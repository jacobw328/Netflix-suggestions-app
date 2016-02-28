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
    private int independant;
    private int sports;
    private int anime;
    private String name;
    private static Scanner input = new Scanner(System.in);
    private int screwUp;
    private boolean Com = true;
    public Personality()
    {
        System.out.println("This program is dedicated to John Elizarraras");
        System.out.println("Hello, welcome to El Pato, a program designed to help you find what movies and tv shows best fit your personality on Netflix. What is your name?");
        name = input.nextLine();
        System.out.println("Hello " + name + ", if you would like to take a personality test type 'personality test', if you would like to exit, type 'exit', or if you would like to see a list of movies type 'list'");
        String in = input.nextLine();
        if((in.toLowerCase().equals("exit")))
        {
            System.out.println("Have a nice day " + name);
            System.exit(1);
        }
        else if(in.toLowerCase().equals("personality test"))
        {
            personalityTest();     
        }
        else if(in.toLowerCase().equals("list"))
        {
            movieList();
        }
        else
        {
            System.out.println("I will see you later " + name);
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
        if (in.toLowerCase().equals("funny")){
            comedy ++;
        }
        else if (in.toLowerCase().equals("sad"))
        {
            drama ++;
        }
        else if(in.toLowerCase().equals("exit"))
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
        if (in.toLowerCase().equals("funny")){
            comedy ++;
        }
        else if (in.toLowerCase().equals("sad"))
        {
            drama ++;
        }
        else if(in.toLowerCase().equals("exit"))
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
        System.out.println("Would you rather watch an sad movie or tv show with crying and scandals or a funny tv show or movie with lots of laughs?");
        in = input.nextLine();
        if (in.toLowerCase().equals("funny")){
            comedy++;
        }
        else if(in.toLowerCase().equals("sad")){
            drama++;
        }
        else if(in.toLowerCase().equals("exit"))
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
        if (in.toLowerCase().equals("funny")){
            comedy++;
        }
        else if(in.toLowerCase().equals("sad")){
            drama++;
        }
        else if(in.toLowerCase().equals("exit"))
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
        if (in.toLowerCase().equals("funny")){
            comedy++;
        }
        else if(in.toLowerCase().equals("sad")){
            drama++;
        }
        else if(in.toLowerCase().equals("exit"))
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
            System.out.println("You seem to like comedy more than drama. Do you think this is accurate? if not then I can change it for you");
            in = input.nextLine();
            Com = true;
            if (in.toLowerCase().equals("yes")){
                Com = false;
            }
            else{
                System.out.println("You like comedy moe than drama");
            }
        }
        if (drama > comedy)
        {
            System.out.println("You seem to be more interested in drama based on this quiz");
            drama = 10;
        }
    }

    public void actionVHorrorTest(){
        System.out.println("Would you rather go to a haunted house or go paintballing?");
        String in = input.nextLine();
        if (in.toLowerCase().equals("haunted house")){
            horror++;
        }
        else if(in.toLowerCase().equals("paintballing")){
            action++;
        }
        else if(in.toLowerCase().equals("exit"))
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
        System.out.println("Would you rather watch a guy kill zombies with a chainsaw or watch a guy get killed by zombies with chainsaws? Type 'kill' for the first one and 'killed' for the second");
        in = input.nextLine();
        if (in.toLowerCase().equals("kill")){
            horror++;
        }
        else if(in.toLowerCase().equals("killed")){
            action++;
        }
        else if(in.toLowerCase().equals("exit"))
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
        in = input.nextLine();
        if (in.toLowerCase().equals("dolls") || in.toLowerCase().equals("creepy dolls")){
            horror++;
        }
        else if(in.toLowerCase().equals("guns") || in.toLowerCase().equals("awesome guns")){
            action++;
        }
        else if(in.toLowerCase().equals("exit"))
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
        if (in.toLowerCase().equals("kill")){
            horror++;
        }
        else if(in.toLowerCase().equals("killed")){
            action++;
        }
        else if(in.toLowerCase().equals("exit"))
        {
            System.out.println("Have a nice day " + name);
            System.exit(1);
        }
        else if(in.toLowerCase().equals("idk")){
            System.out.println("Do you like fighting or frighting?");
            in = input.nextLine();
            if (in.toLowerCase().equals("frighting") || in.toLowerCase().equals("creepy dolls")){
                horror++;
            }
            else if(in.toLowerCase().equals("fighting") || in.toLowerCase().equals("awesome guns")){
                action++;
            }
            else if(in.toLowerCase().equals("exit"))
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
        System.out.println("");
        in = input.nextLine();
        if (in.toLowerCase().equals("dolls") || in.toLowerCase().equals("creepy dolls")){
            horror++;
        }
        else if(in.toLowerCase().equals("guns") || in.toLowerCase().equals("awesome guns")){
            action++;
        }
        else if(in.toLowerCase().equals("exit"))
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
}