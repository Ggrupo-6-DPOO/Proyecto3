package utilidades;

import javax.swing.*;
import java.util.HashSet;

public class TicketRegistry {

    private static final HashSet<String> idsImpresos = new HashSet<>();

    public static boolean confirmarImpresion(String id) {
        if (idsImpresos.contains(id)) {
            int opcion = JOptionPane.showConfirmDialog(null,
                    "Este tiquete ya fue impreso. ¿Desea reimprimirlo?",
                    "Confirmar reimpresión",
                    JOptionPane.YES_NO_OPTION);
            return opcion == JOptionPane.YES_OPTION;
        } else {
            idsImpresos.add(id);
            return true;
        }
    }
}