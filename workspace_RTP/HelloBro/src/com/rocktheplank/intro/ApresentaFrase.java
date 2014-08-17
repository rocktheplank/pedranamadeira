package com.rocktheplank.intro;

import java.util.Scanner;

public class ApresentaFrase {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out
				.println("Olá\nVou contar quantas letras tem sua palavra :D\nInsira uma palavra:");
		String palavraInserida = leitor.nextLine().trim();

		System.out.println("Tamanho da palavra: " + palavraInserida.length());
		leitor.close();
	}
}