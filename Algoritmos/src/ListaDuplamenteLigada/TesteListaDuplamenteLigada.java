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
public class TesteListaDuplamenteLigada {

    public static void main(String[] args) {
       
        ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
        System.out.println("Inserir na ultima posição");
        lista.inserirNoFinal(8);
        lista.inserirNoFinal(12);
        lista.inserirNoFinal(6);
        lista.inserirNoFinal(9);
        
        lista.imprimirLista();
        
        System.out.println("Inserir na primeira posicao");
        lista.inserirNoComeco(1);
        lista.inserirNoComeco(5);
     
        
        lista.imprimirLista();
        
        System.out.println("inseir na posição escolhida");

        lista.inserirEmPosicao(10, 3);
        lista.inserirEmPosicao(0, 0);
        lista.imprimirLista();
        
        System.out.println("Remover numero desejado");
        lista.removerNumero(5);
        lista.removerNumero(12);
        lista.imprimirLista();
}
}