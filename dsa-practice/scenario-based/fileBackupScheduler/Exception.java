package fileBackupScheduler;

class InvalidBackupPathException extends Exception {
  public InvalidBackupPathException(String s) {
    super(s);
  }
}
