import javax.swing.*;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaInicio extends JFrame{
  //atributos
  private JPanel panel= new JPanel();
  private JButton iniciarJuego;
  private JButton puntuaciones;

  public VentanaInicio(){
    super();
    this.agregarVentana();
  }
  //metodos
  //aqui se hace visible la ventana del JFrame
  public void agregarVentana(){
    this.crearVentana();
		this.agregarContenido();
		this.setVisible(true);
  }

  //aqui se instancia dicha ventana con su titulo, tamaño y layout y llama a crear un panel
  public void crearVentana(){
    this.setTitle("Flappy Bird");
    this.setSize(960,540);
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.crearPanel();
  }
  //aqui se crea el panel y se añade al JFrame, se usa un panel para cambiar de ventana despues
  public void crearPanel(){
    this.panel.setLayout(null);
		this.getContentPane().add(this.panel);
  }

  //aqui se crea el contenido y se añade al panel
  public void agregarContenido(){
    this.crearEtiquetaImagen(Administrador.RUTA_IMAGENES+"titulo.png", 100, 100, 480, 270);
    //el manejador de eventos funciona como ActionListener
    ManejadorEventos manejador = new ManejadorEventos(this);
    
    // este es la creacion del boton iniciarJuego y se añade al manejador de eventos
    this.iniciarJuego= new JButton("Iniciar Juego");
    this.iniciarJuego.setBounds(350, 280, 100,120);
		this.iniciarJuego.addActionListener(manejador);
		this.panel.add(this.iniciarJuego);

    //este es el boton puntuaciones, por default esta apagado hasta que se juegue una vez
    this.puntuaciones= new JButton("Puntuaciones");
    this.puntuaciones.setBounds(520, 280, 100,120);
		this.puntuaciones.addActionListener(manejador);
		this.puntuaciones.setEnabled(false);
		this.panel.add(this.puntuaciones);
  }
  //este metodo es para crear JLabel de imagenes
  public void crearEtiquetaImagen(String ruta, int x, int y, int largo, int ancho){
    //instanciacion
    JLabel etiqueta = new JLabel();
    //tamaño y coordenadas
		etiqueta.setBounds(x,y,largo,ancho);
    //pegar imagen
    etiqueta.setIcon(ResizeImage(ruta, largo, ancho));
    //se añade al panel
		this.panel.add(etiqueta);
  }
  //este metodo convierte la imagen en un icon para el jlabel y le cambia el tamaño
  public ImageIcon ResizeImage(String ImagePath, int largo, int ancho)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(largo, ancho, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
  //getters
  public JButton getBotonInicio(){
    return this.iniciarJuego;
  }

  public JButton getBotonPuntuacion(){
     return this.puntuaciones;
  }
}