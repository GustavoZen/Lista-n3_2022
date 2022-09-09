package lista_03;

import java.util.Scanner;

public class Lista_03_12x13 {

	static Scanner entrada = new Scanner(System.in);

	public static char Cript(char c) {
		if (c == 'a')
			return '%';
		if (c == 'b')
			return '*';
		if (c == 'c')
			return '(';
		if (c == 'd')
			return '-';
		if (c == 'e')
			return '+';
		if (c == 'f')
			return '@';
		if (c == 'g')
			return '#';
		if (c == 'h')
			return '1';
		if (c == 'i')
			return '2';
		if (c == 'j')
			return '3';
		if (c == 'l')
			return '4';
		if (c == 'm')
			return '5';
		if (c == 'n')
			return '6';
		if (c == 'o')
			return '7';
		if (c == 'p')
			return '8';
		if (c == 'q')
			return '9';
		if (c == 'r')
			return '{';
		if (c == 's')
			return '}';
		if (c == 't')
			return '!';
		if (c == 'u')
			return '&';
		if (c == 'v')
			return '$';
		if (c == 'x')
			return '?';
		if (c == 'z')
			return ':';
		return 'o';
	}

	public static char Cript2(char c) {
		if (c == '%')
			return 'a';
		if (c == '*')
			return 'b';
		if (c == '(')
			return 'c';
		if (c == '-')
			return 'd';
		if (c == '+')
			return 'e';
		if (c == '@')
			return 'f';
		if (c == '#')
			return 'g';
		if (c == '1')
			return 'h';
		if (c == '2')
			return 'i';
		if (c == '3')
			return 'j';
		if (c == '4')
			return 'l';
		if (c == '5')
			return 'm';
		if (c == '6')
			return 'n';
		if (c == '7')
			return 'o';
		if (c == '8')
			return 'p';
		if (c == '9')
			return 'q';
		if (c == '{')
			return 'r';
		if (c == '}')
			return 's';
		if (c == '!')
			return 't';
		if (c == '&')
			return 'u';
		if (c == '$')
			return 'v';
		if (c == '?')
			return 'x';
		if (c == ':')
			return 'z';
		return 'o';

	}

	public static String[] Criptografia(String[] palavras) {
		String[] saida = new String[palavras.length];
		char[][] palavra = new char[palavras.length][100];
		for (int i = 0; i < palavras.length; i++) {
			saida[i] = "";
			for (int j = 0; j < palavras[i].length(); j++) {
				palavra[i][j] = Cript(palavras[i].charAt(j));
				saida[i] += palavra[i][j];
			}
		}
		return saida;
	}

	public static String[] Descriptografia(String[] palavras) {
		String[] saida = new String[palavras.length];
		char[][] palavra = new char[palavras.length][100];
		for (int i = 0; i < palavras.length; i++) {
			saida[i] = "";
			for (int j = 0; j < palavras[i].length(); j++) {
				palavra[i][j] = Cript2(palavras[i].charAt(j));
				saida[i] += palavra[i][j];
			}
		}
		return saida;
	}

	public static void main(String[] args) {
		System.out.println("Quantidade de palavras a ser digitada: ");
		int qtd = entrada.nextInt();
		String[] palavras = new String[qtd];
		entrada.nextLine();
		for (int i = 0; i < qtd; i++) {
			System.out.println((i + 1) + "ª Palavra: ");
			palavras[i] = entrada.nextLine();
		}
		for (int i = 0; i < qtd; i++) {
			palavras[i] = Criptografia(palavras)[i];
			System.out.println(palavras[i]);
		}
		for (int i = 0; i < qtd; i++) {
			palavras[i] = Descriptografia(palavras)[i];
			System.out.println(palavras[i]);
		}
		
	}
}
