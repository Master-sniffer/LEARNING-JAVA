import java.util.*;  // НУЖЕН ДЛЯ ПОЛЬЗОВАТЕЛЬСКОГО ВВОДА
import java.util.Random; // ИМПОРТИРУЕМ МОДУЛЬ РАНДОМА

class Main{
  public static void main(String[] args){
  first(); //FIRST TASK
  }


  public static void first(){
    int[][] matrix0 = new int[10][5];
    int[][] matrix01 = new int[10][5];
    int n = 10;
    int k = 5; 

    Scanner sc= new Scanner(System.in); // ЭТО ПОМОЖЕТ НАМ ПОЛУЧАТЬ ЗНАЧЕНИЯ ОТ ЮЗВЕРЕЙ
    Random rand = new Random();// ЭТО ПОМОЖЕТ НАМ СОЗДАВАТЬ РАНДОМНЫЕ ЧИСЛА

    for (int i =0; i < n; i++){
      for (int b=0; b < k; b++){
          matrix0[i][b]=rand.nextInt(100); // идет рандомное число до 100 в матрицу
          matrix01[i][b]=rand.nextInt(100); // Идет рандомное число до 100 в матрицу
      }
    }
    //System.out.println(matrix0); // Почему тут видна фигня ? Всё просто ! У нас указывается ссылка на элемент, а не сам элемент. Чтобы вызвать нормальный элемент - возьмите и напишите (матрица[строка][колонка])

    // УЗНАТЬ, КАК ПОЛУЧАТЬ ЭЛЕМЕНТ ВО ВСЕМ КЛАССЕ
    
    int[][] result = new int[10][5];
    int[][] result1 = new int[10][5];
    for (int i =0; i < n; i++){
      for (int b=0; b < k; b++){
        result[i][b]=matrix0[i][b]-matrix01[i][b];
        result1[i][b]=matrix0[i][b]+matrix01[i][b];  
      }
    }

    // ПЕЧАТАЕМ МАТРИЦУ ВЫЧИТАНИЯ
    System.out.println("ПЕЧАТАЕМ МАТРИЦУ ВЫЧИТАНИЯ\n\n");
    printa(result1);

    System.out.println("\n\nПЕЧАТАЕМ МАТРИЦУ СЛОЖЕНИЯ\n\n");
    printa(result);
    
    System.out.println("\nENTER THE NUMBER");
    int a= sc.nextInt();
    
    System.out.println("Сейчас мы покажем изначальную матрицу");
    printa(matrix0);
    for (int i =0; i < n; i++){
      for (int b=0; b < k; b++){
        result[i][b]=matrix0[i][b]*a;
      }
    } 
    System.out.println("\nПечатаем измененную матрицу\n");
    printa (result); 

    System.out.println("\nУмножение 2 матриц\n");
    matrix0 = new int[5][5];
    int [][] matrix1 = new int[5][5];
    for (int i =0; i < matrix0.length; i++){
      for (int b=0; b < matrix0[0].length; b++){
          matrix0[i][b]=rand.nextInt(100);
          matrix1[i][b]=rand.nextInt(100);}}
      
    int m = matrix0.length;
    n = matrix1[0].length;
    int o = matrix1.length;
    int[][] res = new int[m][n];

    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            for (k = 0; k < o; k++) {
                res[i][j] += matrix0[i][k] * matrix1[k][j]; 
            }}}  
    printa (res);

    //ТРАНСПОНИРУЕМ МАТРИЦУ
    System.out.println("\nТРАНСПОНИРУЕМ МАТРИЦУ\nТАК ВЫГЛЯДИТ ИЗНАЧАЛЬНАЯ МАТРИЦА\n");
    printa (matrix0);
    result = new int[5][5]; // МУТИМ ТУТ МАТРИЦУ , ЧТОБЫ ЛЕГЧЕ БЫЛО ВСТАВЛЯТЬ ))))00000)0)
      for (int i = 0; i < n; i++) {
      for (int j = i+1; j < n; j++) {
          int temp = matrix0[i][j];
          matrix0[i][j] = matrix0[j][i];
          matrix0[j][i] = temp;
          }
          }
    System.out.println("\nА тут готовая, кек\n");
    printa(matrix0);

    //МУТИМ ВОЗВЕДЕНИЕ МАТРИЦЫ В СТЕПЕНЬ
    System.out.println("\nВозведение матрицы в степень\n\tНаша изначальная матрица\n");
    printa(matrix0);
    System.out.println("\nВ КАКУЮ СТЕПЕНЬ ХОТИТЕ ВОЗВЕСТИ МАТРИЦУ ?)\n");
    a= sc.nextInt();
    a-=1;
    if (a==0){
      printa(matrix0);
    } else {
            n = matrix0.length;
            int[][] c = new int[n][n];
            for (int nu =0; nu<a ; nu++){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (k = 0; k < n; k++) {
                        c[i][j] += matrix0[i][k] * matrix0[k][j];
                    }
                }
            }
            }
            printa(c);
            }


  }
  // МЕТОД ДЛЯ ПЕЧАТИ МАТРИЦЫ
  public static void printa(int[][] result1){
    for (int i = 0; i < result1.length; i++) {
        for (int j = 0; j < result1[i].length; j++) {
            System.out.print(result1[i][j] + " ");
        }
        System.out.println();}} 
  // ВОТ И ВЕСЬ МЕТОД ))0)))
}
