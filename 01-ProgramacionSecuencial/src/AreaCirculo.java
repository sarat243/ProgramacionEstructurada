import javax.swing.*;

public class AreaCirculo {
    public static void main(String[] args) {
        //Declaración de variables
        double r=0, a=0;
        final double PI=3.1416;
        r= Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de r: ")); //Pide el radio

        a=PI*Math.pow(r,2);
        String salida="El resultado de la expresion 1 es:"+ a;
        JOptionPane.showMessageDialog(null,"El resultado del area del circulo con radio " +r+ "es: " + a);
    }
}
