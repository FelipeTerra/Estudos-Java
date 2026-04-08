package com.felipeterra;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>(); // criando e instanciando a lista

        // aqui estou inserindo elementos na lista
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //agora vou inserir um elemento em uma posição específica da lista
        list.add(2, 9);

        System.out.println("Tamanho da lista");
        System.out.println(list.size());// imprimindo o tamanho da lista
        System.out.println("------------------------");
        System.out.println("Elementos da lista:");
        for(Integer i : list){ // aqui é um tipo de for diferente, chama for each (ainda n sei muito bem explicar para que serve)
            System.out.println(i);
        }

        // removendo um elemento da lista. Você pode remover tanto pelo "valor" que está dentro do nodo, ou pela posição
        list.remove(2);//removendo a informação que está no nodo 2;
        System.out.println("------------------------");
        System.out.println("Elementos da lista atualizada:");
        for(Integer i : list){
            System.out.println(i);
        }

        list.remove(Integer.valueOf(2));//removendo a informação a partir de um valor que será usado para comparação com as informações armazenadas na lista. Nesse caso tenho que forçar o java a entender que quero remover pelo valor, então precisa fazer essa conversão (Integer.valueOf(2))
        System.out.println("------------------------");
        System.out.println("Elementos da lista atualizada:");
        for(Integer i : list){
            System.out.println(i);
        }

        List<String> list2 = new ArrayList<>();// criando e instanciando uma lista do tipo String
        //inserindo elementos na lista
        list2.add("Felipe");
        list2.add("Pepito");
        list2.add("Amanda");
        list2.add("Rio");
        list2.add("Fernando");
        list2.add("Fábio");

        System.out.println("------------------------------");
        System.out.println("Tamanho da lista da lista:");
        System.out.println(list2.size());
        System.out.println("------------------------------");
        System.out.println("Lista de String:");

        for(String s : list2){
            System.out.println(s);
        }

        //usando predicados para remover elementos da lista que comecem com a mesma letra
        list2.removeIf(x -> x.startsWith("F")); //mais usado na prática
        list2.removeIf(x -> x.charAt(0) == 'R');//usado mais para aprendizagem. Aqui ele compara com um char

        System.out.println("------------------------------");
        System.out.println("Lista de String atualizada:");

        for(String s : list2){
            System.out.println(s);
        }

        //encontrando a posição de um elemento com a função infex.of()
        System.out.println("------------------------------");
        System.out.println("Posição da Amanda: " + list2.indexOf("Amanda"));

        //fintrando a lista com os nomes que comecem com uma determinada letra
        list2.add("Anderson");
        list2.add("Antonela");
        list2.add("Regina");
        list2.add("Fábio");
        list2.add("Felipe");

        System.out.println("------------------------------");
        System.out.println("Nova lista: ");

        for(String s : list2){
            System.out.println(s);
        }

        List<String> list3 = list2.stream()
                .filter(x -> x.charAt(0) == 'A')
                .toList();

        System.out.println("------------------------------");
        System.out.println("Nova lista atualizada hehe: ");

        for(String y : list3){
            System.out.println(y);
        }
        sc.close();
    }
}