package application;

import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String texto;
		String linha1 = "";
		String linha2 = "";
		String linha3 = "";
		
		System.out.println("Digite o texto que queira traduzir para arte ASCII:");
		texto = sc.nextLine();
		
		String textoTraduzido = texto.toLowerCase();
		textoTraduzido = textoTraduzido.replaceAll("[0-9]", "");
		
		for(char caractere : textoTraduzido.toCharArray()) {
			switch(caractere) {
			case 'a':
				linha1 = linha1 + "     ";
				linha2 = linha2 + " /\\  ";
				linha3 = linha3 + "/~~\\ ";
				break;
			case 'b':
				linha1 = linha1 +  " __  ";
				linha2 = linha2 +  "|__) ";
				linha3 = linha3 + "|__) ";
				break;
			case 'c':
				linha1 = linha1 + " __  ";
				linha2 = linha2 + "/  ` ";
				linha3 = linha3 + "\\__, ";
				break;
			case 'd':
				linha1 = linha1 + " __  ";
				linha2 = linha2 + "|  \\ ";
				linha3 = linha3 + "|__/ ";
				break;
			case 'e':
				linha1 = linha1 + " ___ ";
				linha2 = linha2 + "|__  ";
				linha3 = linha3 + "|___ ";
				break;
			case 'f':
				linha1 = linha1 + " ___ ";
				linha2 = linha2 + "|__  ";
				linha3 = linha3 + "|    ";
				break;
			case 'g':
				linha1 = linha1 + " __  ";
				linha2 = linha2 + "/ _` ";
				linha3 = linha3 + "\\__> ";
				break;
			case 'h':
				linha1 = linha1 + "     ";
				linha2 = linha2 + "|__| ";
				linha3 = linha3 + "|  | ";
				break;
			case 'i':
				linha1 = linha1 + "     ";
				linha2 = linha2 + "|    ";
				linha3 = linha3 + "|    ";
				break;
			case 'j':
				linha1 = linha1 + "     ";
				linha2 = linha2 + "   | ";
				linha3 = linha3 + "\\__/ ";
				break;
			case 'k':
				linha1 = linha1 + "     ";
				linha2 = linha2 + "|__/ ";
				linha3 = linha3 + "|  \\ ";
				break;
			case 'l':	
				linha1 = linha1 + "     ";
				linha2 = linha2 + "|    ";
				linha3 = linha3 + "|___ ";
				break;
			case 'm':
				linha1 = linha1 + "     ";
				linha2 = linha2 + " |\\/|";
				linha3 = linha3 + " |  |";
				break;
			case 'n':
				linha1 = linha1 + "     ";
				linha2 = linha2 + "|\\ | ";
				linha3 = linha3 + "| \\| ";
				break;
			case 'o':	
				linha1 = linha1 + " __  ";
				linha2 = linha2 + "/  \\ ";
				linha3 = linha3 + "\\__/ ";
				break;
			case 'p':	
				linha1 = linha1 + " __  ";
				linha2 = linha2 + "|__) ";
				linha3 = linha3 + "|    ";
				break;
			case 'q':	
				linha1 = linha1 + " __  ";
				linha2 = linha2 + "/  \\ ";
				linha3 = linha3 + "\\__X ";
				break;
			case 'r':
				linha1 = linha1 + " __  ";
				linha2 = linha2 + "|__) ";
				linha3 = linha3 + "|  \\ ";
				break;
			case 's':
				linha1 = linha1 + " __  ";
				linha2 = linha2 + "/__` ";
				linha3 = linha3 + ".__/ ";
				break;
			case 't':
				linha1 = linha1 + "___  ";
				linha2 = linha2 + " |   ";
				linha3 = linha3 + " |   ";
				break;
			case 'u':
				linha1 = linha1 + "     ";
				linha2 = linha2 + "|  | ";
				linha3 = linha3 + "\\__/ ";
				break;
			case 'v':
				linha1 = linha1 + "     ";
				linha2 = linha2 + "\\  / ";
				linha3 = linha3 + " \\/  ";
				break;
			case 'w':
				linha1 = linha1 + "     ";
				linha2 = linha2 + "|  | ";
				linha3 = linha3 + "|/\\| ";
				break;
			case 'x':
				linha1 = linha1 + "     ";
				linha2 = linha2 + "\\_/  ";
				linha3 = linha3 + "/ \\  ";
				break;
			case 'y':
				linha1 = linha1 + "     ";
				linha2 = linha2 + "\\ /  ";
				linha3 = linha3 + " |   ";
				break;
			case 'z':
				linha1 = linha1 +  "__   ";
				linha2 = linha2 +  " /   ";
				linha3 = linha3 +  "/_   ";
				break;
			}
		}
		
		System.out.println(linha1);
		System.out.println(linha2);
		System.out.println(linha3);
		
		sc.close();
	}

}
