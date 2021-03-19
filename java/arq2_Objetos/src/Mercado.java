import java.io.Serializable;


public class Mercado implements Serializable{
 String nome;
 int numFunc;
  Mercado(String nome){
	 this.nome=nome; 
	 numFunc=(int)(Math.random()*10);
  }
  public String getNome(){
	  return nome;
  }
  
}
