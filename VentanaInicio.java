import javax.swing.*;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaInicio extends JFrame{
  private JPanel panel= new JPanel();
  private JButton iniciarJuego;
  private JButton puntuaciones;

  public VentanaInicio(){
    super();
    this.agregarVentana();
  }

  public void agregarVentana(){
    this.crearVentana();
		this.agregarContenido();
		this.setVisible(true);
  }

  public void crearVentana(){
    this.setTitle("Flappy Bird");
    this.setSize(960,540);
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.crearPanel();
  }

  public void crearPanel(){
    this.panel.setLayout(null);
		this.getContentPane().add(this.panel);
  }

  public void agregarContenido(){
    this.crearEtiquetaImagen("titulo.png", 30, 10, 480, 270);
    ManejadorEventos manejador = new ManejadorEventos(this);
    
    this.iniciarJuego= new JButton("Iniciar Juego");
    this.iniciarJuego.setBounds(350, 280, 100,120);
		this.iniciarJuego.addActionListener(manejador);
		this.panel.add(this.iniciarJuego);

    this.puntuaciones= new JButton("Puntuaciones");
    this.puntuaciones.setBounds(520, 280, 100,120);
		this.puntuaciones.addActionListener(manejador);
		this.puntuaciones.setEnabled(false);
		this.panel.add(this.puntuaciones);
  }

  public void crearEtiquetaImagen(String ruta, int x, int y, int largo, int ancho){
    JLabel etiqueta = new JLabel();
		etiqueta.setBounds(x,y,largo,ancho);
    etiqueta.setIcon(ResizeImage(ruta, largo, ancho));
		this.panel.add(etiqueta);
  }

  public ImageIcon ResizeImage(String ImagePath, int largo, int ancho)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(largo, ancho, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

  public JButton getBotonInicio(){
    return this.iniciarJuego;
  }

  public JButton getBotonPuntuacion(){
     return this.puntuaciones;
  }
}