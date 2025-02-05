import javax.swing.*;

/*
* Calcula y muestra el cuadrado de cada entero
* */
public class CuadradoNumero {
    public static void main(String[] args) {
        //Declaración de variables
        double num=0.0;
        double respuesta=0.0;

        //Solicitar datos

        num=Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero "));

        //Calcular potencia
        respuesta=Math.pow(num,2);

        JOptionPane.showMessageDialog(null, "El cuadrado de " + num + " es igual a : "
                                       + respuesta );


    }
}
