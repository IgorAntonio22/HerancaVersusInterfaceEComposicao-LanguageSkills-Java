package br.treino.heranca.versus.composicaoEInterface.Composicoes;

public class Autenticacao {
	
	private String usuarioLogin = "igorUsuario";
	private String senhaLogin = "igorSenha";
	
	public void autenticar(String usuario, String senha) {
		if(usuario == usuarioLogin && senha == senhaLogin) {
			System.out.println("\nUsu�rio autenticado com sucesso!\n");
		} else {
			System.out.println("\nFalha na autentica��o do usu�rio :C\n");
		}
	}
}
