import java.util.Scanner;

public class U2L3Runner {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        ChatBot chatBot = new ChatBot();
        chatBot.greeting();
        System.out.print("What would you like to do?  Enter “i” for info, “w” for weather, help for help ");
        String answer = s.nextLine();
        if (answer == "w") {
            chatBot.weather();
        }
        else if (answer == "i") {

        }
    }
}
