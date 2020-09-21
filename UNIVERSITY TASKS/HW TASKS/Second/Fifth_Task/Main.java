import java.util.ArrayList;
import java.util.*;
import java.util.Random; 


public class Main {

    public static void main(String[] args) {

        int[] values = {1, 2, 3}; // создаем массив в этими данными 
        int[] scales = {1, 2, 10}; // и второй массив

        Return returner = new Return(values, scales); // создаем экземпляр класса returner и закидываем в конструктор два массива
        int returnValue = returner.Numbers(); // идет обработка рандомных чисел 
        System.out.println(" UR ANSWER is : "+returnValue+"\nARIVIDERCHI , AMIGO\n");
        System.exit(1);
    }

}

class Return {
    int[] valuesArr; // создаем массив для первого числа
    int[] scalesArr; // второго 
    int[] rangesArr; // третьего 
    int sum = 0; // сумма элементов

    public Return(int[] values, int[] scales) {
        sum = 0;
        valuesArr = values;
        scalesArr = scales;
        rangesArr = new int[valuesArr.length];


        for (int i = 0; i < scalesArr.length; i++)
            sum += scalesArr[i];

        int s = 0;
        for (int i = 0; i < rangesArr.length; i++) {
            rangesArr[i] = s;
            s += scalesArr[i];
        }
    }


    public int Numbers() {
        int randi = (int) (Math.random() * (sum - 1));

        int ind = 0;
        for (int i = 0; i < rangesArr.length; i++) {
            if (rangesArr[i] > randi)
                break;
            ind = i;
        }

        return valuesArr[ind];
    }
}
