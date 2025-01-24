import javax.swing.*;

/*
*Escribir un programa que convierta tres numero de kilogramos a libras
* kilogramos a libras (1 libra=0.454)
*
*
 */
public class ConversionLibras {
    public static void main(String[] args) {
        //Declaración en constante
        final double FACTOR_CONVERSION=0.454;

        //Declaración de variables de 3 numeros dobles a convertir
        double numero1=0.0;
        double numero2=0.0;
        double numero3=0.0;

        //Solicitar los 3 números doubles a convertir

        double c1=0.0;
        double c2=0.0;
        double c3=0.0;
        String salida="";

        //Proces de conversion
        c1=numero1 / FACTOR_CONVERSION;
        c2=numero2 / FACTOR_CONVERSION;
        c3=numero3 / FACTOR_CONVERSION;

        numero1= Double.parseDouble(JOptionPane.showInputDialog("Introduce la libra : "));
        numero2=Double.parseDouble(JOptionPane.showInputDialog("Introduce la libra 2 : "));
        numero3=Double.parseDouble(JOptionPane.showInputDialog("Introduce la libra 3 : "));



        salida=numero1 + "kg" + " en libras es: " +String.format("%.3f",c1) +
                "\n " + numero2 + "kg" + " en libras es: "+ String.format("%.3f",c2)  +
                "\n " + numero3 + "kg" + " en libras es: " + String.format("%.3f",c3) ;
        JOptionPane.showMessageDialog(null, salida );



    }
}
