package org.iesvdm.transformer;
import java.util.ArrayList;
import java.util.Iterator;
//ej7//
public class ComprobadorUtil {

        // Método para eliminar elementos que no pasan la verificación
        public static <T> void removeFailingChecks(Comprobador<T> checker, ArrayList<T> list) {
            Iterator<T> iterator = list.iterator();
            while (iterator.hasNext()) {
                T item = iterator.next();
                if (!checker.check((Book) item)) {
                    iterator.remove(); // Elimina el elemento si falla la verificación
                }
            }
        }

        // Método para eliminar elementos que no coinciden con el comprobador
        public static <T> void removeUnmatched(ArrayList<T> list, Comprobador<T> checker) {
            removeFailingChecks(checker, list); // Reutiliza el método anterior
        }
}
