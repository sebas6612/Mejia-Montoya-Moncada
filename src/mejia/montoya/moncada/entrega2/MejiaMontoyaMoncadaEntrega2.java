/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mejia.montoya.moncada.entrega2;

import comun.*;
import listas.*;
import pilas.*;

/**
 *
 * @author sebastian
 */
public class MejiaMontoyaMoncadaEntrega2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        list.add("probando");
        list.add("doubly");
        list.add("linked");
        list.add("list");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.contains("probando"));
        list.remove(1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.remove("linked");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.set(1, "set");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // TODO code application logic here
    }

}
