package Event;

import java.util.Scanner;

public class SourceEvent {
   public static void main(String[] args) {
    ScoreSource s1 = new ScoreSource();
    Subscriber r1 = new Subscriber();
    Subscriber r2 = new Subscriber();
    
    s1.addScoreListener(r1);
    s1.addScoreListener(r2);

     Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Score ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            s1.setScoreLine(input);
        }

        scanner.close();
   }
}
