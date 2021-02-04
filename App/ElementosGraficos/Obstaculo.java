package App.ElementosGraficos;
import javax.swing.*;
import java.awt.Image;
import App.*;

public class Obstaculo extends Graficos{
  private int y2;
  private JLabel imagen2;
  private int largo2; //sí va bien o crees que le falta algo?

  public Obstaculo(int x, int y, int y2, int largo, int largo2, int ancho){
    super(x,y, largo, ancho);
    this.y2 = y2;
    this.largo2 = largo2;

    this.imagen = new JLabel(); //Obstáculo de arriba
    this.imagen2 = new JLabel(); //Obstáculo de abajo

    this.imagen.setBounds(this.x,this.y,largo,ancho);
    this.imagen.setIcon(Utilidades.resizeImage("..\\..\\imagenes\\estalactita1.png",largo,ancho));

    this.imagen.setBounds(this.x,this.y2,largo2,ancho);
    this.imagen.setIcon(Utilidades.resizeImage("..\\..\\imagenes\\estalactita1.png",largo2,ancho));
  }

  public boolean mover(int dis){//si llegó al final debe eliminarse
    this.x -= dis;

    this.imagen.setBounds(this.x,this.y,largo,ancho);
    this.imagen2.setBounds(this.x,this.y2,largo2,ancho);

    return (this.x < (-1)*this.ancho) ? true : false;
  }

  public int getY(){
    return this.y;
  }

  public int getLargo2(){
    return this.largo2;
  }

  public void addJpanel(JPanel jp){
    jp.add(this.imagen);
    jp.add(this.imagen2);
  }

}
