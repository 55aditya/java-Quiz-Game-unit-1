import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // MEMBER 1 - ADITYA (Registration)
        System.out.println("===== JAVA QUIZ GAME =====");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Welcome " + name + "!\n");

        // ==========================================
        // MEMBER 2 - OM: QUESTION AND ANSWER SET (UPDATED)
        // ==========================================
        String q1 = "What is the full form of JVM?";
        String a1 = "Java Virtual Machine";

        String q2 = "Which keyword is used to create a class?";
        String a2 = "class";

        String q3 = "Which data type stores whole numbers?";
        String a3 = "int";

        System.out.println("Questions loaded successfully!");
        sc.close();
    }
}