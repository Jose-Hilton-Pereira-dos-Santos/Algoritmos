/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDuplamenteLigada;

/**
 *
 * @author Hilton
 */
public class ListaDuplamenteLigada {

    private Elemento primeiro;
    private Elemento ultimo;
    private int Quantidade;

    public ListaDuplamenteLigada() {
        this.primeiro = null;
        this.ultimo = null;
        this.Quantidade = 0;
    }

    public Elemento getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro;
    }

    public Elemento getUltimo() {
        return ultimo;
    }

    public void setUltimo(Elemento ultimo) {
        this.ultimo = ultimo;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public void inserirNoComeco(int num) {
        Elemento novo = new Elemento(num);
        if (this.Quantidade == 0 && this.primeiro == null) {
            this.ultimo = novo;
            this.primeiro = novo;
        }
        this.primeiro.setAnterior(novo);
        novo.setProximo(this.primeiro);
        this.primeiro = novo;
        this.Quantidade++;
    }

    public void inserirNoFinal(int num) {
        Elemento novo = new Elemento(num);
        if (this.Quantidade == 0 && this.primeiro == null) {
            this.primeiro = novo;
        } else {
            novo.setAnterior(this.ultimo);
            this.ultimo.setProximo(novo);
        }
        this.ultimo = novo;
        this.Quantidade++;
    }
    
    public void inserirEmPosicao(int num, int posicao) {
        if (posicao == 0) {
            inserirNoComeco(num);
        } else if (posicao == this.Quantidade) {
            inserirNoFinal(num);
        } else {
            Elemento atual = this.pegaNumNaPosicao(posicao - 1);
            if (atual != null) {
                Elemento novo = new Elemento(num);
                novo.setAnterior(atual);
                Elemento aux = atual.getProximo();
                atual.setProximo(novo);
                novo.setProximo(aux);
                aux.setAnterior(novo);
                this.Quantidade++;
            }
        }

    }
    
    public boolean removerNumero(int num) {
        Elemento atual = this.primeiro;

        if (this.primeiro == null && this.Quantidade == 0) {
            System.out.println("A lista está vazia!");
            return false;
        } else if (this.Quantidade == 1) {
            this.primeiro = null;
            this.ultimo = null;
        } else {
            for (int i = 0; i < this.Quantidade; i++) {
                if (atual.getNumero() == num) {
                    i = this.Quantidade - 1;
                } else {
                    atual = atual.getProximo();
                }
            }
            if (atual == this.primeiro) {
                /*if (this.primeiro == this.ultimo) {
                    this.ultimo = null;
                    this.primeiro = null;
                }*/
                this.primeiro = this.primeiro.getProximo();
                this.primeiro.setAnterior(null);
            } else if (atual == this.ultimo) {
                this.ultimo = this.ultimo.getAnterior();
                this.ultimo.setProximo(null);
            } else {
                Elemento antA = atual.getAnterior();
                antA.setProximo(atual.getProximo());
                atual.getProximo().setAnterior(antA);
            }
        }

        this.Quantidade--;
        return true;
    }

    private Elemento pegaNumNaPosicao(int posicao) {
        if (posicao < 0 || posicao > this.Quantidade) {
            System.out.println("O elemento nao existe!");
        } else {
            Elemento atual = this.primeiro;
            for (int i = 0; i < posicao; i++) {
                atual = atual.getProximo();
            }
            return atual;
        }
        return null;
    }




    public void imprimirLista() {
        Elemento atual = this.primeiro;
        System.out.print("[");
        for (int i = 0; i < this.Quantidade; i++) {
            System.out.print(atual.getNumero());
            if (i < this.Quantidade - 1) {
                System.out.print(", ");
            }
            atual = atual.getProximo();
        }
        System.out.println("]");
    }
}
