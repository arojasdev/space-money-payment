package com.spacemoney.payment.model;

/**
 *
 * @author anto
 */
public class PagoRequest {
    private String nombreCliente;
    private Pais pais;
    private double importe;

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
