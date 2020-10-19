public class Vektor implements OverVektor {
  
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

}
