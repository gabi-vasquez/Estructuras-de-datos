public class ListaCircular {
    public static void main(String[] args) {
        System.out.println("Lista Circular");
        MetodoListaCircular lista = new MetodoListaCircular(); // Crea una nueva lista circular
        lista.insertarNodoInicio(10); // Inserta un nodo con valor 10
        lista.insertarNodoInicio(20); // Inserta un nodo con valor 20
        lista.insertarNodoInicio(30); // Inserta un nodo con valor 30
        lista.insertarNodoInicio(40); // Inserta un nodo con valor 40
        lista.insertarNodoInicio(50); // Inserta un nodo con valor 50

        lista.insertarNodoFinal(60); // Inserta un nodo con valor 60 al final
        lista.insertarNodoFinal(70); // Inserta un nodo con valor 70 al final
        lista.insertarNodoFinal(80); // Inserta un nodo con valor 80 al final

        lista.imprimirLista(); // Imprime la lista circular
        System.out.println("-----------------------------");
        lista.eliminarCabecera(); // Elimina la cabecera de la lista
        System.out.println(lista.buscar(50) ? "El elemento esta dentro de la lista ": "El elemnto no esta en la lista"); // Busca el nodo con valor 50
        System.out.println(lista.buscar(90)); // Busca el nodo con valor 90

        lista.eliminarNodoBuscado(50); // Elimina el nodo con valor 50
        lista.imprimirLista(); // Imprime la lista circular después de eliminar el nodo
        
    }
}
