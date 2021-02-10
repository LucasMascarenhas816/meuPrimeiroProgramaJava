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
public class Principal { 
	public static void main(String[] args) { 
		
		//Saldação e pergunta o nome.
		System.out.println("Olá amigo!\nQual é o seu nome?");
		
		//Ler o nome.
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		//Saldação especifica para o próorio nome lido.
		System.out.printf("Olá %s!", nome);
		in.close();
		
	}
	
	
}
