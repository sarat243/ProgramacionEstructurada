import javax.swing.*;

public class ProgramasCiclos1 {
    public static void main(String[] args) {
        //Declaracion de variables
        String menu="";
        String opcion="";
        boolean sentinel=true;

        //Creacion del menu

        menu="Menu Principal \n" +
                "1)Promedio calificaciones (for)\n" +
                "2)Vendedores (while)\n" +
                "3)Tenda (do-while)\n"+
                "4)Salir\n"+
                "Elegir opción: ";
         do{
        opcion= JOptionPane.showInputDialog(menu);

        switch(opcion){
            case "1":
                int numCalif =0;
                double calif=0.0;
                double promedio =0.0;
                //Solicitar el numero de calificaciones
                numCalif=Integer.parseInt
                        (JOptionPane.showInputDialog("Introduce el numero de calificaciones"));
                for (int i = 1; i <=numCalif; i++) {
                    //Solicitar calificaciones
                    calif=Double.parseDouble(JOptionPane.showInputDialog
                            ("Introduce la calificacion " + i ));
                    //Acumular calificaciones
                    promedio +=calif;

                }
                promedio/=numCalif;
                JOptionPane.showMessageDialog
                        (null,"El proemdio del alumno es: "+ promedio);;
                break;
            case "2":
                String nombre="";
                int numeVendedores=0;
                double sueldoBase=0.0;
                double comision=0.0;
                double sueldoTotal=0.0;
                String salida="";

                numeVendedores=Integer.parseInt
                        (JOptionPane.showInputDialog("Introduce el numero de vendedores"));
                sueldoBase=Double.parseDouble
                        (JOptionPane.showInputDialog("Introduce elsueldo base"));

                salida="Nombre \t \t \t Comisión \t \t \t \t Sueldo total\n";

                int i=1;
                while (i<=numeVendedores){
                   nombre= JOptionPane.showInputDialog("Introduce el nombre del vendedor " + i);
                   salida+= nombre + "           " + comision + "            " + sueldoTotal + "\n";
                   i++;
                }

                JOptionPane.showMessageDialog(null,salida);
                break;
            case "3":
                JOptionPane.showMessageDialog(null, "Opcion 3");
                break;
            case "4":
                JOptionPane.showMessageDialog(null, "Adios, el programa ha terminado");
                sentinel=false;
                break;
            default:
        JOptionPane.showMessageDialog(null,"Opcion no valida ");

        }
    }while (sentinel);
}
}
