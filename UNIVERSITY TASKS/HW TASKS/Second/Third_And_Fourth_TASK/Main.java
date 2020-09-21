import java.util.*;
import java.util.ArrayList; 
import java.lang.Math.*;

class Main {

  public static void main(String[] args) {
    System.out.println("WELCOME , AGAIN NIBBROID <*-*>\n");
    scag SC = new scag();
    SC.Figures();
  }


  public void main(double N){
    this.N=N;
    System.out.println("FUNNY , NOW I WILL DO THE REST OF THE STUFF\n+YOU'VE CHOSEN "+N+" volume ");

  }

  double N;

  public void mana(){
    System.out.println("YOUR MOM GAY LOL\nOH,NO\nHERE IS THE ANSWER!\n");
    for (int i=0; i< dlina.size(); i++){
      double x=shirina.get(i); // ЗАЧЕМ МЫ ТАК ОБХОДИМ ЭТО ? ДА ПОТОМУ ЧТО ЧЕРТОВ ДЖАВА НЕ ПОНИМАЕТ , КОГДА ЕГО ПРОСТО ПРОСЯТ ПОКАЗАТЬ ЗНАЧЕНИЕ
      if (x==0.0){
        double ra=dlina.get(i);
        double vi=visotka.get(i);
        main(ra,vi);
      }
      else if (x!=0.0){
        double dli= dlina.get(i);
        double shi= shirina.get(i);
        double viska= visotka.get(i);
        String nama= names.get(i);
        main(dli, shi, viska, nama);
      }
      else {
        System.out.println("Ecchi till I die all these lolis call me (senpai)\nRubbing on her thighs she stay wet for her (senpai)\nShawty so kawaii, and would die for her (senpai)\nRide and watch hentai, all the time with (senpai)");
        System.exit(1);
      }

    }
  }

  // private ArrayList<String> names = new ArrayList<String>();
  // private ArrayList<Double> dlina = new ArrayList<Double>();
  // private ArrayList<Double> shirina = new ArrayList<Double>();
  // private ArrayList<Double> visotka = new ArrayList<Double>();

  static ArrayList<String> names;
  static ArrayList<Double> dlina;
  static ArrayList<Double> shirina;
  static ArrayList<Double> visotka;


  void main(double dlin , double shir, double visota, String name){
    System.out.println("объем -> "+ visota + " длина -> "+dlin+" ширина -> "+shir + " Имя фигуры - "+ name);
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
// ЧЕ , ПРОБЛЕМЫ С ДОСТУПОМ К  КЛАССУ ?) А ОН И НЕ БУДЕТ РОБИТЬ , ИБО ОН АБСТРАКТНЫЙ, ЛМАО



class scag extends Main{
  public scag (){
    Scanner sc= new Scanner(System.in);
    double N= sc.nextInt();
    main(N);
  }

  public void Figures(){
    double N=(super.N);
    //String name;
    int x;
    Scanner sc= new Scanner(System.in);

    ArrayList<Double> dlin = new ArrayList<Double>();
    ArrayList<Double> shir = new ArrayList<Double>();
    ArrayList<Double> vis = new ArrayList<Double>();
    ArrayList<String> namm = new ArrayList<String>();

    ArrayList<Double> vaa = new ArrayList<Double>(); // buffer 

    for (int i=0; i < N; i++){
      System.out.println("\nENTER THE NAME OF THE FIGURE\n");
      String name= sc.nextLine();
      namm.add(name);
      System.out.println("\nGREAT !\nNOW ENTER THE TYPE OF THE FIGURE\n1- TRIANGLE\n2-CIRCLE\n3-SQUARE SHIET\n");
      x=0;
      x= sc.nextInt();
      if (x==1){
        // double dli;
        // double shi;
        // double vi;
        Triangle vas=new Triangle();
        vaa=vas.Triangles();

        dlin.add(vaa.get(0));
        shir.add(vaa.get(1));
        vis.add(vaa.get(2));
      }
      else if (x==2){
        Circle vas=new Circle();
        vaa=vas.Circles();
        dlin.add(vaa.get(0));
        shir.add(vaa.get(1));
        vis.add(vaa.get(2));
      }
      else if (x==3){
        Square vas=new Square();
        vaa=vas.Squares();
        dlin.add(vaa.get(0));
        shir.add(vaa.get(1));
        vis.add(vaa.get(2));
      }
      else {
        System.exit(1);
      }
    }
    Main.dlina=dlin;
    Main.names=namm;
    Main.shirina=shir;
    Main.visotka=vis;
    mana();
    
  }
}

class Triangle extends Main {
  public ArrayList Triangles(){
    ArrayList<Double> vars = new ArrayList<Double>();
    Scanner sc= new Scanner(System.in);
    System.out.println("\nWELL, THIS ONE WILL BE HARD... TYPE IN THE LENGTH OF UR FIGURE\n");
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

class Circle extends Main{
  public ArrayList Circles(){
    ArrayList<Double> vars = new ArrayList<Double>();
    Scanner sc= new Scanner(System.in);
    System.out.println("\nMMMM, CIRCLES\nMMMM\nAH,OH, ENTER THE RADIUS OF THE CIRCLE !\n");
    double dli= sc.nextInt();
    vars.add (dli);
    vars.add(0.0);
    double shi = 4/3 * Math.PI * Math.pow(dli,3);
    vars.add(shi);

    return vars;
  }
}

class Square extends Main{
  public ArrayList Squares(){
    ArrayList<Double> vars = new ArrayList<Double>();
    Scanner sc= new Scanner(System.in);
    System.out.println("\nYEAH ! SQUARE\nENTER THE LENGTH, PLS\n");
    double le = sc.nextInt();
    System.out.println("\nENTER THE WIDTH, PLS\n");
    double shi = sc.nextInt();
    System.out.println("\nENTER THE HEIGHT, PLS\n");
    double hi = sc.nextInt();
    vars.add (le);
    vars.add (shi);
    hi = le*shi*hi;
    vars.add (hi);
    
    return vars;
  }
}

