import java.util.Calendar;

import java.io.*;
import java.io.*;
import java.util.*;
import java.util.Scanner; // импорт сканера
import java.util.concurrent.ThreadLocalRandom;

class Main {
  public static void main(String[] args) {
    System.out.println("How many seconds ?");
    Scanner sc= new Scanner(System.in);
    int r= sc.nextInt();
    r=r*1000;
    Date date = new Date();
    System.out.println(date);
    time TIM = new time ();
    TIM.time(r);

  }
  
}
