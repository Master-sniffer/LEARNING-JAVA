import java.util.ArrayList;

import java.io.*;
import java.util.*;
import java.util.Scanner; // импорт сканера
import java.util.concurrent.ThreadLocalRandom;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    ArrayList<Integer> Numbers = new ArrayList<Integer>();
    Scanner sc= new Scanner(System.in);

    int rando_number= sc.nextInt();
    int random_number;
    for (int i=0; i<100; i++){
      random_number  = (int)(Math.random() * (rando_number - 0 + 1) + 0);
      //System.out.println(random_number);
      Numbers.add(random_number);
    }

    Bubble Bubbles = new Bubble();
    Bubbles.sort(Numbers);
    System.out.println("\nNext task\n");
    Bubbles.foreach(Numbers);
    System.out.println("\nNext task !\n");
    Choice Choices = new Choice();
    Choices.sort(Numbers);
    System.out.println("\nNext task !\n");
    Choices.foreach(Numbers);
  }
}

