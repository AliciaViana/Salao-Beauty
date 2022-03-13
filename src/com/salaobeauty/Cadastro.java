package com.salaobeauty;

import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		Scanner myObj = new Scanner(System.in);
		UsuarioServico usuarioServico = new UsuarioServico();

		System.out.println("Digite seu nome:  ");
		usuario.setNome(myObj.nextLine());

		System.out.println("Digite seu email: ");
		usuario.setEmail(myObj.nextLine());

		System.out.println("Digite seu cpf:  ");
		usuario.setCpf(myObj.nextLine());

		usuarioServico.salvaUsuario(usuario);
	}

}
