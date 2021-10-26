import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string");
        String input=scan.next();
        String ans=containsAllLetters(input)?"Contains all letters":"Doesnot contain all letters";
        System.out.println(ans);
    }
    public static boolean containsAllLetters(String input)
    {
        HashSet<Character>set=new HashSet<Character>();
        input=input.toLowerCase(Locale.ROOT);
        for(int i=0;i<input.length();i++)
        {
            char c=input.charAt(i);
            if( (c>='a' && c<='z') || (c>='A' && c<='Z'))
                set.add(c);
        }

        return set.size()==26;
    }
}
/*
time and space complexity:

time complexity : O(N) where N is the number of characters in input string

space complexity : in the worst case, O(1) i,e constant space 26

 */

