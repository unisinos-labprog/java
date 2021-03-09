package labprog2.unisinos;

public class Diretor extends Pessoa implements ICracha {

	public Diretor(String nome, int id) {
		this.nome = nome;
		this.id = id;
	}

	public void mostraSeusDados() {
		System.out.println("Nome:" + nome + "\nID:" + id);
		System.out.println("Versao atual:" + versaoImplementacao);
	}

	@Override
	public void executaAtividade() {
		System.out.println("Gosto de dar ordens...");
	}
}
