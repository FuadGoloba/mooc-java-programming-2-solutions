import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = this.scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            this.processCommand(command);
        }

    }

    public void processCommand(String command) {
        if (command.equals("add")) {
            this.add();
        }
        if (command.equals("list")) {
            this.list();
        }
        if (command.equals("remove")) {
            this.remove();
        }
    }

    public void add() {
        System.out.println("To add: ");
        String task = this.scanner.nextLine();
        this.todoList.add(task);
    }

    public void list() {
        this.todoList.print();
    }

    public void remove() {
        System.out.println("Which one is removed? ");
        int taskId = Integer.valueOf(this.scanner.nextLine());
        this.todoList.remove(taskId);
    }
}
