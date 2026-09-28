import java.util.Scanner;

public class AIChatbot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("      AI CHATBOT SYSTEM");
        System.out.println("================================");
        System.out.println("Type 'bye' to exit.");

        while (true) {

            System.out.print("\nYou: ");
            String userInput = sc.nextLine().toLowerCase();

            if (userInput.equals("hello") || userInput.equals("hi")) {
                System.out.println("Bot: Hello! How can I help you?");
            }

            else if (userInput.contains("name")) {
                System.out.println("Bot: My name is Java AI Chatbot.");
            }

            else if (userInput.contains("java")) {
                System.out.println("Bot: Java is a popular programming language.");
            }

            else if (userInput.contains("college")) {
                System.out.println("Bot: College life is a great time to learn new skills.");
            }

            else if (userInput.contains("internship")) {
                System.out.println("Bot: Internships help you gain practical experience.");
            }

            else if (userInput.contains("time")) {
                System.out.println("Bot: Sorry, I cannot check real time right now.");
            }

            else if (userInput.equals("bye")) {
                System.out.println("Bot: Goodbye! Have a nice day.");
                break;
            }

            else {
                System.out.println("Bot: Sorry, I don't understand that.");
            }
        }

        sc.close();
    }
}
