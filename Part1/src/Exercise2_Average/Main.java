package Exercise2_Average;

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        int count = 0;
        while(true){
            int num = Integer.parseInt(scanner.nextLine());
            if(num == 0){
                break;
            }
            if(num < 0){
                continue;
            }
            nums.add(num);
            count++;

        }

        //add all nums
        int total = 0;
        for(Integer ints : nums){
            total += ints;
        }


        if(nums.size() == 0){
            System.out.println("Cannot calculate average");
        } else{
            System.out.println("Average: " + total/ nums.size());
        }

    }
}
