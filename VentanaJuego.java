import javax.swing.*;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class VentanaJuego extends JFrame{
  private JLabel personaje;
  private JPanel panelJuego= new JPanel();
  private JPanel panelPuntuacion= new JPanel();
  private ManejadorEventos manejador;
  
  public JLabel imgUnidades;
  public JLabel imgDecenas;
  public JLabel imgCentenas;
  
  public VentanaJuego(ManejadorEventos manejador){
    super();
    this.manejador=manejador;
    this.manejador.setVentanaJuego(this);
    this.agregarVentana();
  }

  public void agregarVentana(){
    this.crearVentana();
		this.agregarPanel();
		this.agregarComponentes();
  }

  public void crearVentana(){
    this.setTitle("Flappy Bat");
    this.setSize(960,600);
    this.setLocationRelativeTo(null);
		
    this.setLayout(new BorderLayout());
    this.setResizable(false);

    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }
  
  public void agregarPanel(){

		JPanel panelMedioInterior = new JPanel();
		panelMedioInterior.setLayout(new BorderLayout());
		this.add(panelMedioInterior,BorderLayout.CENTER);

		this.panelJuego.setLayout(new FlowLayout());
		this.panelJuego.setBackground(Color.LIGHT_GRAY);
		this.panelPuntuacion.setLayout(new FlowLayout());
		this.panelPuntuacion.setBackground(Color.GREEN);
	
		panelMedioInterior.add(this.panelJuego,BorderLayout.SOUTH);
		panelMedioInterior.add(this.panelPuntuacion,BorderLayout.NORTH);
	}

  public void agregarComponentes(){
    this.personaje= new JLabel();
    this.personaje.setBounds(30,275,50,50);
    this.personaje.setIcon(ResizeImage("monoPrueba.png", 50, 50));
    this.panelJuego.add(this.personaje);
    
    imgCentenas.setBounds(750, 20, 50, 65);
    imgDecenas.setBounds(810, 20, 50, 65);
    imgUnidades.setBounds(870, 20, 50, 65);
    this.panelPuntuacion.add(imgCentenas);
    this.panelPuntuacion.add(imgDecenas);
    this.panelPuntuacion.add(imgUnidades);
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

  public void revalidarFrame(){
    revalidate();
    repaint();
  }
}