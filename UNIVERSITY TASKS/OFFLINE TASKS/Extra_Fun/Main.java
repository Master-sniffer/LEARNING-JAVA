import java.util.Scanner;

public class Main {
public static void main(String[] args){
  Scanner in = new Scanner(System.in);
  System.out.println("Введите число в Цельсиях: ");
  Double x = in.nextDouble();
  System.out.println("Введите во что вы хотите их переконвертировать - 1 - келвин\n2 - фаренгейт ");
  int y = in.nextInt();
  if (y==1){
    //Kelvin(x);

    Kelvin K=new Kelvin();
    K.Kelvin(x);
    
  }
  else if (y==2){
    //Farengeit(x);

    Farengeit F = new Farengeit();
    F.Farengeit(x);
  }
  else{
    System.out.print("Bye-bye");
  }

// Scanner in = new Scanner(System.in);
// System.out.println("Введите число: ");
// int x = in.nextInt();
// System.out.println("Введите второе число: ");
// int y = in.nextInt();
// System.out.printf("Sum: %d \n", x+y);
// in.close();
}
}





