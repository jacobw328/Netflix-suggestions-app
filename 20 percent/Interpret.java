import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
/**
 * Write a description of class Interpret here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Interpret
{
    private ArrayList movie = new ArrayList();
    Personality f;
    private static Scanner input = new Scanner(System.in);
    String[] name = new String[8];
    String[] name2 = new String[6];
    boolean[] cat = new boolean[8];
    boolean[] cat2 = new boolean[6];
    /**
     * Constructor for objects of class Interpret
     */
    public Interpret(Personality j)
    {
        if(j.count() == 4){
            name[0] = "Comedy";
            name[1] = "Drama";
            name[2] = "Act";
            name[3] = "Horror";
            name[4] = "Classics";
            name[5] = "Musicals";
            name[6] = "Sports";
            name[7] = "Sci-fi";
            for(int x = 0; x < cat.length; x++){
                cat[x] = false;
            }
            f=j;
            if(j.com)cat[0] = true;
            if(j.hor)cat[3] = true;
            if(j.dram)cat[1] = true;
            if(j.act)cat[2] = true;
            if(j.clas)cat[4] = true;
            if(j.mus)cat[5] = true;
            if(j.sport)cat[6] = true;
            if(j.sci)cat[7] = true;

            System.out.println("You have four topics that you preferred over the other topics:");
            if(cat[0])System.out.println("Comedy");
            if(cat[1])System.out.println("Drama");
            if(cat[2])System.out.println("Action");
            if(cat[3])System.out.println("Horror");
            if(cat[4])System.out.println("Classics");
            if(cat[5])System.out.println("Musicals");
            if(cat[6])System.out.println("Sports");
            if(cat[7])System.out.println("Sci-fi");
            System.out.println("Would you like four lists of movies corresponding to these categories, would you like to view lists of 2 categories of your choice, or would you like to choose one category and view that list?");
            System.out.println("HINT: Type 'four', 'two', or 'one'");
            String in = input.nextLine();
            if(in.toLowerCase().equals("four")){
                if(cat[0])            for(String str :ListContainer.get("comedy")) System.out.println(str);
                if(cat[1])            for(String str :ListContainer.get("drama")) System.out.println(str);
                if(cat[2])            for(String str :ListContainer.get("action")) System.out.println(str);
                if(cat[3])            for(String str :ListContainer.get("horror")) System.out.println(str);
                if(cat[4])            for(String str :ListContainer.get("scifi")) System.out.println(str);
                if(cat[5])            for(String str :ListContainer.get("classics")) System.out.println(str);
                if(cat[6])            for(String str :ListContainer.get("musicals")) System.out.println(str);
                if(cat[7])            for(String str :ListContainer.get("sport")) System.out.println(str);
            }
            else if(in.toLowerCase().equals("two")){
                System.out.println("Name one category");
                in = input.nextLine();
                String x = in.toLowerCase();
                System.out.println("Name the other one");
                String y = in.toLowerCase();
                ListContainer.get(x);
                ListContainer.get(y);
            }
            else if(in.toLowerCase().equals("one")){
                System.out.println("Name the category that you want to see");
                in = input.nextLine();
                ListContainer.get(in);
            }
            else if(in.toLowerCase().equals("exit")){
                System.exit(1);
            }
            else{
            }
        }
        else{
            name2[0] = "Comedy";
            name2[1] = "Drama";
            name2[2] = "Act";
            name2[3] = "Horror";   
            name2[4] = "Sports";
            name2[5] = "Sci-fi";
            for(int x = 0; x < cat.length; x++){
                cat[x] = false;
            }
            if(j.com)cat[0] = true;
            if(j.hor)cat[3] = true;
            if(j.dram)cat[1] = true;
            if(j.act)cat[2] = true;
            if(j.clas)cat[4] = true;
            if(j.mus)cat[5] = true;
            if(j.sport)cat[6] = true;
            if(j.sci)cat[7] = true;
            f=j;

            System.out.println("You have three topics that you preferred over the other topics:");
            if(cat[0])System.out.println("Comedy");
            if(cat[1])System.out.println("Drama");
            if(cat[2])System.out.println("Action");
            if(cat[3])System.out.println("Horror");
            if(cat[6])System.out.println("Sports");
            if(cat[7])System.out.println("Sci-fi");
            System.out.println("Would you like the lists of all the movies for all three topics, two of the three topics, or just one topic?");
            System.out.println("Hint: Type 'three', 'two', or 'one'");
            String in = input.nextLine();
            if(in.toLowerCase().equals("three")){
                if(cat[0])            for(String str :ListContainer.get("comedy")) System.out.println(str);
                if(cat[1])            for(String str :ListContainer.get("drama")) System.out.println(str);
                if(cat[2])            for(String str :ListContainer.get("action")) System.out.println(str);
                if(cat[3])            for(String str :ListContainer.get("horror")) System.out.println(str);
                if(cat[6])            for(String str :ListContainer.get("sport")) System.out.println(str);
                if(cat[7])            for(String str :ListContainer.get("scifi")) System.out.println(str);
            }
            else if(in.toLowerCase().equals("two")){
                System.out.println("Type the first category you want");
                String x = in.toLowerCase();
                System.out.println("Now type the second one");
                String y = in.toLowerCase();
                for(String str :ListContainer.get(x)) System.out.println(str);
                for(String str :ListContainer.get(y)) System.out.println(str);
            }
            else if(in.toLowerCase().equals("one")){
                System.out.println("Which category?");
                for(String str :ListContainer.get(in.toLowerCase())) System.out.println(str);               
            }
            else if(in.toLowerCase().equals("exit")){
                System.exit(1);
            }
            else{

            }
        }
    }

    private void ComVSAct(){
        String in = input.nextLine();
        System.out.println("Ok, would you rather watch a comedy or an action movie?");
        if(in.toLowerCase().equals("comedy")){
            cat[0] = true;
        }
        else if(in.toLowerCase().equals("action")){
            cat[2] = true; 
        }
        else if(in.toLowerCase().equals("exit")){
            System.exit(1);
        }
        else{
            System.out.println("I do not understand that command, try again");
            ComVSAct();
        }
    }

    private void ComVSHor(){
        String in = input.nextLine();
        System.out.println("Ok, would you rather watch a comedy or a horror movie?");
        if(in.toLowerCase().equals("comedy")){
            cat[0] = true;

        }
        else if(in.toLowerCase().equals("horror")){
            cat[3] = true; 

        }
        else if(in.toLowerCase().equals("exit")){
            System.exit(1);
        }
        else{
            System.out.println("I do not understand that command, try again");
            ComVSHor();
        }
    }

    private void DramVSAct(){
        String in = input.nextLine();
        System.out.println("Ok, would you rather watch a drama or an action movie?");
        if(in.toLowerCase().equals("drama")){
            cat[1] = true;

        }
        else if(in.toLowerCase().equals("action")){
            cat[2] = true; 

        }
        else if(in.toLowerCase().equals("exit")){
            System.exit(1);
        }
        else{
            System.out.println("I do not understand that command, try again");
            DramVSAct();
        }
    }

    private void DramVSHor(){
        String in = input.nextLine();
        System.out.println("Ok, would you rather watch a drama or a horror movie?");
        if(in.toLowerCase().equals("drama")){
            cat[1] = true;

        }
        else if(in.toLowerCase().equals("horror")){
            cat[3] = true; 

        }
        else if(in.toLowerCase().equals("exit")){
            System.exit(1);
        }
        else{
            System.out.println("I do not understand that command, try again");
            DramVSHor();
        }
    }

    private void ClassVSSport(){
        String in = input.nextLine();
        System.out.println("Ok, would you rather watch a classic or a sports movie?");
        if(in.toLowerCase().equals("classic")){
            cat[4] = true;
        }
        else if(in.toLowerCase().equals("sports")){
            cat[6] = true; 
        }
        else if(in.toLowerCase().equals("exit")){
            System.exit(1);
        }
        else{
            System.out.println("I do not understand that command, try again");
            ClassVSSport();
        }
    }

    private void ClassVSSci(){
        String in = input.nextLine();
        System.out.println("Ok, would you rather watch a classic or a sci-fi movie?");
        if(in.toLowerCase().equals("classic")){
            cat[4] = true;
        }
        else if(in.toLowerCase().equals("sci-fi")){
            cat[7] = true; 
        }
        else if(in.toLowerCase().equals("exit")){
            System.exit(1);
        }
        else{
            System.out.println("I do not understand that command, try again");
            ClassVSSci();
        }
    }

    private void MusVSSport(){
        String in = input.nextLine();
        System.out.println("Ok, would you rather watch a musical or a sports movie?");
        if(in.toLowerCase().equals("musical")){
            cat[5] = true;
        }
        else if(in.toLowerCase().equals("sports")){
            cat[6] = true; 
        }
        else if(in.toLowerCase().equals("exit")){
            System.exit(1);
        }
        else{
            System.out.println("I do not understand that command, try again");
            MusVSSport();
        }
    }

    private void MusVSSci(){
        String in = input.nextLine();
        System.out.println("Ok, would you rather watch a musical or a sci-fi movie?");
        if(in.toLowerCase().equals("musical")){
            cat[5] = true;
        }
        else if(in.toLowerCase().equals("sci-fi")){
            cat[7] = true; 
        }
        else if(in.toLowerCase().equals("exit")){
            System.exit(1);
        }
        else{
            System.out.println("I do not understand that command, try again");
            MusVSSci();
        }
    }
}
