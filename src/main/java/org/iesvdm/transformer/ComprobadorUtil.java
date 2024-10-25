package org.iesvdm.transformer;
import java.util.ArrayList;
import java.util.Iterator;
//ej7//
public class ComprobadorUtil {

        // If the isn't in the comprobador it will delete
        public static <T> void removeFailingChecks(Comprobador<T> checker, ArrayList<T> list) {
            Iterator<T> iterator = list.iterator();
            while (iterator.hasNext()) {
                T item = iterator.next();
                if (!checker.check((Book) item)) {
                    iterator.remove(); // Elimina el elemento si falla la verificación
                }
            }
        }

        // Will delete elemetns that are not the same than in the class "Conprolador"
        public static <T> void removeUnmatched(ArrayList<T> list, Comprobador<T> checker) {
            removeFailingChecks(checker, list); // Reutiliza el método anterior
        }
}
