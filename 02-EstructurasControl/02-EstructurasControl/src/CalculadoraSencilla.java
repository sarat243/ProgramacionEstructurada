import javax.swing.*;

public class CalculadoraSencilla {

    public static void main(String[] args) {
        //Declaracion de variables
        String menu="";
        String opcion="";
        double resultado=0.0,numero1=0.0, numero2=0.0;

        menu="MENU PRINCIPAL\n"+
                "1) Sumar\n2) Restar\n"+
                "3) Dividir\n"+
                "4) Multiplicar\n"+
                "5) Modulo\n"+
                "Elegir una opcion: ";

        opcion=JOptionPane.showInputDialog(menu);

        numero1=Double.parseDouble(JOptionPane.showInputDialog("Introduce el  numero 1"));
        numero2=Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero 2"));

        if(numero2>0){

        switch(opcion){
            case "1":
                //Suma
                resultado= numero1 + numero2;
                JOptionPane.showMessageDialog(null,"La suma es : " + resultado);
            break;
            case "2":
                //Resta
                resultado= numero1 - numero2;
                JOptionPane.showMessageDialog(null,"La resta es :" + resultado);
                break;
            case "3":
                //Dvision
                resultado= numero1 / numero2;
                JOptionPane.showMessageDialog(null,"La división es : " + resultado);
                break;
            case "4":
                //Multiplicacion
                resultado= numero1 * numero2;
                JOptionPane.showMessageDialog(null,"La multiplicacion es :" + resultado);
                break;
            case "5":
                //Modulo
                resultado= numero1 % numero2;
                JOptionPane.showMessageDialog(null,"El modulo es : " + resultado);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Caso no valido");
        }

//


    }else{
            JOptionPane.showMessageDialog(null,"El numero 2 no puede ser 0 o negativo");
        }
//            JOptionPane.showMessageDialog(null,opcion);
        }
}
