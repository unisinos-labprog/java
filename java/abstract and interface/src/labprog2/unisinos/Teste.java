package labprog2.unisinos;

public class Teste {

	public static void main(String[] args) {

		Assistente a = new Assistente("Lucio", 3445);
		Diretor d = new Diretor("Mauro", 112);

		a.mostraSeusDados();
		a.executaAtividade();
		
		d.mostraSeusDados();
		d.executaAtividade();
	}

}
