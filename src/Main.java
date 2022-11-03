import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       String input = (" ");
       int countVowels;
       while(input.equals("END")==false)
       {
           countVowels= 0;
           System.out.println("Please enter some text");
           input= sc.nextLine();
           for(int i= 0;i<input.length();i++)
           {
               if( input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u' )
               {
                   countVowels++;
               }
           }
           System.out.println("There are " + countVowels +" vowels in "+ input);
       }
    }
}