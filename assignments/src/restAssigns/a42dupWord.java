package restAssigns;

import java.util.Scanner;

public class a42dupWord {
    static void dup(String sentence)
    {
        int count;
        sentence = sentence.toLowerCase();
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++)
        {
            count = 1;
            for (int j = i + 1; j < words.length; j++)
            {
                if (words[i].equals(words[j])) {
                    count++;
                    //Set words[j] to 0 to avoid printing visited word
                    words[j] = "0";
                }
            }

            //Displays the duplicate word if count is greater than 1
            if (count > 1 && !words[i].equals("0")) {
                System.out.println("\nWord: " + words[i]);
                System.out.println("Found Number(s): " + count);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String sentence = in.nextLine();
        System.out.println("The duplicate word(s) in the given sentence: ");
        dup(sentence);
    }
}