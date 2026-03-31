public class SortStudentMarks {
public static void main(String[] args) {
  int [] marks={99,85,100,72,73};

  for (int i = 0; i < marks.length-1; i++) {
    for (int j = 0; j < marks.length-1; j++) {
      if(marks[j]>marks[j+1]){
        int temp=marks[j];
        marks[j]=marks[j+1];
        marks[j+1]=temp;
      }
    }
  }


  for (int i = 0; i < marks.length; i++) {
    System.out.println(marks[i]);
  }
}
}
