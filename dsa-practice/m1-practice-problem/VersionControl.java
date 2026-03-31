import java.util.*;

class Version {
    String versionName;
    int fileSize;

    public Version(String versionName, int fileSize) {
        this.versionName = versionName;
        this.fileSize = fileSize;
    }
}

class FileStorageSystem {

    private Map<String, List<Version>> storage;

    public FileStorageSystem() {
        storage = new HashMap<>();
    }

    public void upload(String fileName, String version, int size) {
        

    }

    public void fetch(String fileName) {
        // print versions sorted by file size then version
    }

    public void latest(String fileName) {
        // print most recently uploaded version
    }

    public void totalStorage(String fileName) {
        // print total storage used
    }
}

public class VersionControl {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        FileStorageSystem system = new FileStorageSystem();

        for (int i = 0; i < n; i++) {

            String line = sc.nextLine();
            String[] parts = line.split(" ");

            String operation = parts[0];

            switch (operation) {

                case "UPLOAD":
                    String fileName = parts[1];
                    String version = parts[2];
                    int size = Integer.parseInt(parts[3]);
                    system.upload(fileName, version, size);
                    break;

                case "FETCH":
                    system.fetch(parts[1]);
                    break;

                case "LATEST":
                    system.latest(parts[1]);
                    break;

                case "TOTAL_STORAGE":
                    system.totalStorage(parts[1]);
                    break;
            }
        }
    }
}