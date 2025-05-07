import javax.swing.plaf.synth.SynthOptionPaneUI;

// interfas para interactuar con el usuario
public class Principal {
    public static void main(String[] args) {
        MostrarResultado resultado = new MostrarResultado();

        resultado.resultado("USD","MXN",1);
    }
}
