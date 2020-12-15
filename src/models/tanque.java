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
public class tanque {
    int id;
    String combustivel;
    float qtdLitro;

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

    public float getQtdLitro() {
        return qtdLitro;
    }

    public void setQtdLitro(float qtdLitro) {
        this.qtdLitro = qtdLitro;
    }
}
