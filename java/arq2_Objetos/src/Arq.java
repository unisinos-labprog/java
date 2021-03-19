import java.util.ArrayList;
import java.io.*;

public class Arq {

	 private ArrayList <Padaria> lista;
	 private ArrayList <Mercado> lista2;
	 
	  Arq(){
		  lista = new ArrayList<Padaria>();
		  lista2 = new ArrayList<Mercado>();	 
	  }
	  
	  public void ins(Object o){
		  if(o instanceof Padaria) lista.add((Padaria)o);
		  else if(o instanceof Mercado) lista2.add((Mercado)o);
	  }
	  public void esvazia(){
		  lista.clear();
		  lista2.clear();
	  }
	  public ArrayList <Padaria> getLista(){
		  return lista;
	  }
	  public ArrayList <Mercado> getLista2(){
		  return lista2;
	  }
	  
	  public void grava(){
		  File f = new File("cadastro.txt");
		  
		  try{
			  FileOutputStream fos = new FileOutputStream(f);
			  ObjectOutputStream os = new ObjectOutputStream(fos);
			  
			  for(Padaria o:lista)
				  os.writeObject((Object)o);
			  for(Mercado o:lista2)
				  os.writeObject((Object)o);	
					  
			  os.close(); fos.close();
		  }
		  catch(IOException e){
			  System.out.println("nao consegui abrir o arquivo...");
		  }
	  }
	  public void le(){
		 
		 Object o=null;
		  
		 try{ 
		      File f = new File("cadastro.txt");
		  
		      System.out.println("tamanho:"+f.length());
		  		  
			  FileInputStream fis = new FileInputStream(f);
			  ObjectInputStream ois = new ObjectInputStream(fis);		  		  
			  
			  while((o=ois.readObject())!= null) {
				  if(o instanceof Padaria)  lista.add((Padaria)o);
				  else if(o instanceof Mercado)  lista2.add((Mercado)o);
				  else throw new ClassNotFoundException();
			  }

			  ois.close();
		  }
		  catch(EOFException e){
			  System.out.println("alcancou EOF...");
		  }	
		  catch(FileNotFoundException e){
			  System.out.println("nao encotrei o arquivo...");
		  }
		  catch(IOException e){
			  System.out.println("erro na leitura dos dados...");
		  } 
		  catch (ClassNotFoundException e) {
			  System.out.println("nao encontrei a classe...");
		  }
	  }	  
	  
	
}
