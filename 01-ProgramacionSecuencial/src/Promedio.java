import javax.swing.*;

/*
* Calcula el promedio de los números enteros
*
* */
public class Promedio {
    public static void main(String[] args) {
        //Declaración de variables
//        double num1=1;
//        double num2=7;
//        double num3=9;
//        double num4=34;
//        double resultado=0.0;
//        String salida="";
//
//        //Caulcular promedio
//        resultado=(num1 + num2 + num3 + num4 )/4;
//
//        salida= "El promedio de \"1, 7, 9, 34\" es igual a: " + resultado;
//        JOptionPane.showMessageDialog(null, salida);






        //Declaración de variables
        double num1=0;
        double num2=0;
        double num3=0;
        double num4=0;
        double resultado=0.0;

        //Solicitar datos
        num1= Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer numero  : "));
        num2=Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo numero : "));
        num3=Double.parseDouble(JOptionPane.showInputDialog("Introduce el tercero numero  : "));
        num4=Double.parseDouble(JOptionPane.showInputDialog("Introduce el cuarto numero  : "));

        //Caulcular promedio
      resultado=(num1 + num2 + num3 + num4 )/4;

        JOptionPane.showMessageDialog(null, " El promedio de los cuatro numeros es igual a : " + resultado);
    }
}
