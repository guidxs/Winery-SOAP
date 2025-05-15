package br.com.fiap.winery;

import jakarta.xml.ws.Endpoint;

public class Loader {
    public static void main(String[] args) {
        WineStockServiceImplementation wineStock = new WineStockServiceImplementation();
        WineWarningServiceImplementation wineWarning = new WineWarningServiceImplementation();

        jakarta.xml.ws.Endpoint.publish("http://localhost:8086/WineWarningService", wineWarning);
        Endpoint.publish("http://localhost:8085/WineStockService", wineStock);

        System.out.println("Serviço publicado!");
    }
}
