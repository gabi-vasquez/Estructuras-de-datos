public class Nodo {

    private int valor; //Variable o lista de variables para guardar datos
    private Nodo siguiente; //Atributo para guardar la referencia al siguiente nodo
   
    //Constructor por defecto
    public void Nodo() {
        this.valor = 0;
        this.siguiente = null;
    }
    //Metodos get y set
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public Nodo getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
