import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kim
 */
public class UserInterface {
    private Scanner scanner;
    private JokeManager jokes;
    
    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.jokes = jokes;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Commands\n1 - add a joke\n2- draw a joke\n3 - list jokes\nX - stop");
            String command = scanner.nextLine();
            if (command.equals("X")) {
                break;
            } else if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                this.jokes.addJoke(joke);
            } else if (command.equals("2")) {
                System.out.println(this.jokes.drawJoke());
            } else if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                this.jokes.printJokes();
            } else {
                System.out.println("Unknown command");
            }
        }
    }
    
}
