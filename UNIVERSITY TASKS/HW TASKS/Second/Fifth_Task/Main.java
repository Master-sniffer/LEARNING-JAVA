import java.util.ArrayList;
import java.util.*;
import java.util.Random; 


public class Main {

    public static void main(String[] args) {

        int[] values = {1, 2, 5};
        int[] scales = {1, 4, 10};

        Returner returner = new Returner(values, scales);
        int returnValue = returner.getNumber();
        System.out.println("Возвращенное значение: "+returnValue);
    }

}

class Return {
    int[] valuesArr;
    int[] scalesArr;
    int[] rangesArr;
    int sum = 0;

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
        int random = (int) (Math.random() * (sum - 1));

        int index = 0;
        for (int i = 0; i < rangesArr.length; i++) {
            if (rangesArr[i] > random)
                break;
            index = i;
        }

        return valuesArr[index];
    }
}
