package ElementosGraficos;  

public class Obstaculo extends Graficos{
  private int y2;
  private JLabel imagen2; 
  private int largo2; //sí va bien o crees que le falta algo? 

  public Obstaculo(int x, int y, int y2, int largo, int largo2){
    super(x,y, largo, ancho); 
    this.y2 = y2; 
    this.largo2 = largo2; 

    this.imagen = new JLabel(); //Obstáculo de arriba
    this.imagen2 = new JLabel(); //Obstáculo de abajo

    this.imagen.setBounds(this.x,this.y,largo,ancho);
    this.imagen.setIcon(ResizeImage(Administrador.RUTA_IMAGENES+"Ruta",largo,ancho));

    this.imagen.setBounds(this.x,this.y2,largo2,ancho);
    this.imagen.setIcon(ResizeImage(Administrador.RUTA_IMAGENES+"Ruta",largo2,ancho));
  }

  public boolean mover(int dis){
    this.x -= dis;  

    //si es menor que 0 debe eliminarse el objeto, no? 
//que significa el simbolo de pregunta? es un operador ternario 
    /*
    if(condicion)
      x = min
    else 
      x = max
    ¨es eso pero en chiquito oye jajaja me di cuenta que solo necesita el min porque solo avanza xd*/
    this.imagen.setBounds(this.x,this.y,largo,ancho);
    this.imagen2.setBounds(this.x,this.y2,largo2,ancho);

    return (this.x < 0) ? true : false;
  }

}