package fileBackupScheduler;

import java.sql.*;

public class BackupTask {
  String path;
  Time scheduledTime;
  String priority;

  BackupTask(String path, Time scheduledTime, String priority) {
    this.path = path;
    this.scheduledTime = scheduledTime;
    this.priority = priority;
  }

}
