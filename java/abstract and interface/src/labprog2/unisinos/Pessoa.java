package labprog2.unisinos;

public abstract class Pessoa {

	protected String nome;
	protected int id;

	public abstract void executaAtividade();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
