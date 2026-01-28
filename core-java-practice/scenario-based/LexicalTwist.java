import java.util.HashSet;
import java.util.Scanner;

public class LexicalTwist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first word -: ");
        String w1 = sc.next();
        System.out.print("Enter the second word -: ");
        String w2 = sc.next();

        StringBuilder result = new StringBuilder();

        StringBuilder str1 = new StringBuilder(w1);
        StringBuilder str2 = new StringBuilder(w2);

        HashSet<Character> hv=new HashSet<>();
        HashSet<Character> hc=new HashSet<>();

        str2.reverse();
        if (str2.toString().equals(str1.toString())) {
            str1.reverse();
            //for reverse the first word.............
            for (int i = 0; i < str1.length(); i++) {
                result.append(str1.charAt(i));
            }
            String finalResult =
                    result.toString().toLowerCase().replaceAll("[aeiou]", "@");
            System.out.println(finalResult);
        }else {
            //combine first and second word
           String s=(w1+w2).toUpperCase();
           int cv=0,cc=0;

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == 'A' || ch == 'E' || ch == 'I'|| ch == 'O' || ch == 'U') {
                    hv.add(ch);
                    cv++;
                }else{
                    hc.add(ch);
                    cc++;
                }
            }
            if(cc==cv){
                System.out.println("Vowels And Consonets are equal.");
            }else if(cv>cc){
                System.out.println("The first vowel is "+hv.toArray()[0]+" and the second vowel is "+hv.toArray()[1]);
            }else {
                System.out.println("The first Consonent is "+hc.toArray()[0]+" and the second vowel is "+hc.toArray()[1]);
            }


        }


    }
}
