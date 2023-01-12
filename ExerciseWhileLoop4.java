package testpingjava;

import java.util.Scanner;

public class ExerciseWhileLoop4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String steps = scanner.nextLine();
        int sum = 0;

        while(!steps.equals("Going home")){
            int steps_int = Integer.parseInt(steps);
            sum += steps_int;
            if(sum>=10000){
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", sum-10000);
                break;
            }
            steps = scanner.nextLine();
        }
        if(steps.equals("Going home")){
            sum += Integer.parseInt(scanner.nextLine());
            if(sum>=10000){
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", sum-10000);
            } else{
                System.out.printf("%d more steps to reach goal.", 10000-sum);
            }
        }
    }
}
