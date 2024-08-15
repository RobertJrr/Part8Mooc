package Example2;

import java.util.ArrayList;
import java.util.HashMap;

 class Main {
     public static void main(String[] args) {
         TaskTracker tracker = new TaskTracker();
         tracker.add("Ada",3);
         tracker.add("Ada",3);
         tracker.add("Ada",3);
         tracker.add("Ada",4);

         tracker.add("Pekka",4);
         tracker.add("Pekka",4);

         tracker.add("Matti",1);
         tracker.add("Matti",2);

         tracker.print();

     }
}

class TaskTracker{
     //declaring data field HashMa called completedExercises
     // that stores String keys
    //and List of Integers as Value for each key
     private HashMap<String, ArrayList<Integer>> completedExercises;

     public TaskTracker(){
         this.completedExercises = new HashMap<>();
     }

     public void add(String user,int exercise){
         //an empty list has to be added for a new user
         // if one has not already been added
         this.completedExercises.putIfAbsent(user, new ArrayList<>());

         ///retrieve list containing exercises completed by user and add to it
         //gets list stored in hashmap as value and assigns it to completed (references same thing)
         ArrayList<Integer> completed = this.completedExercises.get(user);
         completed.add(exercise);
     }

     public void print(){
         //iterate through keyset and print exercises for each keyset
         for(String name : this.completedExercises.keySet()){
             System.out.println(name + ": " + this.completedExercises.get(name));
         }
     }


}