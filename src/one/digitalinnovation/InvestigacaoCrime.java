package one.digitalinnovation;
/*Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:

        "Telefonou para a vítima?"
        "Esteve no local do crime?"
        "Mora perto da vítima?"
        "Devia para a vítima?"
        "Já trabalhou com a vítima?"

Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice"
e 5 como "Assassina". Caso contrário, ela será classificado como "Inocente".*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class InvestigacaoCrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> respostas = new ArrayList<>();
        int i = 0;

        System.out.println("Estamos investigando um assassinato. Responda as perguntas usando somente SIM (s) e NÃO (n).    \n");

        System.out.print("Telefonou para a vítima? ");
        respostas.add(scanner.next());
        System.out.print("Esteve no local do crime? ");
        respostas.add(scanner.next());
        System.out.print("Mora perto da vítima? ");
        respostas.add(scanner.next());
        System.out.print("Devia para a vítima? ");
        respostas.add(scanner.next());
        System.out.print("Já trabalhou com a vítima? ");
        respostas.add(scanner.next());
        System.out.println(respostas.toString().toUpperCase());

        Iterator<String> iterator = respostas.iterator();
        while (iterator.hasNext()){
            if (iterator.next().equalsIgnoreCase("S")) {
                i++;
            }
        }

        System.out.println("\n");
        System.out.println("Total de respostas SIM: " + i);
        if (i == 0){
            System.out.println("Classificação: INOCENTE.");
        }else if (i == 2){
            System.out.println("Classificação: SUSPEITO.");
        }else if (i <= 4){
            System.out.println("Classificação: CÚMPLICE.");
        }else System.out.println("Classificação: ASSASSINO.");
    }
}
