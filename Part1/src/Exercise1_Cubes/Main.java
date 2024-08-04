package Exercise1_Cubes;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter integer: ");
            String input = scanner.nextLine();
            if(input.equalsIgnoreCase("end")){
                break;
            }
            int integer = Integer.parseInt(input);
            System.out.println(Math.pow(integer,3));
        }


    }
}
