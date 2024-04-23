package br.com.alura.ConversorDeMoedas;
import br.com.alura.ConversorDeMoedas.TiposDeMoedas;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;


public class ChamandoApi {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Cria uma instância de HttpClient
        HttpClient client = HttpClient.newHttpClient();

        // Define a URL da API
        String apiUrl = "https:v6.exchangerate-api.com/v6/e33679fd8390f6f9a5781ef7/latest/USD";

        // Cria um HttpRequest para a URL da API
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .GET()  // Método HTTP GET
                .build();

        // Envia a requisição e trata a resposta.
        HttpResponse<String> respostaDaApi = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Cria uma instância de Gson para manipular JSON.
        Gson GsonDaApi = new Gson();

        // Converte a resposta JSON em um objeto Java.
        TiposDeMoedas Cotacao = GsonDaApi.fromJson(respostaDaApi.body(), TiposDeMoedas.class);

        // Obtendo a cotação de dolar e peso argentino.
        double dolarParaPesoArgentino = Cotacao.getCotacao().get("ARS");

        //Obtendo a cotação de dolar e peso colombiano.
        double dolarParaPesoColombiano = Cotacao.getCotacao().get("COP");

        // Obtendo a cotacao de dolar em  real brasileiro.
        double dolarPararealBrasileiro = Cotacao.getCotacao().get("BRL");


    }
}
