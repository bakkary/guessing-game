import java.util.Scanner;

public class HumanGuesser {

    private static final Scanner scanner = new Scanner(System.in);
    private String name;


















public String getName(){
    if(name !=null) {

        return name;
    }
        System.out.println("thinker please enter your name:");
        name = scanner.nextLine();
        return name;
}


    public void newGame(int min, int max, String opponent)
    {
        System.out.println("A new game is about to start. You are the guesser.");
        System.out.println("You are plaing against " + opponent + ".");
        System.out.println("The range is from " + min + " to " + max + ".");
        System.out.println("Press ENTER when ready.");
        scanner.nextLine();
    }
}
