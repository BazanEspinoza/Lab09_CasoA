//BazanEspinoza
package lab09_casoa;

/**
 *
 * @author s
 */
public class IteratorDemo {

    static void mostrarCursos(String titulo, CursosInterface col) {
        System.out.println(titulo);
        Iterator it = col.crearIterator();
        it.first();
        while (it.hasNext()) System.out.println(it.next());
    }

    public static void main(String[] args) {
        System.out.println("Iterator Pattern Demo\n");

        // 1 solo Arte
        Arte arte = new Arte();
        mostrarCursos("Los cursos de arte son los siguientes:", arte);
        Iterator it = arte.crearIterator();
        it.first();
        System.out.println("Actualmente estoy apuntando a: " + it.currentItem());

        // 2 Arte y Ciencias
        System.out.println();
        mostrarCursos("Los cursos de arte son los siguientes:", new Arte());
        mostrarCursos("Los cursos de ciencias son los siguientes:", new Ciencias());

        // 3 con nodos enlazados
        System.out.println();
        mostrarCursos("[Linked] Cursos de arte:", new ArteLinked());
        mostrarCursos("[Linked] Cursos de ciencias:", new CienciasLinked());
    }
}
