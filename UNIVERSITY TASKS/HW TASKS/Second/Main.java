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
    System.out.println("ПЕЧАТАЕМ МАТРИЦУ ВЫЧИТАНИЯ\n\n");
    // ПЕЧАТАЕМ МАТРИЦУ ВЫЧИТАНИЯ
    for (int i = 0; i < result.length; i++) {
        for (int j = 0; j < result[i].length; j++) {
            System.out.print(result[i][j] + " ");
        }
        System.out.println();
                                            } 


    System.out.println("\n\nПЕЧАТАЕМ МАТРИЦУ СЛОЖЕНИЯ\n\n");


    // ПЕЧАТАЕМ МАТРИЦУ СЛОЖЕНИЯ
    for (int i = 0; i < result1.length; i++) {
        for (int j = 0; j < result1[i].length; j++) {
            System.out.print(result1[i][j] + " ");
        }
        System.out.println();
                                            } 
  }
  
}
