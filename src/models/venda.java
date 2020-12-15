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
public class venda {
    int id;
    int idBomba;
    String cliente;
    int idCartao;
    float valor;
    float qtdLitro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdBomba() {
        return idBomba;
    }

    public void setIdBomba(int idBomba) {
        this.idBomba = idBomba;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getIdCartao() {
        return idCartao;
    }

    public void setIdCartao(int idCartao) {
        this.idCartao = idCartao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getQtdLitro() {
        return qtdLitro;
    }

    public void setQtdLitro(float qtdLitro) {
        this.qtdLitro = qtdLitro;
    }
}
