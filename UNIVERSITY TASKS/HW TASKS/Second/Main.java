import java.util.*;  // НУЖЕН ДЛЯ ПОЛЬЗОВАТЕЛЬСКОГО ВВОДА
import java.util.Random; // ИМПОРТИРУЕМ МОДУЛЬ РАНДОМА

class Main{
  public static void main(String[] args){
  first(); //FIRST TASK
  }


  public static void first(){
    MatrixActions matrix = new MatrixActions();
    Scanner sc= new Scanner(System.in); // ЭТО ПОМОЖЕТ НАМ ПОЛУЧАТЬ ЗНАЧЕНИЯ ОТ ЮЗВЕРЕЙ
    Random rand = new Random();// ЭТО ПОМОЖЕТ НАМ СОЗДАВАТЬ РАНДОМНЫЕ ЧИСЛА

    //System.out.println(matrix0); // Почему тут видна фигня ? Всё просто ! У нас указывается ссылка на элемент, а не сам элемент. Чтобы вызвать нормальный элемент - возьмите и напишите (матрица[строка][колонка])

    
    int [][] matrix0 = matrix.create(10,5);
    int [][] matrix01 = matrix.create(10,5);

    MatrixFun MaFun = new MatrixFun();
    MaFun.slozIvich(matrix0, matrix01);
    MaFun.transpose(matrix0);
    MaFun.Umnozh_Na_CHISLO(matrix0);
    MaFun.DVE_MATRIZI_ODNO_CHISLO();
    MaFun.STEPUHA_MATRIZ();

  }
}


class MatrixFun{ // ЕТО КЛАСС С РАЗНЫМИ ДЕЙСТВИЯМИ

  public static void slozIvich(int matrix0[][], int matrix01[][]){

    MatrixActions matrix = new MatrixActions(); // ЭТО НАМ НУЖНО , ЧТОБЫ МЫ МОГЛИ МУТИТЬ ДЕЙСТВИЯ ИЗ ДРУГОГО ФАЙЛА / КЛАССА 

    int[][] result = new int[matrix0.length][matrix0[0].length];
    int[][] result1 = new int[10][5];
    for (int i =0; i < matrix0.length; i++){
      for (int b=0; b < matrix0[0].length; b++){
        result[i][b]=matrix0[i][b]-matrix01[i][b];
        result1[i][b]=matrix0[i][b]+matrix01[i][b];  
      }
    }
    System.out.println("\nПЕЧАТАЕМ МАТРИЦУ ВЫЧИТАНИЯ\n\n");
    matrix.printa(result1);

    System.out.println("\n\nПЕЧАТАЕМ МАТРИЦУ СЛОЖЕНИЯ\n\n");
    matrix.printa(result);
  }



  public static void transpose(int matrix0[][]){

    MatrixActions matrix = new MatrixActions(); // ЭТО НАМ НУЖНО , ЧТОБЫ МЫ МОГЛИ МУТИТЬ ДЕЙСТВИЯ ИЗ ДРУГОГО ФАЙЛА / КЛАССА 

    //ТРАНСПОНИРУЕМ МАТРИЦУ
    System.out.println("\nТРАНСПОНИРУЕМ МАТРИЦУ\nТАК ВЫГЛЯДИТ ИЗНАЧАЛЬНАЯ МАТРИЦА\n");
    matrix0=matrix.create(5,5);
    matrix.printa(matrix0);
    int [][] result = new int[matrix0.length][matrix0[0].length]; // МУТИМ ТУТ МАТРИЦУ , ЧТОБЫ ЛЕГЧЕ БЫЛО ВСТАВЛЯТЬ ))))00000)0)
      for (int i = 0; i < matrix0.length; i++) {
      for (int j = i+1; j < matrix0.length; j++) {
          int temp = matrix0[i][j];
          matrix0[i][j] = matrix0[j][i];
          matrix0[j][i] = temp;
          }
          }
      System.out.println("\nА тут готовая, кек\n");
      matrix.printa(matrix0);
  }



  public static void Umnozh_Na_CHISLO(int matrix0[][]){

    Scanner sc= new Scanner(System.in); // ЭТО ПОМОЖЕТ НАМ ПОЛУЧАТЬ ЗНАЧЕНИЯ ОТ ЮЗВЕРЕЙ
    MatrixActions matrix = new MatrixActions(); // ЭТО НАМ НУЖНО , ЧТОБЫ МЫ МОГЛИ МУТИТЬ ДЕЙСТВИЯ ИЗ ДРУГОГО ФАЙЛА / КЛАССА 

    System.out.println("\nENTER THE NUMBER");
    int a= sc.nextInt();
    
    System.out.println("Сейчас мы покажем изначальную матрицу");
    matrix.printa(matrix0);
    int[][] result= new int [matrix0.length][matrix0[0].length];
    for (int i =0; i < matrix0.length; i++){
      for (int b=0; b < matrix0[0].length; b++){
        result[i][b]=matrix0[i][b]*a;
      }
    } 
    System.out.println("\nПечатаем измененную матрицу\n");
    matrix.printa(result);
  }




  public static void DVE_MATRIZI_ODNO_CHISLO(){
    
    MatrixActions matrix = new MatrixActions(); // ЭТО НАМ НУЖНО , ЧТОБЫ МЫ МОГЛИ МУТИТЬ ДЕЙСТВИЯ ИЗ ДРУГОГО ФАЙЛА / КЛАССА 
    
    System.out.println("\nУмножение 2 матриц\n");
    int [][] matrix0=matrix.create(5,5);
    int [][] matrix1=matrix.create(5,5);

    System.out.println("\nНАША 1 МАТРИЦА\n");
    matrix.printa(matrix0);
    System.out.println("\nНАША 2 МАТРИЦА\n");
    matrix.printa(matrix1);


    int m = matrix0.length;
    int n = matrix1[0].length;
    int o = matrix1.length;
    int[][] res = new int[m][n];

    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < o; k++) {
                res[i][j] += matrix0[i][k] * matrix1[k][j]; 
            }}} 
    System.out.println("\nНАШ РЕЗУЛЬТАТ\n"); 
    matrix.printa(res);
  }



  public static void STEPUHA_MATRIZ(){
    
    //МУТИМ ВОЗВЕДЕНИЕ МАТРИЦЫ В СТЕПЕНЬ

    Scanner sc= new Scanner(System.in); // ЭТО ПОМОЖЕТ НАМ ПОЛУЧАТЬ ЗНАЧЕНИЯ ОТ ЮЗВЕРЕЙ
    MatrixActions matrix = new MatrixActions(); // ЭТО НАМ НУЖНО , ЧТОБЫ МЫ МОГЛИ МУТИТЬ ДЕЙСТВИЯ ИЗ ДРУГОГО ФАЙЛА / КЛАССА 

    System.out.println("\nВозведение матрицы в степень\n\tНаша изначальная матрица\n");
    int [][] matrix0=matrix.create(5,5);
    matrix.printa(matrix0);
    System.out.println("\nВ КАКУЮ СТЕПЕНЬ ХОТИТЕ ВОЗВЕСТИ МАТРИЦУ ?)\n");
    int a= sc.nextInt();
    a-=1;
    if (a==0){
      matrix.printa(matrix0);
    } else {
            int n = matrix0.length;
            int[][] c = new int[n][n];
            for (int nu =0; nu<a ; nu++){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        c[i][j] += matrix0[i][k] * matrix0[k][j];
                    }
                }
            }
            }
            matrix.printa(c);
            }

  }
}
