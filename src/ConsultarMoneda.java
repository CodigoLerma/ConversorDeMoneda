import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class ConsultarMoneda {


    public Moneda tipoDeMoneda(String monedaBase, String monedaObjetivo, double cantidad){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/76c58539963e7209d545ebde/pair/" + monedaBase + "/" + monedaObjetivo + "/" + cantidad );


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

    }
}
