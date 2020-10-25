public  class Kelvin implements Temm{
  public static  void Kelvin(double x){
    Double result;
    //x=Integer.ToDouble(x);
    result=x+ Temm.CelsToKelvin;
    Kelvin K = new Kelvin();
    K.print(result);
  }

  public void print(Double x){
    System.out.print(x);
  }
}
