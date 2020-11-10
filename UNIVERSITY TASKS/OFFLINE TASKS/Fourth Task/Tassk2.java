import java.io.*;
import java.util.*;
import java.util.Scanner; // импорт сканера
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.IntConsumer;

class Tassk2 {
  Tassk2(ArrayList<Integer> lis) {
    System.out.println("Choose the number which will match");
    int ka=0;

    Scanner sc= new Scanner(System.in);
    int r= sc.nextInt();
    System.out.println("Usual method is...");



    long startTime = System.currentTimeMillis();
    for(Integer ele : lis){
      if (ele==r){
        ka++;
      }
    }

        //for (String s : list) {
       // System.out.println(s);
    //}


    System.out.println(ka);
    long endTime = System.currentTimeMillis();
    System.out.println("Total execution time: " + (endTime-startTime) + "ms"); 

    System.out.println("Choose the number which will match");

    int ba= sc.nextInt();

    startTime = System.currentTimeMillis();
    int firstIndex = 0;
    int lastIndex = lis.size() - 1;

    // условие прекращения (элемент не представлен)
    while(firstIndex <= lastIndex) {
        int middleIndex = (firstIndex + lastIndex) / 2;
        int ikar = lis.get(middleIndex);
        // если средний элемент - целевой элемент, вернуть его индекс
        if (ikar == ba) {
            break;
        }

        // если средний элемент меньше
        // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
        else if (ikar < ba) {
            firstIndex = middleIndex + 1;
        }
        // если средний элемент больше
        // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
        else if (ikar > ba){
            lastIndex = middleIndex - 1;
        }
    }
    System.out.println("Total execution time: " + (endTime-startTime) + "ms"); 

  }

  //public static int binarySearch(int arr[], int elementToSearch) 



}
