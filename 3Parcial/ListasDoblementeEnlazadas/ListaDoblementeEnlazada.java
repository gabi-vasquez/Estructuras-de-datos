public class ListaDoblementeEnlazada {
    private Nodo cabecera; // Nodo inicial de la lista dobelemente enlazada

    // Constructor de la lista
    public ListaDoblementeEnlazada() {
        cabecera = null;
    }

    // Metodo que verifica si la lista esta vacia
    public boolean esVacia() {
        return cabecera == null;
    }

    // Metodo que mueve cabecera al ultimo nodo de la lista
    public void moverCabeceraAlPrimero() {
        if (!esVacia()) {
            // Recorre hacia atras hasta el ultimo nodo
            while (cabecera.getAnterior() != null) {
                cabecera = cabecera.getAnterior();
            }
        }
    }

    // Metodo que mueve la cabecera al primer nodo de la lista
    public void moverCabeceraAlUltimo() {
        if (!esVacia()) {
            // Recorre hacia adelante hasta el primer nodo
            while (cabecera.getSiguiente() != null) {
                cabecera = cabecera.getSiguiente();
            }
        }
    }

    // Metodo que muestra los valores deszde el primer nodo de la lista
    public void mostrarDesdePrimero() {
        if (esVacia()) {
            return;
        }
        // Se ubica en el primer nodo
        moverCabeceraAlPrimero();
        Nodo auxiliar = cabecera;
        while (auxiliar != null) {
            System.out.println(auxiliar.getValor());
            auxiliar = auxiliar.getSiguiente();
        }
    }

    // Metodo que muestra los valores desde el ultimo nodo de la lista
    public void mostrarDesdeUltimo() {
        if (esVacia()) {
            return;
        }
        // Se ubica en el ultimo nodo
        moverCabeceraAlUltimo();
        // Recorre la lista hacia atras
        Nodo auxiliar = cabecera;
        while (auxiliar != null) {
            System.out.println(auxiliar.getValor());
            auxiliar = auxiliar.getAnterior();
        }
    }

    // Metodo que inserta un nodo al principio de la lista
    public void insertarAlPrincipio(int valor) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setValor(valor);
        if (esVacia()) {
            cabecera = nuevoNodo;
        } else {
            // Se ubica en el primer nodo
            moverCabeceraAlPrimero();
            // Se enlaza el nuevo nodo con el primer nodo
            nuevoNodo.setSiguiente(cabecera);
            cabecera.setAnterior(nuevoNodo);
            // Se actualiza la cabecera
            cabecera = nuevoNodo;
        }
    }

    // Metodo que inserta un nodo al final de la lista
    public void insertarAlFinal(int valor) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setValor(valor);
        if (esVacia()) {
            cabecera = nuevoNodo;
        } else {
            // Se ubica en el ultimo nodo
            moverCabeceraAlUltimo();
            // Se enlaza el nuevo nodo con el ultimo nodo
            nuevoNodo.setAnterior(cabecera);
            cabecera.setSiguiente(nuevoNodo);
        }
    }

    // Metodo que inserta un nodo de forma ordenada conforme ingresen
    public void insertarOrdenado(int valor) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setValor(valor);
        if (esVacia()) {
            cabecera = nuevoNodo;
        } else {
            // Se ubica en el primer nodo
            moverCabeceraAlPrimero();
            // Recorre la lista hacia adelante
            while (cabecera.getSiguiente() != null && valor > cabecera.getValor()) {
                // Se ubica en el siguiente nodo
                cabecera = cabecera.getSiguiente();
            }
            if (cabecera.getAnterior() == null && valor < cabecera.getValor()) {
                // Se inserta al principio
                nuevoNodo.setSiguiente(cabecera);
                cabecera.setAnterior(nuevoNodo);
                cabecera = nuevoNodo;
            } else {
                if (cabecera.getSiguiente() == null && valor > cabecera.getValor()) {
                    // Se inserta al final
                    nuevoNodo.setAnterior(cabecera);
                    cabecera.setSiguiente(nuevoNodo);
                } else {
                    // Se inserta en el medio
                    nuevoNodo.setSiguiente(cabecera);
                    nuevoNodo.setAnterior(cabecera.getAnterior());
                    cabecera.getAnterior().setSiguiente(nuevoNodo);
                    cabecera.setAnterior(nuevoNodo);
                }
            }
        }
    }

    // Metodo para buscar un nodo en la lista
    public boolean buscar(int valor) {
        if (esVacia()) {
            return false;
        }
        moverCabeceraAlPrimero();
        Nodo auxiliar = cabecera;
        while (auxiliar != null) {
            if (auxiliar.getValor() == valor) {
                return true;
            } else {
                auxiliar = auxiliar.getSiguiente();
            }
        }
        return false;
    }

    // Metodo para modificar un nodo en la lista
    public void modificarNodo(int valor, int nuevoValor) {
        if (esVacia()) {
            return;
        }
        moverCabeceraAlPrimero();
        Nodo auxiliar = cabecera;
        while (auxiliar != null) {
            if (auxiliar.getValor() == valor) {
                auxiliar.setValor(nuevoValor);
                return;
            } else {
                auxiliar = auxiliar.getSiguiente();
            }
        }
    }

    // Metodo para eliminar un nodo en la lista

    public void eliminarNodo(int valor) {
        if (esVacia()) {
            return;
        }

        // Primero nos posicionamos al inicio de la lista
        moverCabeceraAlPrimero();

        Nodo auxiliar = cabecera;

        // Recorremos la lista buscando el nodo a eliminar
        while (auxiliar != null) {
            if (auxiliar.getValor() == valor) {
                // Caso 1: Es el único nodo en la lista
                if (auxiliar.getAnterior() == null && auxiliar.getSiguiente() == null) {
                    cabecera = null;
                    return;
                }

                // Caso 2: Es el primer nodo de la lista
                if (auxiliar.getAnterior() == null) {
                    cabecera = auxiliar.getSiguiente();
                    cabecera.setAnterior(null);
                    auxiliar.setSiguiente(null);
                    return;
                }

                // Caso 3: Es el último nodo de la lista
                if (auxiliar.getSiguiente() == null) {
                    auxiliar.getAnterior().setSiguiente(null);
                    auxiliar.setAnterior(null);
                    // Si el nodo eliminado era la cabecera, movemos la cabecera al nuevo último
                    if (auxiliar == cabecera) {
                        cabecera = auxiliar.getAnterior();
                    }
                    return;
                }

                // Caso 4: Es un nodo intermedio
                auxiliar.getAnterior().setSiguiente(auxiliar.getSiguiente());
                auxiliar.getSiguiente().setAnterior(auxiliar.getAnterior());

                // Si el nodo eliminado era la cabecera, actualizamos la cabecera
                if (auxiliar == cabecera) {
                    cabecera = auxiliar.getSiguiente();
                }

                // Desconectamos el nodo eliminado de la lista
                auxiliar.setAnterior(null);
                auxiliar.setSiguiente(null);
                return;
            }

            auxiliar = auxiliar.getSiguiente();
        }
    }
}
