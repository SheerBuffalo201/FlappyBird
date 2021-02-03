import java.io.Serializable;

/**
@author
**/

public class Player implements Comparable<Player>, Serializable{
  private String name;
  private int score;

  /**
  Constructor que inicializa los datos del jugador 
  @param name Nombre del jugador
  @param score Puntaje 
  **/
  public Player(String name, int score){
    this.name = name;
    this. score = score;
  }

  /**
  Modificar su puntaje 
  @param score Nuevo puntaje 
  **/
  public void setScore(int score){
    this.score = score;
  }

  /**
  Modificar su nombre
  @param score Nuevo nombre  
  **/
  public void setName(String name){
    this.name = name;
  }

  /**
  Obtener su puntaje 
  @return Puntaje actual
  **/
  public int getScore(){
    return this.score;
  }

  /**
  Obtener su nombre
  @return Nombre del jugador
  **/
  public String getName(){
    return this.name;
  }

  @Override
  public String toString(){
    return this.name + "\t\t" + String.valueOf(this.score);
  }

  /**
  Obtener su nombre
  @param player 
  **/
  @Override
  public int compareTo(Player p){
    return p.getScore() - this.score;
  }

 }
