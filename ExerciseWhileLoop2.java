package testpingjava;

import java.util.Scanner;

public class ExerciseWhileLoop2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int unsatis = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        double counter_grade =0;
        double sum = 0;
        String task_name = scanner.nextLine();
        String task_name2 = "";
        while(!task_name.equals("Enough")){
            task_name2 = task_name;
            int grade = Integer.parseInt(scanner.nextLine());
            counter_grade += 1;
            sum += grade;

            if(grade<=4){
                counter += 1;
                if(counter>=unsatis){
                    break;
                }
            }
            task_name = scanner.nextLine();
        }
        if(task_name.equals("Enough")){
            System.out.printf("Average score: %.2f%n", sum/counter_grade);
            System.out.printf("Number of problems: %.0f%n", counter_grade);
            System.out.printf("Last problem: %s", task_name2);
        }
        else{
            System.out.printf("You need a break, %d poor grades.", counter);
        }
    }
}
