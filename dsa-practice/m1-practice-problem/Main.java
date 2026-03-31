import java.util.*;

class NetworkValidator {

  //check for ip
    public boolean validateIdentifier(String input) {
      String regex="^[0-9a-fA-F]{4}:[0-9a-fA-F]{4}:[0-9a-fA-F]{4}:[0-9a-fA-F]{4}:[0-9a-fA-F]{4}:[0-9a-fA-F]{4}:[0-9a-fA-F]{4}:[0-9a-fA-F]{4}";
      String mac="^[1-6A-F]{2}:[1-6A-F]{2}:[1-6A-F]{2}:[1-6A-F]{2}:[1-6A-F]{2}:[1-6A-F]{2}";
      if(!input.matches(regex) && !input.matches(mac)){
        return false;
      }

      return true;

    }
}

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        NetworkValidator validator = new NetworkValidator();

        for (int i = 0; i < n; i++) {

            String input = sc.nextLine();
            String [] str=input.split("::");
            String ip6=str[0];
            String mac=str[1];

            boolean result = validator.validateIdentifier(input);

            if (result) {
                System.out.println("AUTHENTIC DEVICE");
            } else {
                System.out.println("REJECTED DEVICE");
            }
        }

        sc.close();
    }
}