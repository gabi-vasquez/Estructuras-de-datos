public class MetodoPila {
    // Puntero que indica el tope de la pila o tambien conocida como tope de la pila
    private Nodo tope;

    public MetodoPila() {
        this.tope = null; // Inicializa el puntero a null
    }

    /**
     * Consulta si la pila esta vacia
     * 
     * @return true si la pila esta vacia, false en caso contrario
     */
    public boolean isEmpty() {
        return tope == null; // Si el puntero es null, la pila esta vacia
    }

    // Metodo de apilar o push para agregar un nuevo nodo a la pila

    public void apilar(int valor) {
        Nodo nuevo = new Nodo(); // Crea un nuevo nodo
        nuevo.setValor(valor); // Asigna el valor al nuevo nodo
        if (isEmpty()) { // Si la pila esta vacia
            tope = nuevo; // El nuevo nodo es el tope de la pila
        } else {
            nuevo.setSiguiente(tope); // El siguiente del nuevo nodo es el tope actual
            tope = nuevo; // El nuevo nodo es el nuevo toprx de la pila
        }
    }

    // Metodo de desapilar o pop para eliminar el nodo del tope de la pila
    public int desapilar() {
        if (!isEmpty()) {
            int dato = tope.getValor(); // Guarda el valor del nodo a eliminar
            tope = tope.getSiguiente(); // Elimina el nodo del tope
            return dato; // Devuelve el valor del nodo eliminado
        } else {
            System.out.println("La pila esta vacia"); // Si la pila esta vacia, muestra un mensaje
            return Integer.MAX_VALUE; // Devuelve -1 si la pila esta vacia
        }
    }

    public boolean buscar(int aBuscar){
        Nodo aux = tope; // Crea un nodo auxiliar para recorrer la pila
        boolean encontrado = false;
        while(encontrado != true && aux != null){ // Mientras el nodo auxiliar no sea null
            if(aBuscar == aux.getValor()){ // Si el valor a buscar es igual al valor del nodo auxiliar
                encontrado = true; // Se ha encontrado el valor
            }else{
                aux = aux.getSiguiente(); // Avanza al siguiente nodo
            }
        }
        return encontrado; // Devuelve true si se ha encontrado el valor, false en caso contrario
    }

    public void eliminar(){
        tope = null; // Elimina el tope de la pila
    }
    
    public void retirar(){
        if(!isEmpty()){
            tope = tope.getSiguiente(); // Elimina el nodo del tope
        }
    }
    public int cantidadElementos(){
        int cantidad = 0;
        Nodo aux = tope;
        while(aux != null){
            cantidad++; // Aumenta la cantidad de nodos
            aux = aux.getSiguiente(); // Avanza al siguiente nodo
        }
        return cantidad; // Devuelve la cantidad de nodos
    }

    public void mostrarPila() {
        if (!isEmpty()) {
            Nodo aux = tope; // Crea un nodo auxiliar para recorrer la pila
            while (aux != null) { // Mientras el nodo auxiliar no sea null
                System.out.print("\t" + aux.getValor() + " \t"); // Muestra el valor del nodo
                aux = aux.getSiguiente(); // Avanza al siguiente nodo
            }
            System.out.println(); // Salto de linea
        } else {
            System.out.println("La pila esta vacia"); // Si la pila esta vacia, muestra un mensaje
        }
    }
}
