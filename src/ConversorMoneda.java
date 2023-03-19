
import javax.swing.JOptionPane;

public class ConversorMoneda {

    public static void convertirMoneda() {
        String[] opciones = {"Peso argentino a Dólar", "Peso argentino a Euro", "Peso argentino a Libra", "Peso argentino a Yen Japones", "Peso argentino a  Won Coreano", "Dólar a Peso argentino", "Euro a Peso argentino", "Libra a Peso argentino", "Yen Japones a Peso argentino", "Won Coreano a Peso argentino"};
        String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Conversor de Moneda",
                JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);

        try {
            String cantidadStr = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero a convertir:",
                    "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE);
            double cantidad = Double.parseDouble(cantidadStr);
            double resultado = convertirMoneda(cantidad, opcion);
            JOptionPane.showMessageDialog(null, "La convercion de " + opcion + " es: "  + String.format("%.4f", resultado));


        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor no válido", "Error", JOptionPane.ERROR_MESSAGE);
        }

        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Confirmación",
                JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            convertirMoneda();
        }
    }

    public static double convertirMoneda(double cantidad, String opcion) {
        double resultado = 0.0;
        switch (opcion) {
            case "Peso argentino a Dólar":
                resultado = cantidad / 201.89;
                break;
            case "Peso argentino a Euro":
                resultado = cantidad / 215.65;
                break;
            case "Peso argentino a Libra":
                resultado = cantidad / 246.47;
                break;
            case "Peso argentino a Yen Japones":
                resultado = cantidad / 1.53;
                break;
            case "Peso argentino a  Won Coreano":
                resultado = cantidad / 6.49;
                break;
            case "Dólar a Peso argentino":
                resultado = cantidad * 201.89;
                break;
            case "Euro a Peso argentino":
                resultado = cantidad * 215.65;
                break;
            case "Libra a Peso argentino":
                resultado = cantidad * 246.47;
                break;
            case "Yen Japones a Peso argentino":
                resultado = cantidad * 1.53;
                break;
            case "Won Coreano a Peso argentino":
                resultado = cantidad * 0.15;
                break;
        }
        return resultado;
    }
}
