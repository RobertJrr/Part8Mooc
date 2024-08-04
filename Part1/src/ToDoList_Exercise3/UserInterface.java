package ToDoList_Exercise3;

import java.util.Scanner;

class UserInterface {

    private Scanner scanner;
    private TodoList list;

    public UserInterface(Scanner scanner, TodoList list){
        this.scanner = scanner;
        this.list = list;
    }

    //begin text userinterface
    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if(command.equalsIgnoreCase("stop")){
                break;
            } else if(command.equalsIgnoreCase("add")){
                System.out.print("To add: ");
                String task = scanner.nextLine();
                list.addChore(task);
            } else if(command.equalsIgnoreCase("list")){
                list.printChores();
            } else if(command.equalsIgnoreCase("remove")){
                System.out.println("Which task to remove: ");
                int choreNumber = Integer.parseInt(scanner.nextLine());
                list.remove(choreNumber);
            }else{
                System.out.println("Command does not exist");
            }
        }
    }
}

