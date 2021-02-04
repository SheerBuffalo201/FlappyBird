package App.ElementosGraficos; 
import javax.swing.*;


public class Bird extends Graficos{

  private Player player; 

  public Bird (int x, int y, String nombre){
    int largo = 0; 
    int ancho = 0; 
    super(x,y, largo, ancho); 
    this.player = new Player(nombre, 0); 
    this.imagen = new JLabel(); 
    this.imagen.setBounds(this.x,this.y,largo,ancho);
    this.imagen.setIcon(ResizeImage("Ruta",largo,ancho));
  }

  public void mover(int dis){
    int min = 0; 
    int max = 0; 
    this.y += dis; 
    if (this.y > max || this.y < min)
      this.y = (this.y < min) ? min : max; 
    this.imagen.setBounds(this.x,this.y,largo,ancho);
    animar(); 
  }

  public void animar(){
    //Aquí va que onda con los sprites cuando descubra que pex con las imagenes 
    //xDDD
  }

  public void aumentarPuntaje(){
    //????????? 
  }
}