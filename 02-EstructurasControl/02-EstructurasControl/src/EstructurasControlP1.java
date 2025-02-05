import javax.swing.*;

public class EstructurasControlP1 {
    public static void main(String[] args) {


        //Declaracion de variables
        String opcion="";
        String menu="a) Juego\n" +
                "b) Fruteria\n" +
                "c) Laboratorio\n " +
                "d) Salir\n" +
                "Elegir una opción: ";

        opcion= JOptionPane.showInputDialog(menu);
        opcion = opcion.toUpperCase();

        switch (opcion) {
            case "A":
               //Llamar al metodo
               jugar();
                break;
            case "B":
                double cantKilos=0.0;
               double precio =0.0;
               String resultado="";
               precio=Double.parseDouble(JOptionPane.showInputDialog
                       ("Introduce el precio de las manzanas"));
               cantKilos=Double.parseDouble(JOptionPane.showInputDialog
                       ("Introduce el total de kilos de manzanas "));

              if( cantKilos>=0.0 && cantKilos<0.0){
                  if(cantKilos>=0.0 && cantKilos<=2.90){
                      resultado="El total a pagar sin descuento  es: " + (cantKilos * precio);
                  }else if(cantKilos>= 2.01 && cantKilos<= 5.0){
                      double descuento =(cantKilos * precio) * 0.10;
                      resultado ="El total a pagar con un descuento (10%) "
                              + descuento + " es: " + ((cantKilos*precio) - descuento);

                  } else if (cantKilos>=5.01 && cantKilos<=10) {
                      double descuento =(cantKilos * precio) * 0.15;
                      resultado ="El total a pagar con un descuento (15%) "
                              + descuento + " es: " + ((cantKilos*precio) - descuento);
                  }else {
                      double descuento =(cantKilos * precio) * 0.20;
                      resultado ="El total a pagar con un descuento (20%) "
                              + descuento + " es: " + ((cantKilos*precio) - descuento);
                  }
                  JOptionPane.showMessageDialog(null, resultado);
                  }else {
                  if (cantKilos<0.0){
                      JOptionPane.showMessageDialog(null, "La cantidad de kilos no pude ser 0 o negativo");
                  }

                      if (precio<0.0){
                          JOptionPane.showMessageDialog(null, "El precio no puede ser negativo");
                  }

              }

                break;
            case "C":
                break;
            case "D":
                JOptionPane.showMessageDialog(null, "El programa ha terminado");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida");
        }



        }
        public static void jugar(){
            String pregunta = "¿Colón descubrio américa?";
            String resp = JOptionPane.showInputDialog(pregunta + " SI/NO");
            if (resp.equalsIgnoreCase("SI")) {
                resp = JOptionPane.showInputDialog("La independencia de México fue en 1810?");
                if (resp.equalsIgnoreCase("SI")) {
                    resp = JOptionPane.showInputDialog("The doors fue un grupo de rock Americano?");
                    if (resp.equalsIgnoreCase("SI")) {
                        JOptionPane.showMessageDialog(null, "Has ganado ");
                    } else {
                        JOptionPane.showInputDialog(null, "Respuesta incoreecta, has perdido .....");
                    }
                } else {
                    JOptionPane.showInputDialog(null, "Respuesta incoreecta, has perdido .....");
                }
            } else {
                JOptionPane.showInputDialog(null, "Respuesta incoreecta, has perdido .....");
            }
        }
    }

