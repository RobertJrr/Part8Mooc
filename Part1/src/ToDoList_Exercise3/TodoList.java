package ToDoList_Exercise3;

import java.util.ArrayList;
public class TodoList {

    //list of chores
    private ArrayList<String> chores;

    public TodoList(){
        chores = new ArrayList<>();
    }

    //add chore to the list
    public void addChore(String chore){
        chores.add(chore);
    }

    public void printChores(){
        //public void print exercises
        int i = 1;
        for(String chore : chores){
            System.out.println(i + ": " + chore);
            i++;
        }
    }

    //remove the task
    public void remove(int number){
        if(number <= chores.size() && number > 0){
            int removeNum = number -1;
            chores.remove(removeNum);
        }else{
            System.out.println("Task number does not exist");
        }
    }





}
