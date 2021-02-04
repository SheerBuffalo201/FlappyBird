package App.ElementosGraficos;
import javax.swing.*;
import App.*;


public class Bird extends Graficos{

  private Player player;
  private final static Bird bird = new Bird();

  public Bird (int x, int y, String nombre){
    int largo = 60;
    int ancho = 70;
    super(x,y, largo, ancho);
    this.player = new Player(nombre, 0);
    this.imagen = new JLabel();
    this.imagen.setBounds(this.x,this.y,largo,ancho);
    this.imagen.setIcon(Utilidades.rizeImage("..\\..\\imagenes\\murcielago 2.png",largo,ancho));
  }

  public static Bird getBird(){
    return bird;
  }

  public boolean mover(int dis, Obstaculo obs){
    int min = 900;
    int max = 0;
    this.y += dis;
    if (this.y < max || this.y > min)
      this.y = (this.y > min) ? min : max;
    this.imagen.setBounds(this.x,this.y,largo,ancho);

    //revisar si el pajaro muere
    animar();

    if (this.y > obs.getY() && this.y < obs.getLargo2())
      return true;
    else
      return false;

  }

  public void animar(){
    //Aquí va que onda con los sprites cuando descubra que pex con las imagenes
    //xDDD
  }

  public void aumentarPuntaje(){
    //?????????
  }
}
