
import javax.swing.JOptionPane;

public class ConversorTiempo {

    public static void convertirTiempo() {
        String[] opciones = {"Segundos a Minutos", "Minutos a Horas", "Horas a Días", "Minutos a Segundos", "Horas a Minutos", "Días a Horas", "Segundos a Horas", "Horas a Segundos"};
        String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Conversor de Tiempo",
                JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);

        try {
            String cantidadStr = JOptionPane.showInputDialog(null, "Ingrese la cantidad de tiempo a convertir:",
                    "Conversor de Tiempo", JOptionPane.QUESTION_MESSAGE);
            double cantidad = Double.parseDouble(cantidadStr);
            String unidadOrigen = "";
            String unidadDestino = "";
            double resultado = 0.0;
            switch (opcion) {
                case "Segundos a Minutos":
                    resultado = cantidad / 60.0;
                    unidadOrigen = "Segundos";
                    unidadDestino = "Minutos";
                    break;
                case "Minutos a Horas":
                    resultado = cantidad / 60.0;
                    unidadOrigen = "Minutos";
                    unidadDestino = "Horas";
                    break;
                case "Horas a Días":
                    resultado = cantidad / 24.0;
                    unidadOrigen = "Horas";
                    unidadDestino = "Días";
                    break;
                case "Minutos a Segundos":
                    resultado = cantidad * 60.0;
                    unidadOrigen = "Minutos";
                    unidadDestino = "Segundos";
                    break;
                case "Horas a Minutos":
                    resultado = cantidad * 60.0;
                    unidadOrigen = "Horas";
                    unidadDestino = "Minutos";
                    break;
                case "Días a Horas":
                    resultado = cantidad * 24.0;
                    unidadOrigen = "Días";
                    unidadDestino = "Horas";
                    break;
                case "Segundos a Horas":
                    resultado = cantidad / 3600.0;
                    unidadOrigen = "Segundos";
                    unidadDestino = "Horas";
                    break;
                case "Horas a Segundos":
                    resultado = cantidad * 3600.0;
                    unidadOrigen = "Horas";
                    unidadDestino = "Segundos";
                    break;
            }
            JOptionPane.showMessageDialog(null, "La conversión de " + cantidad + " " + unidadOrigen + " a " + unidadDestino + " es: " + resultado + " /" + unidadDestino);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor no válido", "Error", JOptionPane.ERROR_MESSAGE);
        }

        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Confirmación",
                JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            convertirTiempo();
        }
    }
}
