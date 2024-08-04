package ToDoList_Exercise3;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        TodoList list = new TodoList();
        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(scanner,list);
        ui.start();
    }
}
