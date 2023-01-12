package testpingjava;

import java.util.Scanner;

public class ExerciseWhileLoop3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double money_need = Double.parseDouble(scanner.nextLine());
        double cash = Double.parseDouble(scanner.nextLine());

        int spendingcounter = 0;
        int days = 0;

        while(money_need>cash && spendingcounter<5){
            String action = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            days += 1;
            if(action.equals("save")){
                cash += money;
                spendingcounter = 0 ;
            } else if(action.equals("spend")){
                cash -= money;
                spendingcounter += 1;
                if(cash<0){
                    cash = 0;
                }
            }
        }

        if(spendingcounter == 5){
            System.out.println("You can't save the money.");
            System.out.println(days);
        }
        if(cash >= money_need){
            System.out.printf("You saved the money for %d days.", days);
        }
    }
}
