public class Vektor implements OverVektor {
  
  private int x;
  private int y;
  private int z;

  public Vektor (int x ,int y ){
    this.x=x;
    this.y=y;
  }
  
  public int getX() {
    return x;
   }

  public int getY() {
    return y;
   }

  public int getZ() {
    return z;
   }



  @Override
  public double getVLen (int ... value){
    double leng=0;
    if (value.length == 2){
      leng = Math.sqrt(Math.pow(value[0], 2)+ value[1]*value[1]);
    }

    else if (value.length == 3){
      leng = Math.sqrt(Math.pow(value[0], 2)+ value[1]*value[1]+ Math.pow(value[2], 2));
    }

    return leng;
  }

  @Override
  public Vektor getVSum(Vektor v){
    double sum=0;
    int x1=x+v.x;
    int y1=y+v.y;
    int z1=y+v.z;
    return new Vektor (x1,y1,z1);
    
  }

}
