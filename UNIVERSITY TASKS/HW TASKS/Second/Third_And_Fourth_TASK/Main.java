import java.util.*;

class Main {

  public static void main(String[] args) {
    System.out.println("WELCOME , AGAIN NIBBROID <*-*>\n");
    new scag();
  }
  
  public void main(double N){
    this.N=N;
    System.out.println("FUNNY , NOW I WILL DO THE REST OF THE STUFF\n+YOU'VE CHOSEN "+N+" volume ");

  }

  private double dlin;
  private double shir;
  private double visota;
  String name;
  double N;

  void main(double dlin , double shir, double visota){
    this.dlin=dlin;
    this.shir=shir;
    this.visota=visota;
    System.out.println("высота -> "+ visota + " длина -> "+dlin+" ширина -> "+shir + "Имя фигуры - "+ name);
  }

  void main(double rad, double visota){
    System.out.println("радиус - "+ rad + " высота - " + visota);
  }

}


// НЕ ПОВЕРИТЕ, НО МОЖЕТ СУЩЕСТВОВАТЬ АБСТРАКТНЫЙ КЛАСС БЕЗ АБСТРАКТНЫХ МЕТОДОВ , ЧТО КАК БЫ ПОКАЗЫВАЕТ , ЧТО ВЫ НЕ ДРУЖИТЕ С ГОЛОВОЙ , НО ДА ПО...
abstract class scar extends Main{ 
    public abstract void UNICHTOGIT_MIR(); // КАК ГОВОРИЛ МОЙ ДЕД, ЕСЛИ В ТВОЕМ АБСТРАКТНОМ КЛАССЕ НЕТ АБСТРАКТНЫХ МЕТОДОВ , ТО ХЕРНЯ ЭТО , А НЕ АБСТРАКТНЫЙ КЛАСС
    // У ТАКИМ МЕТОДОВ НЕТ РЕАЛИЗАЦИИ (ЧТО-ТО ТИПА TODO, ЛОЛ)

  public scar (){
  Scanner sc= new Scanner(System.in);
  double N= sc.nextInt();
  main(N);
  }
}
// ЧЕ , НЕ РАБОТАЕТ КЛАСС ?) А ОН И НЕ БУДЕТ РОБИТЬ , ИБО ОН АБСТРАКТНЫЙ, ЛМАО

class scag extends Main{
  public scag (int a){
    Scanner sc= new Scanner(System.in);
    double N= sc.nextInt();
    main(N);
  }
}

