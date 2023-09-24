import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todoList;

    public TodoList() {
        this.todoList = new ArrayList<>();
    }

    public void add(String task) {
        this.todoList.add(task);
    }

    public void print() {
        for (int index = 0; index < this.todoList.size(); index++) {
            System.out.println(index + 1 + ": " + todoList.get(index));
        }
    }

    public void remove(int number) {
        if (number < this.todoList.size()) {
            this.todoList.remove(number - 1);
        }
    }
}