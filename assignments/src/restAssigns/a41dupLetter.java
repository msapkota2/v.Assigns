package restAssigns;

import java.util.Scanner;

public class a41dupLetter {
    static void dup(String str)
    {
        char[] ch = str.toCharArray();
        int count;
        System.out.println("Letter      |"+ " Total Number");
        for(int i = 0; i <ch.length; i++)
        {
            count = 1;
            for(int j = i+1; j <ch.length; j++)
            {
                if(ch[i] == ch[j] && ch[i] != ' ')
                {
                    count++;
                    ch[j] = '0';
                }
            }
            if(count > 1 && ch[i] != '0')
            {
                System.out.println(ch[i]+ "               "+count);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = in.nextLine();
        System.out.println("The duplicate letter(s) in the given word: ");
        dup(str);
    }
}