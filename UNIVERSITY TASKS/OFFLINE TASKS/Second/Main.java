import java.util.*; // нужно, чтобы вводить данные
import java.util.ArrayList;  // нужно будет для записи в Список
import java.io.*; // нужно для записи в файл
import java.lang.Math.*; // на всякий сюда добавим


class Main {
  public static void main(String[] args) {
    System.out.println("Sup, Man\nEnter r - variable aka growth\nEnter the starting Xo\nAnd the size of the step\nLine by line...\n");

    Scanner sc= new Scanner(System.in); // объявляем юзверьский ввод

    double r= sc.nextDouble();
    System.out.println("\nNice, next numb\n");
    double X = sc.nextDouble();
    System.out.println("\nAnd one last numb\n");
    double step = sc.nextInt();
    System.out.println("K, let's do it bröther");

    // узнать как без гемора передать значения в другой метод
    MakingArray(r, X, step);
  }

  public static void MakingArray(double r, double X, double step){
    
    
    double buffer;
    double SecondBuffer;
    double end = 500.0/step;
    
    System.out.println("The size of our array\n"+end+"\n");

    for (double dr=0.1; dr < r; dr+=0.1){
      ArrayList<Double> VSELENNAIA = new ArrayList<Double>();
      VSELENNAIA.add(X);

    for (int i =0; i < end; i++){

      buffer=VSELENNAIA.get(i);
      SecondBuffer= dr* buffer*(1.0-buffer);
      // TODO ДОБАВИТЬ ДЛИНУ ДО 3 ЦИФР ПОСЛЕ ТОЧКИ
      // ПРОВЕРИТЬ, ПОЧЕМУ ЧИСЛА ОТРИЦАТЕЛЬНЫЕ
      VSELENNAIA.add(SecondBuffer);

  }
    System.out.println(VSELENNAIA+"\n\n\n\nHERE!!!!\t\n\n\n"+dr+"\n\n");

    

    try(FileWriter writer = new FileWriter("TEKST.txt", true)) // ПРОБУЕМ ЗАПИСАТЬ ЭТО В ФАЙЛ
          {


            // запись всей строки
                //String text = "Hello Gold!";
                //writer.write(text);
              // запись по символам
                //writer.append('\n');
              //writer.append('E');


              double var;
              String s;
              for (int i =0 ;i <VSELENNAIA.size(); i++){
                var=VSELENNAIA.get(i);
                s=String.valueOf(var)+"\n"; // достаем нашу переменную и делаем ее STRING-овым форматом , так как текстовый файл принимает ток такой формат
                writer.append(s);
              }
                writer.append("hi\n");
              
              writer.flush(); // закрываем файл
          }
          catch(IOException ex){
              
              System.out.println(ex.getMessage());
          } 
     } // КОНЕЦ FOR
  }
}
