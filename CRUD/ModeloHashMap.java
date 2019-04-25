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
    	 
    		 System.out.println(lista.values());
    	 
     }
    
     public void listarPocoStock() {
    	 for (Producto p : lista.values()) {
     		if(p.getStock_min()>=p.getStock()) {
     			System.out.println(p);
     		}
     	}
     }
    
     public boolean modificarProducto (Producto nuevo) {
    	 return true;
     }
    
}
