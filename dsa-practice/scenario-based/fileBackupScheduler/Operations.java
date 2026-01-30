package fileBackupScheduler;

import java.util.PriorityQueue;
import java.sql.*;

public class Operations {

  // for add task...
  static void addTask(PriorityQueue<BackupTask> task, String path, Time scheduledTime, String priority) {
    try {

      if (path.contains("invalid")) {
        throw new InvalidBackupPathException("This path is undefined");
      }

      task.offer(new BackupTask(path, scheduledTime, priority));
    } catch (InvalidBackupPathException e) {
      System.out.println(e.getMessage());
    }

  }


  //for view the messages
  


}
