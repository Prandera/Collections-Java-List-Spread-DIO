package one.digitalinnovation;
//Dadas as seguintes informações sobre os gatos, crie uma
//lista e ordene esta lista exibindo: Nome - Idade - Cor

import javax.print.attribute.standard.JobName;
import javax.sound.midi.Soundbank;
import java.util.*;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {

        List<Gato> gatos = new ArrayList<>() {{
            add(new Gato("Jon", 18, "Preto"));
            add(new Gato("Simba", 6, "Tigrado"));
            add(new Gato("Jon", 12, "Amarelo"));
        }};
        //A lista ja fica na ordem de inserção, por isso so precisamos exibir.
        System.out.println("ORDEM DE INSERÇÃO:");
        System.out.println(gatos);
        System.out.println("--------------------------------------");

        System.out.println("ORDEM ALEATÓRIA:");
        Collections.shuffle(gatos);
        System.out.println(gatos);
        System.out.println("--------------------------------------");

        System.out.println("ORDEM NATURAL -> NOME");
        //gatos.sort(); -> Demanda a implementação do Comparator, porém, estamos implementando o Comparable
        //Então podemos usar o metodo da Collections:
        Collections.sort(gatos);//-> Aceita uma lista que implementa Comparable
        System.out.println(gatos);
        System.out.println("--------------------------------------");

        System.out.println("ORDEM IDADE:");
        //Criamos as classes comparator que implementam Comparator. Assim nao precisamos ficar reescrevendo o compareTo.
        //Collections.sort(gatos, new ComparatorIdade());
        gatos.sort(new ComparatorIdade()); //Ambas as formas funcionam.
        System.out.println(gatos);
        System.out.println("--------------------------------------");

        System.out.println("ORDEM COR:");
        //Collections.sort(gatos, new ComparatorCor());
        gatos.sort(new ComparatorCor());
        System.out.println(gatos);
        System.out.println("--------------------------------------");

        System.out.println("ORDEM NOME/COR/IDADE");
        //Collections.sort(gatos, new ComparatorNomeCorIdade());
        gatos.sort(new ComparatorNomeCorIdade());
        System.out.println(gatos);
        System.out.println("--------------------------------------");

    }
}

class Gato implements Comparable<Gato> {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}