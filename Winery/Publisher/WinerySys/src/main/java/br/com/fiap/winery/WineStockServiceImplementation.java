package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService {

    @Override
    public String getMenu() {
        return "Tipos de vinhos disponíveis:\n"
                + "- Vinho Tinto\n"
                + "- Vinho Branco\n"
                + "- Vinho Seco\n"
                + "- Vinho Doce\n"
                + "- Vinho Suave";
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido confirmado!";
    }
}