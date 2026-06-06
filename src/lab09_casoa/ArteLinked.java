//BazanEspinoza
package lab09_casoa;

/**
 *
 * @author s
 */
public class ArteLinked implements CursosInterface {
    private String[] materias;

    public ArteLinked() {
        materias = new String[]{"Ingles", "Historia", "Geografia", "Psicologia"};
    }

    @Override
    public Iterator crearIterator() {
        return new CursoLinkedIterator(materias);
    }
}
