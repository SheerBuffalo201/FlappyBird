package App;
import javax.swing.*;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.*;

public class VentanaJuego extends JFrame{
  //atributos
  private JLabel personaje; //este habria que cambiarlo por el que haga emy
  private JPanel panelJuego= new JPanel();
  private JPanel panelPuntuacion= new JPanel();
  private ManejadorEventos manejador;

  //estos son los jlabel de la puntuacion
  public JLabel imgUnidades;
  public JLabel imgDecenas;
  public JLabel imgCentenas;

  public VentanaJuego(ManejadorEventos manejador){
    super();
    this.manejador=manejador;
    this.manejador.setVentanaJuego(this);
    this.agregarVentana();
  }
  //metodos
  //aqui se hace visible este JFrame
  public void agregarVentana(){
    this.crearVentana();
		this.agregarPanel();
		this.agregarComponentes();
    this.setVisible(true);
  }

  //aqui se instancia el JFrame con su titulo, tamaño y layout
  public void crearVentana(){
    this.setTitle("Flappy Bat");
    this.setSize(960,600);
    this.setLocationRelativeTo(null);

    this.setLayout(new BorderLayout());
    this.setResizable(false);

    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }

  //aqui se construyen dos paneles, uno para la puntuacion y uno para el juego en si
  public void agregarPanel(){

    //se crea el JPanel que contiene a los paneles de juego y puntuacion
		JPanel panelMedioInterior = new JPanel();
		panelMedioInterior.setLayout(new BorderLayout());
		this.add(panelMedioInterior,BorderLayout.CENTER);

    //se instancia el panel de juego y de puntuacion
		this.panelJuego.setLayout(new FlowLayout());
		this.panelJuego.setBackground(Color.CYAN);
		this.panelPuntuacion.setLayout(new FlowLayout());
		this.panelPuntuacion.setBackground(Color.GREEN);

    //se añaden los paneles al JFrame y panel interior
		panelMedioInterior.add(this.panelJuego,BorderLayout.CENTER);
		this.add(this.panelPuntuacion,BorderLayout.NORTH);
	}

  public void agregarComponentes(){
    //aqui estoy instanciando y añadiendo el personaje pero se va a cambiar por lo de Emy
    this.personaje = new JLabel();
    this.personaje.setBounds(30,275,50,50);
    this.personaje.setIcon(Utilidades.resizeImage(Administrador.RUTA_IMAGENES+"monoPrueba.png", 50, 50));
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
    etiqueta.setIcon(Utilidades.resizeImage(ruta, largo, ancho));
		this.panelPuntuacion.add(etiqueta);
  }

  public void revalidarFrame(){
    revalidate();
    repaint();
  }
}
