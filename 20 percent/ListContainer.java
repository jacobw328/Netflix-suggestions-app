import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
/**
 * Write a description of class ListContainer here.
 * 
 * @author Jacob Wagner 
 * @version (a version number or a date)
 */
public class ListContainer
{
    public static ArrayList<String> Comedy(){
        ArrayList<String> ary = new ArrayList<String>();
        ary.add("The Interview");
        ary.add("Talladega Nights");
        ary.add("White Chicks");
        ary.add("The Cobbler");
        ary.add("Kangaroo Jack");
        ary.add("Kevin Hart Seriously Funny");
        ary.add("The Benchwarmers");
        ary.add("Are We Done Yet");
        ary.add("Bad Grandpa.5");
        ary.add("The Starving Games");
        ary.add("Meet the Fockers");
        ary.add("Meet the Parents");
        ary.add("Chicken Little");
        ary.add("Home");
        ary.add("Groundhog Day");
        ary.add("Pee-Wee's Big Holiday");
        ary.add("Black Sheep");
        ary.add("Big Daddy");
        ary.add("Daddy Day Care");
        ary.add("Smosh the Movie");
        ary.add("Anger Management");
        ary.add("A League of their Own");
        ary.add("Kingpin");
        ary.add("Tommy Boy");
        ary.add("Chris Tucker Live");
        return ary;
    }

    public static ArrayList<String> Drama(){
        ArrayList<String> ary = new ArrayList<String>();
        ary.add("Forrest Gump");
        ary.add("SnowPiercer");
        ary.add("The Shawshank Redemption");
        ary.add("E.T.");
        ary.add("Silver Linings Playbook");
        ary.add("Kilo Two Bravo");
        ary.add("First Response");
        ary.add("Good Will Hunting");
        ary.add("Little Boy");
        ary.add("My Girl");
        ary.add("The Boy in the Striped Pajamas");
        ary.add("Lee Daniel's the Butler");
        ary.add("Full Metal Jacket");
        ary.add("Freedom");
        ary.add("Supremacy");
        ary.add("Promised Land");
        ary.add("Black Hawk Down");
        ary.add("To Kill a Mocking Bird");
        ary.add("Cold Deck");
        return ary;
    }

    public static ArrayList<String> Classics(){
        ArrayList<String> ary = new ArrayList<String>();
        ary.add("Grease");
        ary.add("Robin Hood");
        ary.add("To Kill a Mocking Bird");
        ary.add("Fantasia");
        ary.add("Where the Red Fern Grows");
        ary.add("My Side of the Mountain");
        ary.add("Valley of the Dolls");
        ary.add("Young Mr. Lincoln");
        ary.add("Come Drink With Me");
        ary.add("The Daughter of Dawn");
        ary.add("Detroit 9000");
        ary.add("Heroes of the East");
        ary.add("House on Telegraph Hill");
        ary.add("Dressed to Kill");
        return ary;
    }

    public static ArrayList<String> Action(){
        ArrayList<String> ary = new ArrayList<String>();
        ary.add("2 Fast 2 Furious");
        ary.add("The Mummy");
        ary.add("Snowpiercer");
        ary.add("Pirates of the Caribbean");
        ary.add("Transporter 3");
        ary.add("Hot Fuzz");
        ary.add("Inglorious Bastards");
        ary.add("16 Blocks");
        ary.add("Black Hawk Down");
        ary.add("The November Man");
        ary.add("Seal Team Six");
        ary.add("Tears of the Sun");
        ary.add("Kill Bill");
        ary.add("Scarface");
        return ary;
    }

    public static ArrayList<String> Horror(){
        ArrayList<String> ary = new ArrayList<String>();
        ary.add("Curse of Chucky");
        ary.add("The Human Centipede");
        ary.add("Anguish");
        ary.add("The Lazarus Effect");
        ary.add("Stitches");
        ary.add("Dead Silence");
        ary.add("Oculus");
        ary.add("The Ouija Experiment");
        ary.add("Devil");
        ary.add("The Chosen");
        ary.add("At the Devil's Door");
        ary.add("Hansel & Gretel");
        ary.add("Haunting of Silver Falls");
        ary.add("The Hollow");
        return ary;
    }

    public static ArrayList<String> Sports(){
        ArrayList<String> ary = new ArrayList<String>();
        ary.add("The Challenger");
        ary.add("Talladega Nights");
        ary.add("Goon");
        ary.add("Iverson");
        ary.add("Pumping Iron");
        ary.add("Major League");
        ary.add("1000 to 1");
        ary.add("Undisputed");
        ary.add("Generation Iron");
        ary.add("The Gabby Douglas");
        ary.add("Champs");
        ary.add("Radio");
        ary.add("4 Minute Mile");
        ary.add("Underdogs");
        ary.add("Undefeated");
        ary.add("The Price of Gold");
        ary.add("Once in a Lifetime");
        return ary;
    }

    public static ArrayList<String> Musicals(){
        ArrayList<String> ary = new ArrayList<String>();
        ary.add("Sing it On");
        ary.add("9 Muses of Star Empire");
        ary.add("Reincarnated");
        ary.add("Marley");
        ary.add("This Was Tomorrow");
        ary.add("Kurt & Courtney");
        ary.add("Journey");
        ary.add("Muscle Shoals");
        ary.add("Sufi Soul");
        ary.add("Backstreet Boys");
        ary.add("The Life of Riley");
        ary.add("Backstage");
        ary.add("Flamenco Flamenco");
        ary.add("Mercedes Sosa");
        ary.add("Neil Young: Heart of Gold");
        ary.add("The Gospel Road");
        return ary;
    }

    public static ArrayList<String> Scifi(){
        ArrayList<String> ary = new ArrayList<String>();
        ary.add("Deep Impact");
        ary.add("E.T.");
        ary.add("Contact");
        ary.add("Timeline");
        ary.add("Stardust");
        ary.add("Underworld Evolution");
        ary.add("Echo");
        ary.add("Forward unto Dawn");
        ary.add("Circle");
        ary.add("Impostor");
        ary.add("The Colony");
        ary.add("Zathura");
        ary.add("Diablolical");
        ary.add("Extraterrestrial");
        return ary;
    }
    
    public static ArrayList<String> get(String name){
        switch(name){
            case"comedy":
            return Comedy();
            case"classics":
            return Classics();
            case"drama":
            return Drama();
            case"horror":
            return Horror();
            case"sport":
            return Sports();
            case"scifi":
            return Scifi();
            case"musicals":
            return Musicals();
            case"action":
            return Action();
            default:
            return null;
        } 
    }
}