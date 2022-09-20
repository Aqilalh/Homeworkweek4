import java.util.Scanner;
public class Homework1 {
    /*Prompt a user to enter if they think the temperature is High, Low or Humid
    Based on the user's input print out one of these
    High: print out " sunblock may be needed"
    Low : print out " a coat may be needed"
    Humid: print out " it's muggy!"
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("what does the tempature feel like?");
       String weather = scan.next();
        if (weather.equalsIgnoreCase("High")){
            System.out.println("sunblock may be needed");
        }else if (weather.equalsIgnoreCase("Low")){
            System.out.println(" a coat may be needed");
        }else if (weather.equalsIgnoreCase("Humid")){
            System.out.println(" it's muggy!");
        }
    }
}
