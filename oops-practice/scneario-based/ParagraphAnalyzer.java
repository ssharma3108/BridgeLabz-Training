import java.util.*;
public class ParagraphAnalyzer {
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the paragraph -: ");
    String para=sc.nextLine(); //taking a string para as a input
    System.out.print("Enter the word to replace  -: ");
    String word=sc.next();
    System.out.print("Enter the Replacement Word -: ");
    String replace=sc.next();


    int total =0; //to count the word ..
    String longest=" ";
    int max=Integer.MIN_VALUE;

   String [] str=para.split(" ");


   //for replace the words
   for (int i=0;i<str.length;i++){
      if(str[i].equals(word)){
        str[i]=replace;
      }
   }

for(String s:str){
  System.out.print(s);
}
   System.out.printf("Total number of words in paragraph -: "+str.length);


  }
}
