package App;
import java.io.File;
import java.util.ArrayList;

public class Administrador{
  public final static String RUTA_IMAGENES="./imagenes/";
  File dirImagenes = new File(RUTA_IMAGENES);
	ArrayList<String> listaImagenes = new ArrayList<String>();



  public boolean buscarImagenes(){
		String[] cadenaImagenes = dirImagenes.list();

		for(int i=0;i<cadenaImagenes.length;i++){
			String temporal = cadenaImagenes[i];
			listaImagenes.add(i,temporal);
		}

		if(listaImagenes == null){
			return false;
		}
		else{
			return true;
		}
	}
	public ArrayList<String> getListaImagenes(){
		return this.listaImagenes;
	}
}
