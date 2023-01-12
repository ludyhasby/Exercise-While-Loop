package testpingjava;

import java.util.Scanner;

public class ExerciseWhileLoop1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String search_for = scanner.nextLine();
        String book = scanner.nextLine();
        int book_num = 0;

        while(!book.equals("No More Books")){
            book_num += 1;
            if(book.equals(search_for)){
                System.out.printf("You checked %d books and found it.", book_num-1);
                break;
            }
            book = scanner.nextLine();
        }
        if(book.equals("No More Books")){
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", book_num);
        }
    }
}
