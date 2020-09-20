import java.util.*;  // НУЖЕН ДЛЯ ПОЛЬЗОВАТЕЛЬСКОГО ВВОДА

class Main {
  public static void main(String[] args) {
    System.out.println("WELCOME , NIBBA <*-*>\n");
    Main();
  }

  public static void Main (){
  System.out.println("WELCOME , NIBBA-2.0, I am the constructor (ง ͠° ͟ل͜ ͡°)ง\nFirst, You've got to enter x,y,z , so we can start our HUGE SKES\n\n");
  Scanner sc= new Scanner(System.in);
  double x= sc.nextInt();
  double y= sc.nextInt();
  double z= sc.nextInt();

  System.out.println("\nWELL, YOU'VE DONE SOME GOD (k, good) DAMN JOB, NOW I'VE GOT TO COUNT SOME NUMS\n");
  double res=Math.sqrt((x*x)+(y*y)+(z*z));
  System.out.println("ВО ТЕБЕ И РЕЗУЛЬТАТ -> "+ res+"\n");

  }
}
