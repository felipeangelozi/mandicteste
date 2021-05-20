package application;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String texto;
		
		System.out.println("Digite o texto que dejea traduzir:");
		texto = sc.nextLine();
		
		String textoTrad = texto.toLowerCase();
		textoTrad = textoTrad.replaceAll("[0-9]", "");
		
		textoTrad = textoTrad.replace("c", "3");
		textoTrad = textoTrad.replace('f', '6');
		textoTrad = textoTrad.replace('i', '9');
		textoTrad = textoTrad.replace("l", "12");
		textoTrad = textoTrad.replace("o", "15");
		textoTrad = textoTrad.replace("r", "18");
		textoTrad = textoTrad.replace("u", "21");
		textoTrad = textoTrad.replace("x", "24");
		
		System.out.printf("Seu texto traduzido é: %s", textoTrad);
		
		sc.close();
	}

}
