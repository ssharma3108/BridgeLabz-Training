class reverseString{
  public static void main(String [] args){

    String x="shivam";
    String str=""; //this is the empty string in which we have to insert elements in reverse order

    
    for(int i=x.length()-1;i>=0;i--){  //this is an reverse loop
      str+=x.charAt(i); //in this we have to insert elemnt
    }
    System.out.println(str); // this is the final output  in reverse order

  }
}