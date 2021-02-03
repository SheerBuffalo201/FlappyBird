package ElementosGraficos; 
import javax.swing.JLabel;

public class Graficos{
  protected int x; 
  protected int y; 
  protected int ancho; 
  protected int largo; 
  protected JLabel imagen; 

  public Graficos(int x, int y, int ancho, int largo){
    this.x = x; 
    this.y = y; 
    this.largo = largo; 
    this.ancho = ancho; 
  }

  abstract mover(int dis);
}