
import javax.swing.JOptionPane;

public class ConversorTemperatura {

    public static void convertirTemperatura() {
        String[] opciones = {"Celsius a Fahrenheit", "Celsius a Kelvin", "Fahrenheit a Celsius", "Fahrenheit a Kelvin", "Kelvin a Celsius", "Kelvin a Fahrenheit"};
        String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Conversor de Temperatura",
                JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);

        try {
            String temperaturaStr = JOptionPane.showInputDialog(null, "Ingrese la temperatura a convertir:",
                    "Conversor de Temperatura", JOptionPane.QUESTION_MESSAGE);
            double temperatura = Double.parseDouble(temperaturaStr);
            double resultado = convertirTemperatura(temperatura, opcion);
            JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor no válido", "Error", JOptionPane.ERROR_MESSAGE);
        }

        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Confirmación",
                JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            convertirTemperatura();
        }
    }

    public static double convertirTemperatura(double temperatura, String opcion) {
        double resultado = 0.0;
        switch (opcion) {
            case "Celsius a Fahrenheit":
                resultado = temperatura * 9/5 + 32;
                break;
            case "Celsius a Kelvin":
                resultado = temperatura + 273.15;
                break;
            case "Fahrenheit a Celsius":
                resultado = (temperatura - 32) * 5/9;
                break;
            case "Fahrenheit a Kelvin":
                resultado = (temperatura + 459.67) * 5/9;
                break;
            case "Kelvin a Celsius":
                resultado = temperatura - 273.15;
                break;
            case "Kelvin a Fahrenheit":
                resultado = temperatura * 9/5 - 459.67;
                break;
        }
        return resultado;
    }
}
