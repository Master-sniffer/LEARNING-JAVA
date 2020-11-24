import java.util.ArrayList;
import java.util.Arrays;

public class Choice implements Container{
  public void sort(ArrayList<Integer> lis){
    for (int i = 0; i < lis.size(); i++) {

        int min = lis.get(i);
        int min_i = i; 

        for (int j = i+1; j < lis.size(); j++) {
            if (lis.get(j) < min) {
                min = lis.get(j);
                min_i = j;
            }
        }
        if (i != min_i) {
            int tmp = lis.get(i);
            lis.set(i, lis.get(min_i));
            lis.set(min_i, tmp);
        }
    }
    System.out.println(lis);
  }

    public void foreach(ArrayList<Integer> lis){
     ArrayList<Double> Numbers = new ArrayList<Double>();
     for (int i = 0; i< lis.size(); i++){
       Numbers.add(Math.log(lis.get(i)));
     }
     System.out.println(Numbers);

  }
}
