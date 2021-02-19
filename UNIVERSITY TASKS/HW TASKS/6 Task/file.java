import java.util.Arrays;

class Main {
  private String man="55125";
  private String curkacha="dada";
  private int parlos=5231;

  public static void main(String[] args) {
    System.out.println("Hello world!");
    Print__edition edition = new Print__edition();
    String[] booksMags = {"Superhero","Moby Dick", "White whale", "Flash", "HornoDoge"};
    for (String i : booksMags){ // печатает по строчке каждую книгу
      edition.prints(i);
    }

    edition.printMagazines(booksMags);
    edition.printBooks(booksMags);

    marks();

  }

  private static void marks (){
    System.out.println("I am here just to die");
    Book marka = new Book();
    marka.print();
    marka.doge();
  }
}

interface Printable{

  void print();

}

class Print__edition{
 
  static private String[] Magazine={"Moby Dick", "HornoDoge", "White whale"};
  static private String[] Hero = {"Superhero","Flash"};
  static private String[] babo = {"java","language"};

  public void prints (String var){
    System.out.println(var);
  }

  public static void printMagazines(String[] printable){
    for (String i : printable){
      if (i instanceof String && Arrays.stream(Magazine).anyMatch(x -> x == i)){
        System.out.println(i);
      }
    }
  }


  public static void printBooks(String[] printable){
    for (String i : printable){
      if (i instanceof String && Arrays.stream(Hero).anyMatch(x -> x == i)){
        System.out.println(i);
      }
    }
  }

}

class Book implements Printable{
  private int print_one=12341;
  private int print_two = 65415;
  private int parskokv=31231;

  public void print(){
    System.out.println("Hey, i am print");
  }
  public void doge(){
    System.out.println("Hey, i am doge");
  }


}
