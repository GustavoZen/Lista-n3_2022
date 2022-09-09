package lista_03;

import java.util.Scanner;

public class Lista_03_funções {
	static Scanner entrada = new Scanner(System.in);

	public static int Somatorioimparvetor(int vet[]) {
		int saida = 0;
		for (int i = 1; i < vet.length; i+=2) {
			saida += vet[i];
		}
		return saida;
	}

	public static void povoarvetor(int[] vetor, int num) {
		if (vetor.length == 0) {
			return;
		}
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Informe o " + (i + 1) + "º elemento da array " + num + ".");
			vetor[i] = entrada.nextInt();
		}
	}

	public static int maior(int n, int m) {
		if (n > m) {
			return n;
		} else
			return m;
	}

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

	public static void Inversao_de_vetores_07(int[] vetor1, int[] vetor2) {
		int vetorauxiliar[] = new int[(vetor1.length + vetor2.length) - maior(vetor1.length, vetor2.length)];
		for (int i = 0; i < vetorauxiliar.length; i++) {
			vetorauxiliar[i] = vetor1[i];
			vetor1[i] = vetor2[i];
			vetor2[i] = vetorauxiliar[i];
		}
	}

	public static int[] Priorizacao_08(int[] vetor1, int[] vetor2) {
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
		return vetor2;
	}

	public static int[] Compactacao(int vet[], int n) {
		int inicial = vet[0], cont = 0, aux = 0;
		int[] vet2;
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] != 1 && vet[i] != 0)
				System.out.println("O vetor deve ser composto apenas de \"0's\" e \"1'\"s");
			if (vet[i] != inicial % 2)
				inicial++;
		}
		if (vet[0] == 0) {
			vet2 = new int[(inicial + 1) * 2];
		} else
			vet2 = new int[inicial * 2];
		inicial = vet[0];
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] != inicial % 2) {
				vet2[aux] = vet[i - 1];
				vet2[++aux] = cont;
				aux++;
				cont = 0;
				inicial++;
			}
			cont++;
			if (i == vet.length - 1) {
				vet2[aux] = vet[i];
				vet2[++aux] = cont;
			}
		}
		for (int i : vet2) {
			System.out.print(i + ",");
		}
		return vet2;
	}

	public static int[] Descompactacao(int vet[],int n) {
		int vet2[] = new int[Somatorioimparvetor(vet)];
		int cont = 0;
		for (int i = 0; i < vet.length; ) {
			for (int j = 0; j < vet[i + 1]; j++) {
				vet2[cont + j] = vet[i];
			}
			cont += vet[i+1];
			i+= cont;
		}
		return vet2;
	}

	public static void main(String[] args) {
		int vetor2[], vetor1[], vetor3[];
		int n = 0;
		int tam1 = 0, tam2 = 0,tam3 = 0;
		do {
			System.out.println("Quantos vetores serão utilizados? (máx: 2;mín: 1)");
			n = entrada.nextInt();
			if (n != 1 && n != 2) {
				System.out.println("Digite uma entrada válida!");
			}
		} while (n != 1 && n != 2);
		if (n == 1) {
			System.out.println("Informe o tamanho do vetor1: ");
			tam1 = entrada.nextInt();
		} else if (n == 2) {
			System.out.println("Informe o tamanho do vetor1: ");
			tam1 = entrada.nextInt();
			System.out.println("Informe o tamanho do vetor2: ");
			tam2 = entrada.nextInt();
		}

		vetor1 = new int[tam1];
		if (tam1 != 0)
			povoarvetor(vetor1, 1);
		vetor2 = new int[tam2];
		if (tam2 != 0)
			povoarvetor(vetor2, 2);
		entrada.close();
		vetor3 = new int [tam3];
		vetor3 = Descompactacao(vetor1,tam3);
		mostrar_vetor(vetor3);
	}
}
