public  class Farengeit implements Temm{

  public static void Farengeit(Double x ){
    Double result;
    result= x* Temm.CelsToFaren;
    Farengeit F = new Farengeit();
    F.print(result);
  }

  public void print(Double result){
    System.out.print(result);
  }
}
