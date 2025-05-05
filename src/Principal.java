import javax.swing.plaf.synth.SynthOptionPaneUI;

// interfas para interactuar con el usuario
public class Principal {
    public static void main(String[] args) {
        ConsultarMoneda consulta = new ConsultarMoneda();

        Moneda moneda = consulta.tipoDeMoneda("USD","MXN",10);
        System.out.println(moneda);
    }
}
