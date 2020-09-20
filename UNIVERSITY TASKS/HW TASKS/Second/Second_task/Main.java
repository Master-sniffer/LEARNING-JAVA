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
  System.out.println("\nТак-с, косинус между векторами ( звучит оч сложно, но давайте посчитаем)\nХотя... Постойте !НУЖНЫ ЕЩЕ ЧИСЛА !\nСЕЙЧАС МЫ БУДЕМ ДОБАВЛЯТЬ ПО ОДНОМУ ЧИСЛУ В КАЖДЫЙ СПИСОК ! БУДЬ ОСТОРОЖЕН !");
  a= sc.nextInt();
  X.add(x);
  X.add(a);
  a= sc.nextInt();
  Y.add(y);
  Y.add(a);
  a= sc.nextInt();
  Z.add(z);
  Z.add(a);
  Denchik.Cosinus(X,Y);
  System.out.println("\nЕТО ЩА БУДЕТ МЕТОД ВЫЧИТАНИЯ И СЛОЖЕНИЯ. НАСЛАЖДАЙТЕСЬ !\n");
  Denchik.samka_I_raznost(X,Y,Z);
  }
}

class Deistvia{
  public static void skal(ArrayList X, ArrayList Y, ArrayList Z){
    // Сейчас будет очень необычное действие, которые напомнит вам, что Питон это оч приятный ЯП))))

    // для получения значения, надо писать ИмяСписка.get(номерЭлемента)
    double FirX =(double) X.get(0); // ПРИВЫКАЙТЕ, ТАК МЫ БУДЕМ ДЕЛАТЬ ВСЕ ДОВОЛЬНО-ТАКИ ЧАСТО (знаю, можно писать это все без всяких танцов с бубном, но давайте на первых порах хоть как-то писать и разбираться. Потом уже подумаем и о скорости)

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

    double res0= FirY*SecZ - FirZ*SecY;
    double res1= FirZ*SecX - FirX*SecZ;
    double res2 = FirX * SecY - FirY*SecX;
    ArrayList<Double> Result = new ArrayList<Double>();
    Result.add(res0);
    Result.add(res1);
    Result.add(res2);
    System.out.println(Result);
    System.out.println("\nNICELY DONE \n");
  }

  public static void Cosinus(ArrayList X, ArrayList Y){
    double res;
    double FirX =(double) X.get(0);
    double SecX =(double) X.get(1);
    double ThirX= (double) X.get(2);
    double FirY =(double) Y.get(0);
    double SecY =(double) Y.get(1);
    double ThirY= (double) Y.get(2);

    res =( (FirX*FirY) + (SecX*SecY)+ (ThirX*ThirY) )/ (Math.sqrt( (Math.pow(FirX,2)) + (Math.pow(SecX,2)) + (Math.pow(ThirX,2)) )) * (Math.sqrt( (Math.pow(FirY,2)) + (Math.pow(SecY,2)) + (Math.pow(ThirY,2)) )) ;
    System.out.println(res+"ЕТО НАШ ОТВЕТ, НАСЧЕТ УГЛА\n");
  }

  public static void samka_I_raznost(ArrayList X, ArrayList Y, ArrayList Z){
    double FirX =(double) X.get(0);
    double SecX =(double) X.get(1);
    double FirY =(double) Y.get(0);
    double SecY =(double) Y.get(1);
    double FirZ =(double) Z.get(0);
    double SecZ =(double) Z.get(1);

    ArrayList<Double> res = new ArrayList<Double>();
    ArrayList<Double> res1 = new ArrayList<Double>();
    // ИДЕТ СЛОЖЕНИЕ , НЕ ПРИКАСАЙТЕСЬ !
    res.add(FirX+SecX);
    res.add(FirY+SecY);
    res.add(FirZ+SecZ);
    // ИДЕТ ВЫЧИТАНИЕ , ИДИТЕ НА
    res1.add(FirX-SecX);
    res1.add(FirY-SecY);
    res1.add(FirZ-SecZ);

    System.out.println("\nРезультат вычитания ! ༼ つ ◕_◕ ༽つ  "+res1+"\n\nРезультат сложения ! ʕ•ᴥ•ʔ "+res);
  }
}
