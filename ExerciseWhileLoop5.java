package testpingjava;

import java.util.Scanner;

public class ExerciseWhileLoop5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double amount = Double.parseDouble(scanner.nextLine());
        int coin = 0;
        double tambahan = 0.0;
        if(amount>= 2){
            coin += Math.floor(amount/2);;
            amount = amount%2 + 0.000001;
        }
        if(amount>=1 && amount<2){
            coin += Math.floor(amount/1);
            amount = amount%1+ 0.000001;
        }
        if(amount>=0.5 && amount<1){
            coin += Math.floor(amount/0.5);
            amount = amount%0.5+ 0.000001;
        }
        if(amount>=0.2 && amount<0.5){
            coin += Math.floor(amount/0.2);
            amount = amount%0.2+ 0.000001;
        }
        if(amount>=0.1 && amount<0.2){
            coin += Math.floor(amount/0.1);
            amount = amount%0.1+ 0.000001;
        }
        if(amount>=0.05 && amount<0.1){
            coin += Math.floor(amount/0.05);
            amount = amount%0.05+ 0.000001;
        }
        if(amount>=0.02 && amount<0.05){
            coin += Math.floor(amount/0.02);
            amount = amount%0.02+ 0.000001;
        }
        if(amount<0.02&&amount>0.0098){
            coin += 1;
        }
        System.out.println(coin);
    }
}
