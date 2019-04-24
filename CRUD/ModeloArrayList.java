package CRUD;
import java.util.Scanner;

/**
 * Implementa la parte de Modelo de Datow
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class ModeloArrayList extends ModeloAbs
{
    private ArrayList <Producto> lista;
    Scanner sc=new Scanner(System.in);
    
    public ModeloArrayList()
    {
       lista=new ArrayList <Producto>();
    }

    // Implementar los metodos abstractos de ModeloAbs
    public boolean insertarProducto ( Producto p){
     
    	boolean retorno= false;
    	
    	if(p!=null) {
    	lista.add(p);
    	retorno = true;
    	}
    	
    	return retorno;    
    }
    
 
    public boolean borrarProducto ( int codigo ){
      boolean retorno=false;
      if(buscarProducto(codigo)!=null) {
    	  lista.remove(buscarProducto(codigo));
    	  retorno=true;
      }
      return retorno;
    }
    
    
    public Producto buscarProducto ( int codigo) {
        Producto r= null;
        
        for(int i=0;i<lista.size();i++) {
        	if(lista.get(i).getCodigo()==codigo) {
        		r=lista.get(i);
        		break;
        	}
        }
    	return r;
    }
    
    public void listarProductos (){
       
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
    
    public boolean modificarProducto (Producto nuevo){
      boolean resultado=false;

      return resultado;
    
}
}
