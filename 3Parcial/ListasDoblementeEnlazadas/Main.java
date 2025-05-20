public class Main {
    // Gabriela Orozco Vasquez, Luis ALejandro Tosne Idrobo
    public static void main(String[] args) throws Exception {

        ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();
        lista.insertarAlPrincipio(10);
        lista.insertarAlFinal(12);
        lista.insertarOrdenado(22);
        lista.insertarOrdenado(31);

        lista.mostrarDesdePrimero();

        System.out.println("\nActualizar 22 por tercer nodo 16");
        lista.modificarNodo(22, 16);

        lista.mostrarDesdePrimero();

        System.out.println("\nEliminar el 12 de la lista ");
        lista.eliminarNodo(12);

        lista.mostrarDesdeUltimo();

        System.out.println("\nFin de ejemplo ");
    }
}
