package one.digitalinnovation;

/*Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média, e em que mês
elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 –  Fevereiro e etc).*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TemperaturaMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> temperaturaMes = new ArrayList<>();

        System.out.println("Insira a temperatura média de cada mês do primeiro semestre.");
        for (int i = 0; i < 6; i++) {
            System.out.print((i + 1) + "º mês: ");
            temperaturaMes.add(scanner.nextDouble());
        }
        System.out.println("\nTemperaturas:\n" + temperaturaMes);

        Iterator<Double> iterator = temperaturaMes.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }

        Double media = soma / temperaturaMes.size();
        System.out.println("\nMedia de temperatura: " + media);

        int i = 0;
        System.out.println("Meses que ficaram acima da média de temperatura: ");
        for (Double mes : temperaturaMes) {
            if (mes > media) {
                switch (i) {
                    case 0:
                        System.out.print("Janeiro - ");
                        break;
                    case 1:
                        System.out.print("Fevereiro - ");
                        break;
                    case 2:
                        System.out.print("Março - ");
                        break;
                    case 3:
                        System.out.print("Abril - ");
                        break;
                    case 4:
                        System.out.print("Maio - ");
                        break;
                    case 5:
                        System.out.print("Junho - ");
                        break;
                }
                System.out.println(mes);
            }
            i++;
        }
    }
}
