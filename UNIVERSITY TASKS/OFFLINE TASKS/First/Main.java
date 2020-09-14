public class Main {
  public static void main(String[] args){
    // static - модификатор. У класса - не требует создание экзмепляра.  
    // public - мы сможем его увидеть его в других файлах и не только
    // private - Видеть его могут только в нашем классе
    int A []= new int[10]; // [] - объявление массива . int[10] - размер массива
    // int A - создание динамического массива

    for (int i =0; i <10; i++){
      A[i]=i;
      System.out.println("A[i] = "+ i + " "+ A[i]);
    }
  }

  MatrixCreate matrix1 = new MatrixCreate(5,10);

  int A[][];
}
