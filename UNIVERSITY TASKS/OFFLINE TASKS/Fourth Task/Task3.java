import java.io.*;
import java.util.*;
import java.util.Scanner; // импорт сканера
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.IntConsumer;
import javax.swing.JFrame;


class Task3 {

  Task3(){
    int min=0;
    double max=10.0;
    double var=0;

    ArrayList<Double> Numbers = new ArrayList<Double>();

    for (double i=0 ; i<max; i=i+0.001){
      var = Math.cos(Math.pow(i, 5)) + Math.pow(i,4) -345.3 * i - 23 ;
      //System.out.println(var); // убери первые скобки, чтобы офигеть
      Numbers.add(var);
    }

  }
}
