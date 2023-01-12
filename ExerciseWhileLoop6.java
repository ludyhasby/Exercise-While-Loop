package testpingjava;

import java.util.Scanner;

public class ExerciseWhileLoop6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        String piece = scanner.nextLine();

        int pieces = length*width;

        while(!piece.equals("STOP")){
            int piece_int = Integer.parseInt(piece);
            pieces -= piece_int;
            if(pieces<0){
                System.out.printf("No more cake left! You need %d pieces more.", pieces*-1);
                break;
            }
            piece = scanner.nextLine();
        }
        if(piece.equals("STOP")){
            System.out.printf("%d pieces are left.", pieces);
        }
    }
}