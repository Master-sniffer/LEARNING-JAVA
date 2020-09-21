import java.util.ArrayList;
import java.util.*;
import java.util.Random; 

class Main {
  public static void main(String[] args) {
    System.out.println("HEY, I'VE GOT KEK\nENTER THE SIZE OF THE ARRAY!\n");
    Scanner sc= new Scanner(System.in);
    int N= sc.nextInt();
    int k;
    ArrayList<Integer> A = new ArrayList<Integer>();
    ArrayList<Integer> B = new ArrayList<Integer>();
    for (int i=0; i<N; i++){
      System.out.println("\nFIRST ARRAY\n");
      k= sc.nextInt();
      A.add(k);
      System.out.println("\nSECOND ARRAY\n");
      k= sc.nextInt();
      B.add(k);
    }
    RESHENIE RES = new RESHENIE(A, B);
  }
}


class RESHENIE extends Main{
  public RESHENIE (ArrayList A, ArrayList B){
    int ma=(int) Collections.max(B);
    var d = Math.random();
    for (int i =0; i < A.size(); i++){
      
    }
  }
}
