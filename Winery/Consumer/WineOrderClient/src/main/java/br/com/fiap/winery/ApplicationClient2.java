package br.com.fiap.winery;

import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import br.com.fiap.winery.client.WineStockService;
import br.com.fiap.winery.client.WineWarningService;

public class ApplicationClient2 {
    public static void main(String[] args) throws Exception {

        URL url = new URL("http://localhost:8085/WineStockService?wsdl");
        URL url2 = new URL("http://localhost:8086/WineWarningService?wsdl");


        QName qName = new QName("http://winery.fiap.com.br/", "WineStockServiceImplementationService");
        QName qName2 = new QName("http://winery.fiap.com.br/", "WineWarningServiceImplementationService");


        Service service = Service.create(url, qName);
        Service service2 = Service.create(url2, qName2);

        WineStockService wineStockService = service.getPort(WineStockService.class);
        WineWarningService wineWarningService = service2.getPort(WineWarningService.class);


        String order = wineStockService.placeOrder("Cabernet Sauvignon", 3);
        System.out.println("Resposta do serviço: " + order);

        String warn = wineWarningService.sendWarn();
        System.out.println("Resposta do serviço de aviso: " + warn);
    }
}
