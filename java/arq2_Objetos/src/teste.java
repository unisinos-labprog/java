
public class teste {

	public static void main(String[] args) {
		
/*		Arq ar = new Arq();
		
		ar.ins(new Padaria("Sul"));
		ar.ins(new Padaria("Central"));
		ar.ins(new Padaria("Norte"));
		ar.ins(new Mercado("Golomb"));
		
		ar.grava();
		
		ar.esvazia();
		
		ar.le();
		
		System.out.println((ar.getLista()).get(0).getNome());
		System.out.println((ar.getLista()).get(1).getNome());
		System.out.println((ar.getLista2()).get(0).getNome());*/
		
		ArquivoObjetos ar = new ArquivoObjetos();
		
		ar.ins(new Padaria("Sul"));
		ar.ins(new Padaria("Central"));
		ar.ins(new Padaria("Norte"));
		ar.ins(new Padaria("Golomb"));
		
		ar.mostra();
		
		ar.grava();
		
		ar.esvazia();
		
		ar.le();
		
		ar.mostra();
	}

}
