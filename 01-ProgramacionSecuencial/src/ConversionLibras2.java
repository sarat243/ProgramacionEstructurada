import javax.swing.*;

public class ConversionLibras2 {
    public static void main(String[] args) {
        //Declaración en constante
        final double FACTOR_CONVERSION=0.454;

        //Declaración de variables de 3 numeros dobles a convertir
        double numero1=0.0;
        double numero2=0.0;
        double numero3=0.0;

        String salida="";


        numero1= Double.parseDouble(JOptionPane.showInputDialog("Introduce la libra : "));
        numero2=Double.parseDouble(JOptionPane.showInputDialog("Introduce la libra 2 : "));
        numero3=Double.parseDouble(JOptionPane.showInputDialog("Introduce la libra 3 : "));



        salida=numero1 + "kg" + " en libras es: " +String.format("%.3f",numero1 / FACTOR_CONVERSION) +
                "\n " + numero2 + "kg" + " en libras es: "+ String.format("%.3f",numero2 / FACTOR_CONVERSION)  +
                "\n " + numero3 + "kg" + " en libras es: " + String.format("%.3f",numero3 / FACTOR_CONVERSION) ;
        JOptionPane.showMessageDialog(null, salida );



    }
}
