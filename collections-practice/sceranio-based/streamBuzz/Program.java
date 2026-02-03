package streamBuzz;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class Program {

  public static List<CreatorStats> engagementBoard;

  // register creator
  public void registerCreator(CreatorStats record) {
    engagementBoard.add(record);
  }

  // count likes
  public Dictionary<String, Integer> getTopCounts(List<CreatorStats> records, double likeThreshold) {

    for (CreatorStats creatorStats : records) {
      double[] likes = creatorStats.getWeeklyLikes();

      for (double like : likes) {
        if (like >= likeThreshold) {
          System.out.println(
              "Creator Name -: " + creatorStats.getName() +
                  " Creator Likes -: " + like);
        }
      }
    }

    return new Hashtable<>();
  }

  // average likes
  public double calculateAverageLikes() {

    double average = 0;

    for (CreatorStats creatorStats : engagementBoard) {
      double[] likes = creatorStats.getWeeklyLikes();

      for (double d : likes) {
        average += d;
      }
    }

    return average / 4;

  }

}
