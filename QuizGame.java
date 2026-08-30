import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // MEMBER 1 - USER REGISTRATION
        System.out.println("===== JAVA QUIZ GAME =====");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Welcome " + name + "!\n");

        // MEMBER 2 - QUESTION AND ANSWER SET
        String q1 = "What is the full form of JVM?";
        String a1 = "Java Virtual Machine";

        String q2 = "Which keyword is used to create a class?";
        String a2 = "class";

        String q3 = "Which data type stores whole numbers?";
        String a3 = "int";

        // MEMBER 3 - OPTION LOGIC
        int score = 0;

        // Question 1
        System.out.println(q1);
        System.out.println("1. Java Virtual Machine");
        System.out.println("2. Java Variable Machine");
        System.out.println("3. Java Visual Machine");
        System.out.println("4. Java Verified Machine");

        System.out.print("Enter option: ");
        int option = sc.nextInt();

        if (option == 1) {
            score++;
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
        }

        // Question 2
        System.out.println("\n" + q2);
        System.out.println("1. new");
        System.out.println("2. class");
        System.out.println("3. object");
        System.out.println("4. create");

        System.out.print("Enter option: ");
        option = sc.nextInt();

        if (option == 2) {
            score++;
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
        }

        // Question 3
        System.out.println("\n" + q3);
        System.out.println("1. float");
        System.out.println("2. char");
        System.out.println("3. int");
        System.out.println("4. boolean");

        System.out.print("Enter option: ");
        option = sc.nextInt();

        if (option == 3) {
            score++;
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
        }

       

        sc.close();
    }
}