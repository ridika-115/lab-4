package Source;
import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;
public class JSONreader extends BankAnalyzer{
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try{
            JSONArray a = (JSONArray) parser.parse(new FileReader("C:\\Users\\nazni\\Downloads\\3rd sem\\oop 2\\lab tasks\\lab 4\\lab 4\\src\\Source\\jsonFile.json"));

            //int totalAmount = 0;
            for (Object o : a)
            {
                JSONObject person = (JSONObject) o;

                String date = (String) person.get("date");
                System.out.println(date);

                String amount = (String) person.get("amount");
                System.out.println(amount);

                String description = (String) person.get("description");
                System.out.println(description);

            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
