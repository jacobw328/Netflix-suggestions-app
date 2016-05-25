import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Reads a file and chooses random lines in the word
 */
public class ArrayListMaker
{
    String path;
    ArrayList<String> file;
    String methodName;
    
    public ArrayListMaker(String path, String methodName){
        this.path = path;
        this.methodName = methodName;
        file = new ArrayList<String>();
        readFile();
        for(String str : file)System.out.println(str);
    }

    /**
     *gets the size of the text file
     *@return the size of the original text file
     */
    public int textSize()
    {
        int t = 0;
        try
        {
            FileReader fr = new FileReader(path);
            BufferedReader textReader = new BufferedReader(fr);

            for(int i =0;true;i++)
            {
                String text = textReader.readLine();
                if(text==null
                ||text.trim().equals(""))
                {
                    textReader.close();
                    t = i;
                    break;
                }
                else
                {

                }
            }
        }
        catch(IOException e)
        {
        }
        return t;
    }

    /**
     *reads the file and puts it in an array
     */
    public void readFile()
    {
        String line = null;
        file.add("public static ArrayList<String> " + methodName + "(){");
        file.add("ArrayList<String> ary = new ArrayList<String>();");
        try
        {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            for(int i = 0; i < textSize(); i++)
            {
                line = br.readLine();
                if(line != null) file.add("ary.add(\"" + line.trim() + "\");");
                else break;
            }
            br.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" +
                path + "'");
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '"
                + path + "'");
        }
        file.add("return ary;");
        file.add("}");
    }
}