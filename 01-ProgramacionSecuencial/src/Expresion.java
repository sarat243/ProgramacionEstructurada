import javax.swing.*;

/*
* Calcular el resultado de la expresión n=x+y/y-1, para los valores de x y y cuales quiera
*
* */
public class Expresion {
    public static void main(String[] args) {
        //Declaracion de variables
        double x=0.0;
        double y=0.0;
        double n=0.0;

        //Solicitar los datos
        x=Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de x"));
        y=Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de y"));

        //Calcular la expresión
        n=(x+y)/(y-1);

        //Salida del programa

        String salida="El resultado de la expresion  es: " + String.format("%.3f",n);

        JOptionPane.showMessageDialog(null, "El resultado de la expresión es: "+ n);
    }
}
