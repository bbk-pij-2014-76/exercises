import java.util.ArrayList;
import java.util.List;

public class Anagram
{

    public static ArrayList<String> findAnagram (String string)
    {
        String output = "";
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < string.length(); i++)
        {
            String firstAlphabet = "" + string.charAt(i);
            String restString = "" + string.substring(0,i)+string.substring(i+1,string.length());
            List<String> restOfList = new ArrayList<String>();;
            if (restOfList.size()==1)
                restOfList.add(restString);
            else
                restOfList = findAnagram (restString);
            for (int j=0;j < restOfList.size();j++)
            {
                output = "" + string.charAt(i)+restOfList.get(j);
                list.add(output);
            }
        }
        return(list);
    }
}