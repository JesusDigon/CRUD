package CRUD;

/**
 * Write a description of class ModeloHaspMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.HashMap;
import java.util.Map;

public class ModeloHashMap extends ModeloAbs
{
    private HashMap <Integer,Producto> lista;
    
    public ModeloHashMap()
    {
       lista=new HashMap  <Integer,Producto>();
    }

  public boolean insertarProducto ( Producto p) {
	  boolean retorno = false;
	 if (p!=null) {
		 lista.put(p.getCodigo(),p);
		 retorno= true;
	 }
	  return retorno;
  }
    
    public boolean borrarProducto ( int codigo ) {
    	 boolean retorno= false;
    	 if(lista.containsKey(codigo)) {
    		 lista.remove(codigo);
    		 retorno=true;
    	 }
    	 
    	 return retorno;
     }
    
     public Producto buscarProducto ( int codigo) {
    	 Producto retorno=null;
    	 if(lista.containsKey(codigo)) {
    		 retorno=lista.get(codigo);
    	 }
    	 return retorno;
     }
    
     public void listarProductos () {
    	 for(int i=0;i<lista.size();i++) {
    		 System.out.println(lista.get(i));
    	 }
     }
    
     public void listarPocoStock() {
    	 for (int i=0;i<lista.size();i++) {
     		if(lista.get(i).getStock_min()>=lista.get(i).getStock()) {
     			System.out.println(lista.get(i));
     		}
     	}
     }
    
     public boolean modificarProducto (Producto nuevo) {
    	 return true;
     }
    
}
