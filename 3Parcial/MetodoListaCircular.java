public class MetodoListaCircular {
    private Nodo cabecera; // Atributo para guardar la referencia al primer nodo de la lista

    // Constructor por defecto
    public MetodoListaCircular() {
        this.cabecera = null; // Inicializa la cabecera como nula
    }

    public boolean isEmpty() {
        return cabecera == null; // Verifica si la lista está vacía
    }

    public void insertarNodoInicio(int valor) {

        Nodo nuevoNodo = new Nodo(); // Crea un nuevo nodo
        nuevoNodo.setValor(valor); // Asigna el valor al nuevo nodo

        if (isEmpty()) { // Si la lista está vacía
            this.cabecera = nuevoNodo; // El nuevo nodo se convierte en la cabecera
            nuevoNodo.setSiguiente(cabecera); // El siguiente del nuevo nodo apunta a sí mismo
        } else {
            Nodo auxiliar = this.cabecera; // Variable auxiliar para recorrer la lista
            do {
                auxiliar = auxiliar.getSiguiente(); // Recorre hasta el último nodo
            } while (auxiliar.getSiguiente() != cabecera); // Recorre hasta el último nodo
            auxiliar.setSiguiente(nuevoNodo); // El último nodo apunta al nuevo nodo
            nuevoNodo.setSiguiente(cabecera); // El nuevo nodo apunta a la cabecera
            this.cabecera = nuevoNodo; // Actualiza la cabecera
        }
        System.out.println("Se ha insertado el nodo al inicio con valor: " + valor);
    }

    public void insertarNodoFinal(int valor) {
        Nodo nuevoNodo = new Nodo(); // Crea un nuevo nodo
        nuevoNodo.setValor(valor); // Asigna el valor al nuevo nodo

        if (isEmpty()) { // Si la lista está vacía
            this.cabecera = nuevoNodo; // El nuevo nodo se convierte en la cabecera
            nuevoNodo.setSiguiente(cabecera); // El siguiente del nuevo nodo apunta a sí mismo
        } else {
            Nodo auxiliar = this.cabecera; // Variable auxiliar para recorrer la lista
            do {
                auxiliar = auxiliar.getSiguiente(); // Recorre hasta el último nodo
            } while (auxiliar.getSiguiente() != cabecera);// Recorre hasta el último nodo
            auxiliar.setSiguiente(nuevoNodo); // El último nodo apunta al nuevo nodo
            nuevoNodo.setSiguiente(cabecera); // El nuevo nodo apunta a la cabecera
        }
        System.out.println("Se ha insertado el nodo al final con valor: " + valor);
    }

    // Imprimir la lista ]
    public void imprimirLista() {
        if (isEmpty()) { // Si la lista está vacía
            System.out.println("La lista está vacía");
        } else {
            Nodo auxiliar = this.cabecera; // Variable auxiliar para recorrer la lista
            do {
                System.out.print(auxiliar.getValor() + " -> "); // Imprime el valor del nodo
                auxiliar = auxiliar.getSiguiente(); // Avanza al siguiente nodo
            } while (auxiliar != cabecera); // Recorre hasta volver a la cabecera
            System.out.println("Cabecera"); // Indica que se ha llegado a la cabecera
        }
    }

    // Eliminar cabecera
    public void eliminarCabecera() {
        if (isEmpty()) { // Si la lista está vacía
            System.out.println("La lista está vacía");
        } else {
            Nodo auxiliar = this.cabecera; // Variable auxiliar para recorrer la lista
            do {
                auxiliar = auxiliar.getSiguiente(); // Recorre hasta el último nodo
            } while (auxiliar.getSiguiente() != cabecera); // Recorre hasta el último nodo
            auxiliar.setSiguiente(cabecera.getSiguiente()); // El último nodo apunta al siguiente de la cabecera
            this.cabecera = cabecera.getSiguiente(); // Actualiza la cabecera
            if (auxiliar == cabecera) { // Si la lista tiene un solo nodo
                this.cabecera = null; // La cabecera se convierte en nula
            }
        }
        System.out.println("Se ha eliminado la cabecera con valor: " + cabecera.getValor()); // Imprime el valor de la
                                                                                             // cabecera eliminada
    }

    // Eliminar todo
    public void eliminarTodo() {
        this.cabecera = null; // La cabecera se convierte en nula
        System.out.println("Se ha eliminado toda la lista"); // Imprime que se ha eliminado toda la lista
    }

    public void eliminarNodoFinal() {
    }

    public boolean buscar(int valor) {
        if (isEmpty()) {
            return false; // Si la lista está vacía, no se encuentra el valor
        }
        Nodo auxiliar = this.cabecera; // Variable auxiliar para recorrer la lista
        do {
            if (auxiliar.getValor() == valor) { // Si se encuentra el valor
                return true; // Retorna verdadero
            } else {
                auxiliar = auxiliar.getSiguiente(); // Avanza al siguiente nodo
            }
        } while (auxiliar != cabecera); // Recorre hasta volver a la cabecera
        return false; // Si no se encuentra el valor, retorna falso
    }

    public void eliminarNodoBuscado(int elementoBuscar) {
        if (isEmpty()) { // Si la lista está vacía
            System.out.println("La lista está vacía");
        } else {
            Nodo auxiliar, anterior = cabecera; // Variable auxiliar para recorrer la lista
            do {
                if (anterior.getSiguiente().getValor() == elementoBuscar) { // Si se encuentra el valor
                    auxiliar = anterior.getSiguiente(); // El nodo auxiliar apunta al siguiente de anterior
                    auxiliar.setSiguiente(auxiliar.getSiguiente()); // Elimina el nodo
                    if (auxiliar == cabecera) { // Si el nodo a eliminar es la cabecera
                        this.cabecera = auxiliar.getSiguiente(); // Actualiza la cabecera
                    }
                    if (auxiliar == cabecera) {
                        cabecera = null; // Si la lista tiene un solo nodo, la cabecera se convierte en nula
                    }
                    System.out.println("Se ha eliminado el nodo con valor: " + elementoBuscar); // Imprime el valor del
                                                                                                // nodo eliminado
                    return; // Sale del método
                } else {
                    anterior = anterior.getSiguiente(); // Avanza al siguiente nodo
                }
            } while (anterior != cabecera); // Recorre hasta volver a la cabecera
            System.out.println("No se ha encontrado el nodo con valor: " + elementoBuscar); // Imprime que no se ha
                                                                                            // encontrado el nodo
        }
    }
}
