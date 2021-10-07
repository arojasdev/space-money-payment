package com.spacemoney.payment.controller;

import com.spacemoney.payment.model.PagoRequest;
import static com.spacemoney.payment.model.Pais.*;
import com.spacemoney.payment.model.Ticket;
import com.spacemoney.payment.orders.Pedido;
import com.spacemoney.payment.orders.pais.*;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anto
 */
@Controller("/payment")
public class PaymentController {
    private Pedido pedido;
    private static List<Ticket> listTickets = new ArrayList<Ticket>();
    @Post
    public Ticket pagarViajeEspacion(PagoRequest pago) {
        Ticket ticketCompra = null;
        switch(pago.getPais()) {
            case MEXICO:
                pedido = new PedidoMexico();
                pedido.setImporteSinIVA(pago.getImporte());
                pedido.calculaPrecioConIVA();
                ticketCompra = pedido.obtenerPagoRealizado(pago.getNombreCliente(), pago.getPais());
                break;
            case COLOMBIA:
                pedido = new PedidoColombia();
                pedido.setImporteSinIVA(pago.getImporte());
                pedido.calculaPrecioConIVA();
                ticketCompra = pedido.obtenerPagoRealizado(pago.getNombreCliente(), pago.getPais());
                break;
            case PERU:
                pedido = new PedidoPeru();
                pedido.setImporteSinIVA(pago.getImporte());
                pedido.calculaPrecioConIVA();
                ticketCompra = pedido.obtenerPagoRealizado(pago.getNombreCliente(), pago.getPais());
                break;
            default:
                ticketCompra = new Ticket();
        }
        listTickets.add(ticketCompra);
        return ticketCompra;
    }
    
    @Get("/tickets")
    public List<Ticket> obtenerTickets() {
        return listTickets;
    }
}
