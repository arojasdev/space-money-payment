package com.spacemoney.payment.orders;

import com.spacemoney.payment.model.Pais;
import com.spacemoney.payment.model.Ticket;

/**
 *
 * @author anto
 */
public abstract class Pedido {
    
    protected double importeSinIVA;
    
    protected double importeIVA;
    
    protected double importeConIVA;
    
    protected abstract void calculaIVA();
    
    public void calculaPrecioConIVA() {
        this.calculaIVA();
        importeConIVA = importeSinIVA + importeIVA;
    }
    
    public Ticket obtenerPagoRealizado(String nombre, Pais pais) {
        Ticket ticket = new Ticket();
        ticket.setImporteSinIVA(importeSinIVA);
        ticket.setImporteIVA(importeIVA);
        ticket.setImporteConIVA(importeConIVA);
        ticket.setNombreCleinte(nombre);
        ticket.setPais(pais);
        return ticket;
    }

    public double getImporteSinIVA() {
        return importeSinIVA;
    }

    public void setImporteSinIVA(double importeSinIVA) {
        this.importeSinIVA = importeSinIVA;
    }
    
}
