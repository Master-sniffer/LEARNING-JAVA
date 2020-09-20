import java.util.*;
import java.util.ArrayList; 

class Main {

  public static void main(String[] args) {
    System.out.println("WELCOME , AGAIN NIBBROID <*-*>\n");
    new scag();
  }
  
  public void main(double N){
    this.N=N;
    System.out.println("FUNNY , NOW I WILL DO THE REST OF THE STUFF\n+YOU'VE CHOSEN "+N+" volume ");


  }

  double N;

  // private double dlin;
  // private double shir;
  // private double visota;

  // private ArrayList<String> names = new ArrayList<String>();
  // private ArrayList<Double> dlina = new ArrayList<Double>();
  // private ArrayList<Double> shirina = new ArrayList<Double>();
  // private ArrayList<Double> visotka = new ArrayList<Double>();

  private ArrayList<String> names;
  private ArrayList<Double> dlina;
  private ArrayList<Double> shirina;
  private ArrayList<Double> visotka;

  void main(double dlin , double shir, double visota){
    System.out.println("высота -> "+ visota + " длина -> "+dlin+" ширина -> "+shir + "Имя фигуры - "+ name);
  }

  void main(double rad, double visota){
    System.out.println("радиус - "+ rad + " высота - " + visota);
  }

// ТУТ НАЧИНАЕТСЯ ЖОПА. ЧИТАЙТЕ GET и SET или гляньте видос https://www.youtube.com/watch?v=wF18uVxjtvc&ab_channel=mybringback      XD

/**
 * @param dlina the dlina to set
 */
public void setDlina(ArrayList<Double> dlina) {
  this.dlina = dlina;
}

/**
 * @param names the names to set
 */
public void setNames(ArrayList<String> names) {
  this.names = names;
}

/**
 * @param shirina the shirina to set
 */
public void setShirina(ArrayList<Double> shirina) {
  this.shirina = shirina;
}

/**
 * @param visotka the visotka to set
 */
public void setVisotka(ArrayList<Double> visotka) {
  this.visotka = visotka;
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
  public scag (){
    Scanner sc= new Scanner(System.in);
    double N= sc.nextInt();
    main(N);
  }

  public ArrayList Figures(){
    int N=(super.N);
    String name;
    Scanner sc= new Scanner(System.in);
    for (int i=0; i < N; i++){
      System.out.println("ENTER THE NAME OF THE FIGURE");
      name= sc.nextInt();
      //ArrayList<Double> X = new ArrayList<Double>();
    }
    
  }

}

