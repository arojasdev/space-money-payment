package com.spacemoney.payment.orders.pais;

import com.spacemoney.payment.orders.Pedido;

/**
 *
 * @author anto
 */
public class PedidoColombia extends Pedido {

    @Override
    protected void calculaIVA() {
        importeIVA = importeSinIVA * 0.19;
    }
}
