package helloworlddupla;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world!!");
		System.out.println("Alteração do código!");
		
		Random r = new Random();
		int numeroDaSorte = Math.abs(r.nextInt() % 10);
		int numeroSorteado = Math.abs(r.nextInt() % 10);
		
		if (numeroDaSorte == numeroSorteado) 
			System.out.printf("Parabéns, seu numero foi sorteado!: %d\n", numeroDaSorte);
		else
			System.out.printf("Não foi dessa vez! Seu numero é: %d e o numero gerado é: %d\n", numeroDaSorte, numeroSorteado);
	}

}
