package App.ElementosGraficos;
import java.lang.Math;

public class Obstaculos{
  private ArrayList<Obstaculo> arr;

  public Obstaculos(){
    arr = new ArrayList<Obstaculo>();
  }

  public void crear(){
    int max = 470;
    int largo = (int)(Math.random()*max);
    int x = 960;
    int ancho = 40;
    int tamPajaro = 90;
    int tamVentanalargo = 600;
    int y2 = largo + tamPajaro;
    arr.add(new Obstaculo(x, 0, y2 , largo, tamVentanalargo - y2,ancho));
  }

  public void moverObs(){
    for(Obstaculo obs : this.arr){
      if(obs.mover(5)) //Sí el obstáculo ya no sale en la pantalla hay que eliminarlo
        this.arr.remove(obs);
    }
  }

  public void dibujarImg(JPanel jp){
    for(Obstaculo obs : this.arr)
      jp.add(obs);
  }

}
