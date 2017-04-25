/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaSimplismenteEncadeada;

/**
 *
 * @author Hilton
 */
public class Elemento {

    private int numero;
    private Elemento proximo;

    public Elemento(int num) {
        this.numero = num;
        this.proximo = null;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Elemento getProximo() {
        return proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }

}
