import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoneda {


    public Moneda tipoDeMoneda(String monedaBase, String monedaObjetivo, double cantidad){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/76c58539963e7209d545ebde/pair/" + monedaBase + "/" + monedaObjetivo + "/" + cantidad );


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(),Moneda.class);

        }catch (IOException e){
            throw new RuntimeException("Hubo un error de red o se alcanso el maximo de solicitudes" + e.getMessage());

        } catch (InterruptedException e) {
            throw new RuntimeException("La operacion fue interrumpida" + e.getMessage());
        }


    }
}
