package application;

import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		char chave = 's';
		
		while (chave == 's') {
			
			try {
				URL url = new URL("http://www.google.com");
				URLConnection conexao = url.openConnection();
				conexao.connect();
				System.out.println("Você possui conexão com a internet!");
			} catch (Exception excecao) {
				System.out.println("Você não possui conexão com a internet!");
	      }
			
			System.out.println();
			System.out.println("Deseja testar a conexão novamente novamente? (s/n)");
			chave = sc.next().charAt(0);
	   }
		
		sc.close();		
		
	}
}

