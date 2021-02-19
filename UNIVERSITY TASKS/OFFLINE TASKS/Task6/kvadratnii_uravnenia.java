// Написать калькулятор квадратных уравнений

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello user !\nЧтобы решить квадратное уравнение - выбирай опцию 1, чтобы выбрать простое уравнение - 2");
    Scanner in = new Scanner(System.in);
    int type=in.nextInt();
    double a, b, c;
    double D;

    if (type==1){
    System.out.println("Программа решает квадратное уравнение вида:");
    System.out.println("ax^2 + bx + c = 0");
    System.out.println("Введите a, b и c:");

    a = in.nextDouble();
    b = in.nextDouble();
    c = in.nextDouble();

      D = b * b - 4 * a * c;
  if (D > 0) {
      double x1, x2;
      x1 = (-b - Math.sqrt(D)) / (2 * a);
      x2 = (-b + Math.sqrt(D)) / (2 * a);
      System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
  }
  else if (D == 0) {
      double x;
      x = -b / (2 * a);
      System.out.println("Уравнение имеет единственный корень: x = " + x);
  }
  else {
      System.out.println("Уравнение не имеет действительных корней!");
  }

    }
    else if(type==2){

    System.out.println("Программа решает уравнение вида:");
    System.out.println("a=b+cx\nЧтобы подставить отрицательное число (вместо плюса -> минус, пишите отрицательное число\n");
    System.out.println("Введите a, b и c:");
    a = in.nextDouble();
    b = in.nextDouble();
    c = in.nextDouble();

    a=a/c;
    b=b/c;
    double k=a-b;
    System.out.println(k);

    }

  }
}
