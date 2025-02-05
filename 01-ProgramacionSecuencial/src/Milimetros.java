import javax.swing.*;

/*
* convierte los 10, 50 y 100 kilogramos a libras
* */
public class Milimetros {
    public static void main(String[] args) {
        //Declaración de constantes
        final double FACTOR_CONVERSION = 25.4;
        //Declaración de variables
        double num1=0.0;
        double num2=0.0;
        double num3=0.0;

        //Solicitar tres números
        double c1=0.0;
        double c2=0.0;
        double c3=0.0;

        //Proceso de conversion
        c1=num1 * FACTOR_CONVERSION;
        c2=num2 * FACTOR_CONVERSION;
        c3=num3 * FACTOR_CONVERSION;

        num1=Double.parseDouble(JOptionPane.showInputDialog("Introduce la pulgada "));
        num2=Double.parseDouble(JOptionPane.showInputDialog("Introduce la pulgada 2 "));
        num3=Double.parseDouble(JOptionPane.showInputDialog("Introduce la pulgada 3 "));

        JOptionPane.showMessageDialog(null,num1 + " in " + " en milimetros es: " + String.format("%.3f",c1)
         + "\n" + num2 + " in" + " en milimetros es: " + String.format("%.3f",c2) + "\n"
        + num3 + " in" + " en milimetros es: " + String.format("%.3f", c3));

    }
}
