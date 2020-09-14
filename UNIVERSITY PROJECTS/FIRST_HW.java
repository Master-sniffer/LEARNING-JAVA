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
    //EIGHT TASK
    int z=25; // Подумать, как менять тип переменной
    System.out.println((z/10));
    // NINTH TASK
    System.out.println((raznisa(10,40, 21)));
    //TENTH TASK
    System.out.println(just_nums(5,10));
    //ELEVENTH TASK
    System.out.println(geom_korn(5.0,10.0));
    //TWELTH TASK
    System.out.println(easy_peasy_lemon_squeazy(5,10,2,4));
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
  public static String raznisa(int value1, int value2, int value3){
    String result = "";
    value1-=21;
    value2-=21;
    value3-=21;
    result+=(value1+" "+value2+" "+value3);
    return result;
  }
  public static double just_nums(double value1, double value2){
    return ((value1+value2)/2);
  }
  public static double geom_korn(double base, double base1) {
    return Math.pow(Math.E, Math.log(base*base1)/2.0);
    }
  public static double easy_peasy_lemon_squeazy(double x1, double x2, double y1, double y2){
    double resultX; double resultY;
    if (x1>x2){
      resultX=x1-x2;
    }
    else{
      resultX=x2-x1;
    }

    if (y1>y2){
      resultY=y1-y2;
    }
    else{
      resultY=y2-y1;
    }
    resultX=Math.pow(resultX, 2.0);
    resultY=Math.pow(resultY, 2.0);
    double result;
    result=resultY+resultX;
    result=Math.sqrt (result);
    return result;
  }
}



//!!!!!SECOND METHOD TO DO NINTH TASK
  public static String raznisa(int value1, int value2, int value3){
    String result = "";
    if (value1 > 21){
      value1=value1-21;
    }
    else {
      value1=21-value1;
    }

    if (value2 > 21){
      value2=value2-21;
    }
    else {
      value2=21-value2;
    }

    if (value3 > 21){
      value3=value3-21;
    }
    else {
      value3=21-value3;
    }
    result+=(value1+" "+value2+" "+value3);
    return result;
  }
