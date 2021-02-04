package App; 
import java.awt.Image;
import javax.swing.*;

public class Utilidades{
  //julio si ves esto necesito que hagas metodos para obtener las
  //decenas, centenas y unidades de la puntuacion actual
  //esto para poder cambiar y actualizar con eventos el numero
  //en pantalla de puntuacion
  public static int unidades(int score){
    return 0;
  }
  public static int decenas(int score){
    return 0;
  }
  public static int centenas(int score){
    return 0;
  }

  public static ImageIcon resizeImage(String ImagePath, int largo, int ancho)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(largo, ancho, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
}