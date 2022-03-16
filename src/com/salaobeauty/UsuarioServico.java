package com.salaobeauty;

public class UsuarioServico {

	public void salvaUsuario(Usuario usuario) {
		// null
		// isEmpty()
		if (this.validaUsuario(usuario) == true) {
			System.out.println("o usuario " + usuario.getNome() + " foi salvo com sucesso ");
		} else {
			System.out.println("O usuário não foi salvo");
		}

	}

	public boolean validaUsuario(Usuario usuario) {
		if (usuario.getNome().isEmpty()) {
			System.out.println("o campo nome nao pode ficar vazio");
			return false;

		} else if (usuario.getCpf().isEmpty()) {
			System.out.println("o campo cpf nao pode ficar vazio");
			return false;

		} else if (usuario.getEmail().isEmpty()) {
			System.out.println("o campo email nao pode ficar vazio");
			return false;

		} else if (usuario.getCpf().length() != 11) {
			System.out.println("verifique o numero de digitos do seu cpf ");
			return false;

		} else
			return true;

	}

}
