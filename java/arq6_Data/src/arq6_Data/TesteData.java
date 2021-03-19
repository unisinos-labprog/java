package arq6_Data;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class TesteData {

	public static void main(String[] args) {
		
		File f = new File("dados.txt");
		
		try {
			FileOutputStream fos = new FileOutputStream(f);
			DataOutputStream dos = new DataOutputStream(fos);
			
			int n = 5;
			dos.writeInt(n);      //  int n = dis.readInt();
			
			double m = 23.5;
			dos.writeDouble(m);
			
			dos.close();
		}  catch (IOException e) {
		      System.out.println("nao foi possivel salvar no arquivo...");
	    }

		/*
		 
		 Outro exemplo de leitura...
		 
		  try{
		  	int tamArq = (int) f.lenth();
		  	byte[] arq = new byte[tamArq];
		  	
		  	dis.readFully(arq);
		  	dis.close();
		  } catch(...
		   
		 */
	}

}
