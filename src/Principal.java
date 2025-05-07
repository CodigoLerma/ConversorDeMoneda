import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

// interfas para interactuar con el usuario
public class Principal {
    public static void main(String[] args) {
        double cantidad = 0;
        int opcion = 0;
        int maximoDeOpciones = 7;
        Scanner lectura = new Scanner(System.in);

        MostrarResultado resultado = new MostrarResultado();

        // bucle para elegir las opciones. el bucle seguira siempre que la opicion no sea 7
        while (opcion != 7) {

            //menu de opciones
            System.out.println("""
                    ***************************
                     1: Dollar a pesos Mexicano
                     2: Pesos Mexicano a Dollar
                     3: Dollar a peso Argentino
                     4: Peso Argentido a Dollar
                     5: Dollar yen Japones
                     6: Yen Japones a Dollar
                     7: Cerrar la aplicacion
                     **************************""");


            System.out.println("Ingrese la opcion que desea ejecutar: ");
            opcion = lectura.nextInt();

            // el usuario podra ingresar la cantidad siempre que la opcion sea menor a la opcion maxima en este caso 7
            if (opcion < maximoDeOpciones){
                System.out.println("Ingrese la cantidad que desea convetir: ");
                cantidad = lectura.nextDouble();

            }




            // casos para la opcion elegida

            switch (opcion) {

                case 1:
                    resultado.resultado("USD","MXN",cantidad);
                    break;

                case 2:
                    resultado.resultado("MXN","USD",cantidad);
                    break;

                case 3:
                    resultado.resultado("USD","ARS",cantidad);
                    break;

                case 4:
                    resultado.resultado("ARS","USD",cantidad);
                    break;

                case 5:
                    resultado.resultado("USD","JPY",cantidad);
                    break;

                case 6:
                    resultado.resultado("JPY","USD",cantidad);
                    break;

                case 7:
                    System.out.println("Saliendo de la aplicacion");
                    break;
                    

                default:
                    System.out.println("Favor de elegir una opcion valida");
                    break;


            }




        }









    }
}
