package helloworlddupla;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world!!");
		System.out.println("Alteração do código!");
		
		Random r = new Random();
		
		System.out.printf("Seu numero da sorte é: %d\n", r.nextInt() % 100);
	}

}
