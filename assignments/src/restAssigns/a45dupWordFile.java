package restAssigns;
import java.io.*;   //File, iOException, and PrintStream
import java.util.*;
import java.util.regex.Pattern;

public class a45dupWordFile
{
    public static void main(String args[])
    {
        //map to get the details in a map
        Map<String, Integer> mapTxt = buildWordMap("assignments/src/restAssigns/StudentDetails.txt");
            //list the form
        List<Map.Entry<String, Integer>> list = sortByValueInDecreasingOrder(mapTxt);
        System.out.println(" ");
            //for each
        for (Map.Entry<String, Integer> entry : list)
        {
            if (entry.getValue() > 1)
            {
                System.out.println("Word: "+ entry.getKey() + "\nCount:  " + entry.getValue());
            }
        }
    }

    public static Map<String, Integer> buildWordMap(String fileName) {
        Map<String, Integer> mapText = new HashMap<>();
        String line = null;
        try
                (FileInputStream file = new FileInputStream(fileName);
                 DataInputStream input = new DataInputStream(file);
                 BufferedReader br = new BufferedReader(new InputStreamReader(input)))
        {
            Pattern pattern = Pattern.compile("\\s+");

            while ((line = br.readLine()) != null )
        {
            line = line.toLowerCase();
            String[] words = pattern.split(line);
            for (String word : words)
            {
                if (mapText.containsKey(word))
                {
                    mapText.put(word, (mapText.get(word) + 1));
                }
                else
                {
                    mapText.put(word, 1);
                }
            }
        }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return mapText;
    }
    public static List<Map.Entry<String, Integer>> sortByValueInDecreasingOrder(Map<String, Integer> mapText)
    {
        Set<Map.Entry<String, Integer>> entries = mapText.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<>(entries);
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>()
        {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        return list;
    }
}
