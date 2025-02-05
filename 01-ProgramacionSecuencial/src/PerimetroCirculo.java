import javax.swing.*;

/*
* para calcular y de salida el perímetro y el área de un círculo
*
* */
public class PerimetroCirculo {
    public static void main(String[] args) {
        //Declaracion de constantes
        final double PI=3.1416;
        //Declaracion de variables
        double radio= 3.2;
        double perimetro=0.0;
        double area =0.0;
        String salida ="";

        //Calcular el perimetro
        perimetro=(PI*(radio + radio));
        //Calcular area
        area=(PI * Math.pow(radio,2));

        salida="El perimetro del circulo con un radio de " + radio + " es igual a: " +
                "\n" +String.format("%.3f",perimetro) + "\n" + "El area del circulo con un radio de " + radio +
                " es igual a: " + "\n" + String.format("%.3f", area);

        JOptionPane.showMessageDialog(null, salida);

    }
}
