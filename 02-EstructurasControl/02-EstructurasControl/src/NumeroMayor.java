import javax.swing.*;

/*
* Evaluar si un nuemro es mayor a 10 utilizando un operador
* ternario (?)
*
* (Exprsion)? parte true : parte false
* */
public class NumeroMayor {
    public static void main(String[] args) {
        //Declaración de variables
        double numero=0.0;
        String salida="";

        //Entrada
        numero=Double.parseDouble(JOptionPane.showInputDialog("Introsuce el número"));

        salida=(numero>10)?"El número es mayor a 10":"El número es menor a 10";

        JOptionPane.showMessageDialog(null,salida);

        if (numero>10){
            salida="El numero es mayor a 10";

        }else{
            salida="El número es menar a 10";
        }


    }
}
