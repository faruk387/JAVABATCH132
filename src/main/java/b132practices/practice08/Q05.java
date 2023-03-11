package b132practices.practice08;

import java.util.Scanner;

public class Q05 {
    /*
  Take the number of rows from user and print on console the shape based on rows.

                 *
                * *
               * * *
              * * * *
             * * * * *
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row number");
        int row = scanner.nextInt();
        for(int i=0;i<row;i++){//row control
            for(int space=row-i;space>1;space--){
                System.out.print(" ");

            }

            for(int j=0;j<=i;j++){//column control
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
