class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!"); // ТУТ ИДЕТ ЧИСТО ПРОВЕРКА, ШО ВСЕ РОБИТ XD
    // FIFTH TASK
    double x=(pow(7)); // ПОЛУЧАЕМ КВАДРАТ 7 
    double y=(pow(5)); // А ТУТ 5
    System.out.println(Math.sqrt(x+y)); // ТУТ Я РЕШИЛ ВОЗНЕСТИ В КОРЕНЬ ЧИСЛО БЕЗ МЕТОДА ))00))
    //SIXTH TASK
    x=527.021;
    x=nub(x);
    System.out.println((x));
    //SEVENTH TASK
    x=576213;
    x=sec(x);
    System.out.println((x));
  }
  public static int pow(int value) { // ЭТОТ МЕТОД ОТВЕЧАЕТ ЗА ВОЗВЕДЕНИЕ ЧИСЕЛ В СТЕПЕНЬ
    int powValue= 2;
    return (int) Math.pow(value, powValue);
  }
  public static double nub (double value){
    while (true){
      if (value%10== 0 || value<10) {
        return value;
                        }
      else{
        value=value%10;
          }
                } 
  }
  public static double sec(double value) { 
    value=value/10;
    while (true){
        if (value%10== 0 || value<10) {
        return (int) value;
                        }
      else{
        value=value%10;
          }
    }
  }
}
