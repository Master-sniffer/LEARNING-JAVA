import java.util.Calendar;


import java.io.*;
import java.io.*;
import java.util.*;
import java.util.Scanner; // импорт сканера
import java.util.concurrent.ThreadLocalRandom;
class time {
  public static void time(int r) {
    

      while(r>=0){
          try {
          //ДЕЛАЕМ
          Thread.sleep(3000); //1000 - 1 сек
          r-=3000;
          

      try(FileWriter writer = new FileWriter("file.txt", true))
          {
              System.out.println("HELLO");
              // запись всей строки
              Date date = new Date();
              String text = date.toString();
              text+="\n";
              writer.write(text);
                
              writer.flush();
          }
          catch(IOException ex){
                
              System.out.println(ex.getMessage());
          }  
          } catch (InterruptedException ex) {
          }     
  }
  }
}
