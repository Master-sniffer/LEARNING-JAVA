import java.util.*;  // НУЖЕН ДЛЯ ПОЛЬЗОВАТЕЛЬСКОГО ВВОДА
import java.util.ArrayList; // ПРИФИГАЧИМ СЮДЫ СПИСОК ))

class Main {
  public static void main(String[] args) {
    System.out.println("WELCOME , NIBBA <*-*>\n");
    Main();
  }

  public static void Main (){
  Deistvia Denchik = new Deistvia();

  System.out.println("WELCOME , NIBBA-2.0, I am the constructor (ง ͠° ͟ل͜ ͡°)ง\nFirst, You've got to enter x,y,z , so we can start our HUGE SKES\n\n");
  Scanner sc= new Scanner(System.in);
  double x= sc.nextInt();
  double y= sc.nextInt();
  double z= sc.nextInt();

  System.out.println("\nWELL, YOU'VE DONE SOME GOD (k, good) DAMN JOB, NOW I'VE GOT TO COUNT SOME NUMS\n");
  double res=Math.sqrt((x*x)+(y*y)+(z*z));
  System.out.println("ВО ТЕБЕ И РЕЗУЛЬТАТ -> "+ res+"\n");

  System.out.println("OH-MY-GOD, YOU NEED TO COUNT THE SCALAR PRODUCT, BUT FIRST, WE NEED TO ADD SOME NUMBERS.\n ");
  ArrayList<Double> X = new ArrayList<Double>();
  ArrayList<Double> Y = new ArrayList<Double>();
  ArrayList<Double> Z = new ArrayList<Double>();
  System.out.println("\nGREAT, NOW ENTER ONE MORE NUMBER FOR X, THEN Y AND THEN Z\nEASE AF, DONT FU IT UP\n");

  double a= sc.nextInt();
  X.add(x);
  X.add(a);
  a= sc.nextInt();
  Y.add(y);
  Y.add(a);
  a= sc.nextInt();
  Z.add(z);
  Z.add(a);

  System.out.println("AE, MY HOMIE, LETS CONTINUE DOING SOME CRAZY STUFF\nBUT FIRST, LETS TAKE A LOOK AT OUR ARRAYS\n");
  System.out.println(X);
  System.out.println(Y);
  System.out.println(Z);
  System.out.println("\nDAMN, THAT'S BEAUTIFUL\nK,LETS CONTINUE\n");
  Denchik.skal(X,Y,Z);
  System.out.println("\nтут это , векторное произведение с другим вектором. КРЧ, НИЧЕГО СЛОЖНОГО ))))\n");
  Denchik.VecSHTO(X,Y,Z);
  }
}

class Deistvia{
  public static void skal(ArrayList X, ArrayList Y, ArrayList Z){
    // Сейчас будет очень необычное действие, которые напомнит вам, что Питон это оч приятный ЯП))))

    // для получения значения, надо писать ИмяСписка.get(номерЭлемента)
    double FirX =(double) X.get(0);
    double SecX =(double) X.get(1);
    double FirY =(double) Y.get(0);
    double SecY =(double) Y.get(1);
    double FirZ =(double) Z.get(0);
    double SecZ =(double) Z.get(1);

    double res = (FirX*SecX) + (FirY*SecY) + (FirZ*SecZ);
    System.out.println(res);
    System.out.println("\nNice job, boii\n");
  }

  public static void VecSHTO(ArrayList X, ArrayList Y, ArrayList Z){
    double FirX =(double) X.get(0);
    double SecX =(double) X.get(1);
    double FirY =(double) Y.get(0);
    double SecY =(double) Y.get(1);
    double FirZ =(double) Z.get(0);
    double SecZ =(double) Z.get(1);

    
  }
}
