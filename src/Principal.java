import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

// interfas para interactuar con el usuario
public class Principal {
    public static void main(String[] args) {
        double cantidad;
        int opcion = 0;
        Scanner lectura = new Scanner(System.in);

        MostrarResultado resultado = new MostrarResultado();

        while (opcion != 7) {

            System.out.println("""
                    ***************************
                     1: Dollar a pesos Mexicano
                     2: Pesos Mexicano a Dollar
                     3: Dollar a peso Argentino
                     4: Peso Argentido a Dollar
                     5: Dollar sol Peruano
                     6: Sol Peruano a Dollar
                     7: Cerrar la aplicacion
                     **************************""");
            opcion = lectura.nextInt();

            

        }









    }
}
