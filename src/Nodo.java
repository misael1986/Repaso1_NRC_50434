public class Nodo {
    int valor;
    Persona p;
    Nodo siguiente;

    public Nodo(){//Constructor
    }

    public Nodo(int x,Nodo sig){//Constructor
        this.valor=x;
        this.siguiente=sig;
    }
}
