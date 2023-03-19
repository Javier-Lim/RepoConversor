

import javax.swing.JOptionPane;

public class ConversorMenu {

    public static void main(String[] args) {
        int opcion = mostrarMenu();
        switch (opcion) {
            case 1:
                ConversorMoneda.convertirMoneda();
                break;
            case 2:
                ConversorTemperatura.convertirTemperatura();
                break;
            case 3:
                ConversorTiempo.convertirTiempo();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida", "Error", JOptionPane.ERROR_MESSAGE);
                main(args);
        }
    }

    public static int mostrarMenu() {
        Object[] opciones = {"Conversor de Moneda", "Conversor de Temperatura", "Conversor de Tiempo"};
        int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Conversor", JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        return seleccion + 1;
    }
}


