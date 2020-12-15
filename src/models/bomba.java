/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Secco
 */
public class bomba { 
    int id;
    String combustivel;
    float valorLitro;
    int idTanque;
    String sValorLitro= Float.toString(valorLitro);

    public String getsValorLitro() {
        return sValorLitro;
    }

    public void setsValorLitro(String sValorLitro) {
        this.sValorLitro = sValorLitro;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public float getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(float valorLitro) {
        this.valorLitro = valorLitro;
    }

    public int getIdTanque() {
        return idTanque;
    }

    public void setIdTanque(int idTanque) {
        this.idTanque = idTanque;
    }
}
