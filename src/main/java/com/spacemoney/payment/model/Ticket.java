package com.spacemoney.payment.model;

/**
 *
 * @author anto
 */
public class Ticket {
   private int numeroTicket;
   private String nombreCleinte;
   private Pais pais;
   private double importeSinIVA;
   private double importeIVA;
   private double importeConIVA;

    public int getNumeroTicket() {
        return numeroTicket;
    }

    public void setNumeroTicket(int numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    public String getNombreCleinte() {
        return nombreCleinte;
    }

    public void setNombreCleinte(String nombreCleinte) {
        this.nombreCleinte = nombreCleinte;
    }

    public double getImporteSinIVA() {
        return importeSinIVA;
    }

    public void setImporteSinIVA(double importeSinIVA) {
        this.importeSinIVA = importeSinIVA;
    }

    public double getImporteIVA() {
        return importeIVA;
    }

    public void setImporteIVA(double importeIVA) {
        this.importeIVA = importeIVA;
    }

    public double getImporteConIVA() {
        return importeConIVA;
    }

    public void setImporteConIVA(double importeConIVA) {
        this.importeConIVA = importeConIVA;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
   
}
