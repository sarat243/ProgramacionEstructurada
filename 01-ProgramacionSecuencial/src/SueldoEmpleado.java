/*
calcule e imprima el sueldo de un empleado, bajo las
siguientes características
a. Se debe almacenar el nombre del empleado
b. Las horas trabajadas que deben ser horas sin parte fraccionaria
c. Cuota por hora
d. Se debe imprimir el nombre del Trabajador y el Sueldo que va a percibir*/
import javax.swing.*;

public class SueldoEmpleado {
    public static void main(String[] args) {
    //Declaración de variables
        String n="";
        int horast=0;
        double cuotahora=0.0;
        double sueldo=0.0;

        //Solicitar datos
        n=JOptionPane.showInputDialog("Introduce el nombre del trabajador ");
        cuotahora=Double.parseDouble(JOptionPane.showInputDialog("Introduce la cuota por hora"));
        horast=Integer.parseInt(JOptionPane.showInputDialog("Introduce las horas "));



        //Calcular la expresión
        sueldo=(horast * cuotahora);

        //Salida del programa

        JOptionPane.showMessageDialog(null, "El empleado "+ n +
                " \n con " + horast + "horas trabajadas con una couta de: " + cuotahora +
                "\n tiene un sueldo de: " + String.format("%.2f",sueldo) );

    }
}
