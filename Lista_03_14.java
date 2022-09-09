package lista_03;

import java.util.Scanner;

public class Lista_03_14 {
	static Scanner entrada = new Scanner(System.in);

	public static boolean pesquisarcaractere(char vet[], int i, char c) {
		if (vet[i] == c)
			return true;
		else
			return false;
	}

	public static boolean antirepeticao(char vet[], char vet2[],int n) {
		int cont = 0;
		for (int i = 0; i < vet.length; i++) {
				if (vet[n] == vet2[i]) {
					cont++;
				}
		}
		if (cont >= 1) {
			return false;
		} else
			return true;
	}

	public static String Contagem_de_caracteres(char[] vet) {
		int cont = 0;
		String saida = "";
		char vetaux[] = new char[vet.length];
		for (int i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet.length; j++) {
				if (pesquisarcaractere(vet, j, vet[i])) {
					cont++;
				}
			}

			if (antirepeticao(vet, vetaux,i)) {
				saida += "" + vet[i] + "=" + cont + " - ";
			}
			cont = 0;
			vetaux[i] = vet[i];
		}
		return saida;
	}

	public static void main(String[] args) {
		System.out.print("\nInforme o tamanho do vetor de caracteres: ");
		int n = entrada.nextInt();
		char vet[] = new char[n];
		entrada.nextLine();
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Informe o " + (i + 1) + "º caractere do vetor");
			vet[i] = entrada.nextLine().charAt(0);
		}
		System.out.println(Contagem_de_caracteres(vet));
	}
}
