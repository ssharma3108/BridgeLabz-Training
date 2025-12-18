public class PenDistribution {
  public static void main(String[] args) {
    int pen = 14;
    int student = 3;

    // calculate the no. of pens for each student
    int perStudent = pen / student;
    int remPens = pen % student;

    // print the result
    System.out.println("The Pen Per Student is " + perStudent + " and the remaining pen not distributed is " + remPens);

  }

}
