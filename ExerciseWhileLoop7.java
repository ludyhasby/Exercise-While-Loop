package testpingjava;

import java.util.Scanner;

public class ExerciseWhileLoop7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int spaces = width*length*height;
        int sum = 0;

        String cubic = scanner.nextLine();
        while(!cubic.equals("Done")){
            int cubica = Integer.parseInt(cubic);
            sum += cubica;
            if(sum>spaces){
                System.out.printf("No more free space! You need %d Cubic meters more.", sum-spaces);
                break;
            }
            cubic = scanner.nextLine();
        }
        if(cubic.equals("Done")){
            System.out.printf("%d Cubic meters left.", Math.abs(spaces-sum));
        }
    }
}
