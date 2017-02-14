
package pseudo_scrabble;


public class Nodo {
    Object dato;// creacion de varialbes 
    Nodo siguiente ;
    Nodo anterior;

    public Nodo(Object valor){
    this.dato= valor;
    }
    
    public void setsiguiente(Nodo sig){
    
        this.siguiente = sig ;
        
    }
    
    public void getanterior(Nodo ant){
        
    this.anterior=ant;
    
    }
    
    public Nodo getsiguiente(){// metodo a llamar para el retorno del nodo siguiente 
    return siguiente;
    }
    
    public Nodo getanterior(){// metodo a llamar para el retorno del nodo anterior 
    return anterior ;
    }
    
    public Object getdato(){
    return dato;
    }
    public static void main(String[] args ){// main para probar la lista 
       Nodo nodo1= new Nodo("algo");
       Nodo nodo2= new Nodo("casa");
       Nodo nodo3= new Nodo("perro");
       Nodo inicio;
       nodo1.setsiguiente(nodo2);
       inicio=nodo1.getsiguiente(); 
        System.out.println(inicio.getdato());
    }
}
