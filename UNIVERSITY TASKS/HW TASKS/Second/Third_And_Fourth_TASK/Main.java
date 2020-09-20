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
    System.out.println("объем -> "+ visota + " длина -> "+dlin+" ширина -> "+shir + "Имя фигуры - "+ name);
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
    int x;
    Scanner sc= new Scanner(System.in);
    ArrayList<Double> dlin = new ArrayList<Double>();
    ArrayList<Double> shir = new ArrayList<Double>();
    ArrayList<Double> vis = new ArrayList<Double>();
    ArrayList<String> namm = new ArrayList<String>();

    ArrayList<Double> vaa = new ArrayList<Double>();

    for (int i=0; i < N; i++){
      System.out.println("ENTER THE NAME OF THE FIGURE");
      name= sc.nextInt();
      namm.add(name);
      System.out.println("GREAT !\nNOW ENTER THE TYPE OF THE FIGURE\n1- TRIANGLE\n2-CIRCLE\n3-SQUARE SHIET");
      x= sc.nextInt();
      if (x==1){
        double dli;
        double shi;
        double vi;
        vaa=new Triangle();
        dli= vaa.get(0);
        shi=vaa.get(1);
        
      }
    }
    
  }

}

class Triangle extends scag {
  public ArrayList Triangle(){
    ArrayList<Double> vars = new ArrayList<Double>();
    Scanner sc= new Scanner(System.in);
    System.out.println("WELL, THIS ONE WILL BE HARD... TYPE IN THE LENGTH OF UR FIGURE\n");
    double dli= sc.nextInt();
    vars.add(dli);
    System.out.println("WELL,NOW ENTER HEIGHT\n");
    double ha= sc.nextInt();
    vars.add(ha);
    dli = ((ha*dli)/2)*ha;
    vars.add(dli);
    
    return vars;
  }

} 

