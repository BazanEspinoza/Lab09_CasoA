//BazanEspinoza
package lab09_casoa;

/**
 *
 * @author s
 */
public class Arte implements CursosInterface {
    private String[] materias;

    public Arte() {
        materias = new String[]{"Ingles", "Historia", "Geografia", "Psicologia"};
    }

    @Override
    public Iterator crearIterator() {
        return new CursoIterator(materias);
    }
}
