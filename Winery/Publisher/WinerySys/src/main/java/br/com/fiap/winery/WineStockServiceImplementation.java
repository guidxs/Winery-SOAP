package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService {

    @Override
    public String getMenu() {
        return "Tipos de uvas disponíveis:\n"
                + "- Cabernet Sauvignon\n"
                + "- Merlot\n"
                + "- Chardonnay\n"
                + "- Pinot Noir\n"
                + "- Sauvignon Blanc";
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido confirmado!";
    }
}