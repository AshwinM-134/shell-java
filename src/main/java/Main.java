import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("$ ");
            if (!sc.hasNextLine()) {
                break;
            }
            String input = sc.nextLine();
            String command = input.split(" ", 2)[0];

            if (command.equals("exit")) {
                break;
            } else if (command.equals("echo")) {
                if (input.length() > 4) {
                    System.out.println(input.substring(5));
                } else {
                    System.out.println();
                }
                continue;
            } else if (command.equals("type")) {
                String commandToCheck = input.length() > 5 ? input.substring(5) : "";
                if (commandToCheck.equals("echo") || commandToCheck.equals("exit") || commandToCheck.equals("type")) {
                    System.out.println(commandToCheck + " is a shell builtin");
                } else {
                    System.out.println(commandToCheck + ": not found");
                }
                continue;
            }
            System.out.println(command + ": command not found");
        }
    }
}
