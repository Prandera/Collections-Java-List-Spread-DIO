package one.digitalinnovation;

//Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        List<Double> notas = new ArrayList<>();

        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println("Crie uma lista e adicione as sete notas:\n" + notas);
        System.out.println("-----------------------------------------------------------");
        System.out.println("Exiba a posição da nota 5.0: Posição " + notas.indexOf(5.0));
        System.out.println("-----------------------------------------------------------");
        System.out.println("Adicione na lista a nota 8.0 na posição 4:");
        notas.add(4, 8.0);
        System.out.println(notas);
        System.out.println("-----------------------------------------------------------");
        System.out.println("Substitua a nota 5.0 pela nota 6.0:");
        notas.set(notas.indexOf(5.0), 6.0); //Tambem podemos inserir o index direto, nesse caso ja sabemos que é o 3.
        System.out.println(notas);
        System.out.println("-----------------------------------------------------------");
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0));
        System.out.println("-----------------------------------------------------------");
        System.out.println("Exiba as notas na ordem em que foram informadas:\n" + notas);
        //A lista ja adiciona os elementos em ordem de inserção, por isso ja esta ordenado.
        //Tambem podemos usar o modo for each para imprimir:
        //for (Double nota : notas) System.out.println(nota);
        System.out.println("-----------------------------------------------------------");
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println("-----------------------------------------------------------");
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        //Não existe o metodo da List para encontrar o menor valor, por isso utilizamos o metodo da Collections Min.
        System.out.println("-----------------------------------------------------------");
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        System.out.println("-----------------------------------------------------------");
        System.out.print("Exiba a soma dos valores: ");
        Double soma = 0d;
        Iterator<Double> iterator = notas.iterator();
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println(soma);
        System.out.println("-----------------------------------------------------------");
        System.out.println("Exiba a média das notas: " + (soma / notas.size()));
        System.out.println("-----------------------------------------------------------");
        notas.remove(0d);//Temos que especificar com o 0d ou 0.0, pois, do contrario, a JVM vai remover o elemento
        // de posição 0 ja que estamos passando um valor int como index, nesse caso, o 7.0
        System.out.println("Remova a nota 0:\n" + notas);
        System.out.println("-----------------------------------------------------------");
        notas.remove(0);
        System.out.println("Remova a nota de indice 0:\n" + notas);
        System.out.println("-----------------------------------------------------------");
        System.out.print("Remova as notas menores que 7 e exiba a lista:\n");
        Iterator<Double> iteratorRemove = notas.iterator();
        while (iteratorRemove.hasNext()) { //Ver Collections.removeif
            if (iteratorRemove.next() < 7) iteratorRemove.remove();
        }
        System.out.println(notas);
        System.out.println("-----------------------------------------------------------");
        System.out.print("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);
        System.out.println("-----------------------------------------------------------");
        System.out.print("Confira se a lista está vazia: ");
        System.out.println(notas.isEmpty());
    }
}
