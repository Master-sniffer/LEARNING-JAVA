import java.io.*;
import java.util.*;
import java.util.Scanner; // импорт сканера
import java.util.concurrent.ThreadLocalRandom;


class Main {
  public static void main(String[] args) {
    System.out.println("Hello, user !\nGive me your number and i will count from 0 to ur number !\n");
    Scanner sc= new Scanner(System.in);
    int r= sc.nextInt();
    task1(r);
    System.out.print("\nNext task\nEnter the num which will be the ending factor in Random\n");
    ArrayList<Integer> Numbers = new ArrayList<Integer>();
    int a =0;
    int random_number= sc.nextInt();
    for (int i=0; i<100000000; i++){
      random_number = ThreadLocalRandom.current().nextInt(a, random_number + 1);
      System.out.println(random_number);
      Numbers.add(random_number);
    }
  }

  static private int task1 (int r){
    if (r==0){
      System.out.println(r +"\nThat's it for today folks !");
      return 1;
    }
    else {
      System.out.println(r);
    }
    return task1(r-1);
  }

}
