import java.util.Scanner;

public class Game_Logic {
    public Game_Logic(){

    }

    public void waitforCommand() {

        System.out.println("Was möchtest Du machen?");
        Scanner sc = new Scanner(System.in);
        String com = sc.nextLine();

        String[] words = com.split(" ");
        processCommand(words);
    }

    public void processCommand(String[] x) {
        
    }
}