package application;
import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double altura, peso;
		String classeimc;
		
		System.out.println("Qual é sua altura? (coloque em metros e para separar número decimal use um '.')");
		altura = sc.nextDouble();
		System.out.println("Qual é seu peso? (coloque em quilogramas)");
		peso = sc.nextDouble();
		
		double imc = peso / (altura * altura);
		
		if (imc < 16) {
			classeimc = "Subpeso severo";
		}
		else if (imc >= 16 && imc <= 19.9) {
			classeimc = "Subpeso";
		}
		else if (imc >= 20  && imc <= 24.9) {
			classeimc = "Normal";
		}
		else if (imc >= 25 && imc <= 29.9) {
			classeimc = "Sobrepeso";
		}
		else if (imc >= 30 && imc <= 39.9) {
			classeimc = "Obeso";
		}
		else {
			classeimc = "Obeso Mórbido";
		}
		
		System.out.printf("Seu IMC é %.1f e sua classificação é %s.", imc, classeimc);
		
		sc.close();
	}

}
