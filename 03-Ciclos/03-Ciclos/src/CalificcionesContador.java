import javax.swing.*;

public class CalificcionesContador {
    public static void main(String[] args) {
        // Declaración de variables
        int numeroAprobados = 0;
        int numeroReprobados = 0;
        int numeroDeCalif = 0;
        double Calif = 0.0;

        numeroDeCalif = Integer.
                parseInt(JOptionPane.showInputDialog("Cuantas calificaciones se van a evaluar"));

        //El int i = 1; puede estar dentro y fuera del for
        //Solo lo lee una vez

        for (int i = 1; i <= numeroDeCalif; i++) {
            Calif = Double.
                    parseDouble(JOptionPane.showInputDialog("Introduce la calificacion " + i));

            if (Calif >= 7.0) {
                //Contador de numeros Aprobados
                numeroAprobados++;
            } else {
                numeroReprobados++;
            }

        }
        JOptionPane.showMessageDialog(null, "El numero de aprobados es: "
                + numeroAprobados + "\n El numero de reprobados es: " + numeroReprobados);

        int i = 1;
        numeroAprobados = 0;
        numeroReprobados = 0;

        while (i <= numeroDeCalif) {
            Calif = Double.
                    parseDouble(JOptionPane.showInputDialog("Introduce la calificacion " + i));
            if (Calif >= 7.0) {
                numeroAprobados++;
            } else {
                numeroReprobados++;


            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "El numero de aprobados es: "
                + numeroAprobados + "\n El numero de reprbados es: " + numeroReprobados);


        numeroAprobados = 0;
        numeroReprobados = 0;
        i=1;

        do {
            Calif = Double.
                    parseDouble(JOptionPane.showInputDialog("Introduce la calificacion " + i));

            if (Calif >= 7.0) {
                numeroAprobados++;
            } else {
                numeroReprobados++;

            }
            i++;
        } while (i <= numeroDeCalif) ;
        JOptionPane.showMessageDialog(null, "El numero de aprobados es: "
                + numeroAprobados + "\n El numero de reprbados es: " + numeroReprobados);
    }
}



