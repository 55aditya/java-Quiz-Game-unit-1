import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ==========================================
        //  ADITYA - USER REGISTRATION
        // ==========================================
        System.out.println("===== JAVA QUIZ GAME =====");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Welcome " + name + "!");
        System.out.println();

        sc.close();
    }
}