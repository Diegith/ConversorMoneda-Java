import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaAPI {
    private final HttpClient client = HttpClient.newHttpClient();
    public String obtenerDatos(String conversor) throws IOException, InterruptedException {
        String url = "https://v6.exchangerate-api.com/v6/b65e5067c7dba0040313e381/pair/" + conversor + "/";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("User-Agent", "Java HttpClient")
                .build();

        HttpResponse<String> response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString()
        );

        if (response.statusCode() != 200) {
            throw new RuntimeException("Error API: " + response.statusCode());
        }
        return response.body();
    }
}
