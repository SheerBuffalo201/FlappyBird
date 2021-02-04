package App;
import App.ElementosGraficos.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class ManejadorEventos implements ActionListener{
  private VentanaInicio ventanaInicio;
  private VentanaJuego ventanaJuego;
  private Bird personaje;

  public ManejadorEventos(VentanaInicio ventana){
    this.ventanaInicio=ventana;
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource()==this.ventanaInicio.getBotonInicio()){
      VentanaJuego ventanaJuego= new VentanaJuego(this);
      this.ventanaInicio.dispose();
    }
    else if(e.getSource()== this.ventanaInicio.getBotonPuntuacion()){
      //show archivo de puntuaciones
    }else{
      ventanaJuego.moverPajaro();
      System.out.println("Julio se la come");
    }

  }

	public void keyReleased(KeyEvent e){
		if(e.getKeyCode()==32){
      System.out.println("apretado");
      ventanaJuego.IniciarJuego();
      ventanaJuego.tiempo.start();
    }
	}
  //public void reloj

  public void setVentanaJuego(VentanaJuego ventana){
		this.ventanaJuego = ventana;
	}
  public void setBird(Bird personaje){
		this.personaje = personaje;
	}

}
