/**
 *Meu primeiro programa Java
 *Este programa mostra ao aluno:
 *1)Que um programa Java é construido dentro de um projeto java.
 *2)Todo programa Java deve ter uma Classe com método main.
 *3)Como exibir informações no terminal(Console) do Java.
 *4)Como ter um string do terminal (console) do Java.
 * 
 */
package meuPrimeiroProgramaJava;

import java.util.Scanner;

/**
 * @author Lucas
 * data: 03/02/2021
 *
 */
public class Principal { //Classe que contém o método principal.
	public static void main(String[] args) { // Este é o método principal.
		System.out.println("Olá amigo!\nQual é o seu nome?");
		
		// Ler uma string do console usando a biblioteca Scanner.
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		//Exibir uma string usando printf
		System.out.printf("Olá %s!", nome);
		in.close();
		
	}
	
	
}
