package practies;

import java.util.Scanner;

import java.util.*;

public class patten1 {

    Scanner sc = new Scanner(System.in);
  int row=sc.nextInt();

    for(
    int i = 0;i<row;i++)
     {
        for (int j = 0; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
