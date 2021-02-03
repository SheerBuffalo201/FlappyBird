import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class ManejadorEventos implements ActionListener{
  private VentanaInicio ventanaInicio;
  private VentanaJuego ventanaJuego;

  public ManejadorEventos(VentanaInicio ventana){
    this.ventanaInicio=ventana;
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource()==this.ventanaInicio.getBotonInicio()){
      VentanaJuego ventanaJuego= new VentanaJuego(this);
      this.ventanaInicio.dispose();
    }
    if(e.getSource()== this.ventanaInicio.getBotonPuntuacion()){
      //show archivo de puntuaciones
    }
  }
	
	public void keyReleased(KeyEvent e){
		if(e.getKeyCode()==32){
      //if(juego aun no empieza){
        //empieza
      //}else
      //pajaro vuela
    }
	}
  //public void reloj

  public void setVentanaJuego(VentanaJuego ventana){
		this.ventanaJuego = ventana;
	}
}