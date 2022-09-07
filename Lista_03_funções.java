package lista_03;

import java.util.Scanner;

public class Lista_03_funções {

	public static void mostrar_vetor(int vetor[]) {
		for (int i = 0; i < vetor.length; i++) {
			if (i == (vetor.length - 1)) {
				System.out.print(vetor[i]);
			} else
				System.out.print(vetor[i] + " ; ");
		}
		System.out.println();
	}

	public static int Pesquisa_01(int[] vetor) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Número que será pesquisado :");
		int num = entrada.nextInt();
		entrada.close();
		boolean teste = false;
		int i = 0;
		for (i = 0; i < vetor.length; i++) {
			if (num == vetor[i]) {
				teste = true;
				break;
			}
		}
		if (teste == true) {
			System.out.println("O número " + num + " se encontra na posição [" + i + "]");
			return i;
		} else
			System.out.println("O número " + num + " não está contido na array.");
		return -100;
	}

	public static int Pesquisa_por_indice_02(int vetor[]) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Número de índice :");
		int indice = entrada.nextInt();
		entrada.close();
		if (indice >= vetor.length) {
			System.out.println("Índice [" + indice + "] não existe no vetor");
			return 0;
		} else {
			System.out.println("O número do índice " + indice + " da array é: " + vetor[indice]);
			return vetor[indice];
		}
	}

	public static void Separacao_de_valores_03(int vetor[]) {
		for (int i = 0; i < vetor.length; i++) {
			for (int j = i; j < vetor.length; j++) {
				if (vetor[i] > vetor[j]) {
					int aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
	}

	public static int Somatorio_04(int vetor[]) {
		int soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		return soma;
	}

	public static int[] Juncao_de_vetor_05(int vetor1[], int vetor2[]) {
		int vetoraux[];
		vetoraux = new int[(vetor1.length + vetor2.length)];
		for (int i = 0; i < vetor1.length; i++) {
			vetoraux[i] = vetor1[i];
		}
		for (int i = vetor1.length; i < (vetor1.length + vetor2.length); i++) {
			vetoraux[i] = vetor2[i - vetor1.length];
		}
		return vetoraux;
	}

	public static int[] Invesao_de_ordem_06(int vetor[]) {
		int aux, fim = vetor.length - 1;
		for (int i = 0; i < (vetor.length / 2); i++) {
			aux = vetor[i];
			vetor[i] = vetor[fim - i];
			vetor[fim - i] = aux;
		}
		return vetor;
	}

	public static int[] Inversao_de_vetores_07(int[] vetor1, int[] vetor2) {
		int vetorauxiliar1[];
		int vetorauxiliar2[];
		vetorauxiliar1 = new int[vetor1.length];
		vetorauxiliar2 = new int[vetor2.length];
		for (int i = 0; i < vetor1.length; i++) {
			vetorauxiliar1[i] = vetor1[i];
		}
		for (int i = 0; i < vetor2.length; i++) {
			vetorauxiliar2[i] = vetor2[i];
		}
		vetor2 = new int[vetorauxiliar1.length];
		vetor1 = new int[vetorauxiliar2.length];
		for (int i = 0; i < vetorauxiliar1.length; i++) {
			vetor2[i] = vetorauxiliar1[i];
		}
		for (int i = 0; i < vetorauxiliar2.length; i++) {
			vetor1[i] = vetorauxiliar2[i];
		}
		return vetor1;
	}

	public static void Priorizacao_08(int[] vetor1, int[] vetor2) {
		int media = Somatorio_04(vetor2) / vetor2.length;
		int add = 0, aux = 0;
		int vetoraux[] = new int[vetor2.length];
		// Armazenando vetor para após aumentar seu tamanho.
		for (int i = 0; i < vetor2.length; i++) {
			vetoraux[i] = vetor2[i];
		}
		// Verificando a quantidade de inteiros que serão adicionados
		for (int i = 0; i < vetor1.length; i++) {
			if (vetor1[i] > media) {
				add++;
			}
		}
		vetor2 = new int[(vetor2.length + add)];
		// Adicionando ao vetor
		for (int i = 0; i < vetor2.length; i++) {
			for (int j = 0; j < vetor1.length; j++) {
				if (i < vetoraux.length) {
					vetor2[i] = vetoraux[i];
				} else if (vetor1[j] > media) {
					vetor2[i + aux] = vetor1[j];
					aux++;
				}
			}
		}
	}

	public static void main(String[] args) {

		int vetor2[];
		int vetor1[];
		System.out.println("Informe o tamanho do vetor1: ");
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		vetor1 = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Informe o " + (i + 1) + "º elemento da 1ª array.");
			vetor1[i] = entrada.nextInt();
		}
		System.out.println("Informe o tamanho do vetor2: ");
		n = entrada.nextInt();
		vetor2 = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Informe o " + (i + 1) + "º elemento da 2ª array.");
			vetor2[i] = entrada.nextInt();
		}
		Priorizacao_08(vetor1, vetor2);
		for (int i : vetor2) {
			System.out.println(i);
		}
		entrada.close();
	}
}
