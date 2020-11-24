import java.util.ArrayList;
import java.util.Arrays;

public class Bubble implements Container{
  public void sort(ArrayList<Integer> lis){
 
        boolean isSorted = false;
        int buf;
        
        while(!isSorted) {
            isSorted = true;
            int bruh=(lis.size());
            for (int i = 0; i< bruh-1; i++) {
                if(lis.get(i) > lis.get(i+1)){
                    isSorted = false;
 
                    buf = lis.get(i);
                    lis.set(i, lis.get(i+1));
                    lis.set(i+1, buf);
                }
            }
            
        }
        System.out.println(lis);
  }

  public void foreach(ArrayList<Integer> lis){
     ArrayList<Double> Numbers = new ArrayList<Double>();
     for (int i = 0; i< lis.size(); i++){
       Numbers.add(Math.sqrt(lis.get(i)) );
     }
     System.out.println(Numbers);
  }
}
