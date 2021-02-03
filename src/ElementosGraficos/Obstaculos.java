package ElementosGraficos; 
import java.lang.Math;

public class Obstaculos{
  private ArrayList<Obstaculo> arr; 

  public Obstaculos(){
    arr = new ArrayList<Obstaculo>(); 
  }

  public void crear(){
    int min = 0; 
    int max = 0; 
    int largo = (int)(Math.random()*max) + min; 
    int x = 0; 
    int tamPajaro, tamVentana = 0; //No me sé las dimensiones de las cosas :c 
    int y2 = largo + tamPajaro;
    arr.add(new Obstaculo(x, 0, y2 , largo, tamVentana - y2)); 
  }

}