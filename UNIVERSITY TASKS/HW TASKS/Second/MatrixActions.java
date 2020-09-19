import java.util.Random; // ИМПОРТИРУЕМ МОДУЛЬ РАНДОМА
class MatrixActions {

  // МЕТОД ДЛЯ ПЕЧАТИ МАТРИЦЫ
  public static void printa(int[][] result1){
    for (int i = 0; i < result1.length; i++) {
        for (int j = 0; j < result1[i].length; j++) {
            System.out.print(result1[i][j] + " ");
        }
        System.out.println();}} 
  // ВОТ И ВЕСЬ МЕТОД ))0)))

  public static int[][] create( int a, int b){

    Random rand = new Random();
    int[][] matrix = new int[a][b];
    for (int i = 0; i < a; i++){
      for (int c= 0; c < b; c++){
          matrix[i][c]=rand.nextInt(100); // идет рандомное число до 100 в матрицу
      }
    }
    return matrix;
  }

}
