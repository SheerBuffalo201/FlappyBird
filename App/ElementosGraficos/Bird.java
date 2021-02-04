package App.ElementosGraficos;
import App.*;
import javax.swing.*;


public class Bird extends JLabel{

  //private Player player;
  private int x=0;
  private int y=0;
  private int yvel=15;
  private int gravedad=5;


  public Bird(){
    super();
    this.crearPersonaje();
  }

  public void crearPersonaje(){
    this.setBounds(this.x,this.y,50,50);
    this.setIcon(Utilidades.resizeImage(Administrador.RUTA_IMAGENES+"murcielago.png", 50, 50));
  }

  public void mover(int dis){
    int min = 0;
    int max = 0;
    this.y += dis;
    if (this.y > max || this.y < min)
      this.y = (this.y < min) ? min : max;
    this.setBounds(this.x,this.y,50,50);
  }

  public void brincalemipana(){
    this.yvel+=20;

  }
  public void muevete(){

    this.yvel-=this.gravedad;
    this.y+=this.yvel;
    repaint();

  }
  public int comprobarlugar(int xdo){
       if(this.x==xdo){
         return 1;
       }
       return 0;
  }

}
