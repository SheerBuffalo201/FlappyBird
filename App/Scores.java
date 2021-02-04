package App; 
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.util.Arrays;

/**
Clase para acceder y manipular los puntajes más altos.
@author
**/

public class Scores{
  private Player[] scores;
  private int size;
  private String fileName;

  /**
  Constructor que define dónde se encuentran almacenados los registros.
  También los carga en la memoria RAM para agilizar su acceso
  **/
  public Scores(){
    size = 5;
    scores = new Player[size];
    fileName = ".\\src\\scores.ooo";
    readScores();
  }

  /*
  Cargar en la memoria principal los mejores puntajes.
  De no existir el archivo lo crea y lo llena con puntajes vaciós
  Se deserializan los objetos
  */
  private void readScores(){
    try{
      File file = new File(this.fileName);
      if(!file.createNewFile()){
        ObjectInputStream inF = new ObjectInputStream(new FileInputStream(file));

        for(int i = 0; i < this.size - 1; i++ )
          this.scores[i] = (Player) inF.readObject();

        inF.close();
      }else{

        for(int i = 0; i < this.size; i++ )
          this.scores[i] = new Player("-", 0);

        writeScores();
      }
    }catch(Exception e){
      System.out.printf("Algo salió mal :c");
    }
  }

  /**
  Revisa si el puntaje obtenido es mayor que el que se encuentra en la última posición,
  de ser así procede a ordenarlos y a actualizar el contenido del archivo que los almacena

  @param player Nombre y puntaje del jugador
  **/
  public boolean addScore(Player player){
    if (this.scores[this.size - 1].compareTo(player) <= 0)
      return false;
    this.scores[this.size - 1] = player;
    Arrays.sort(this.scores);
    writeScores();
    return true;
  }

  /*
  Actualizar los puntajes en el archivo correspondiente.
  Se serealizan los objetos
  */
  private void writeScores(){
    try{
      ObjectOutputStream outF = new ObjectOutputStream(new FileOutputStream(this.fileName));

      for(int i = 0; i < this.size; i++)
         outF.writeObject(this.scores[i]);

      outF.close();

    }catch(Exception e){
      System.out.printf("Algo salió mal :c");
    }
  }

  /**
  Regresa los puntajes más altos hasta el momento
  @return Arreglo con objetos de tipo Player
  **/
  public Player[] getScores(){
    return scores;
  }

}
