package arq4b_Buffered;

import java.io.*;

public class Teste_Buf_b {

	public static void main(String args[]) {

		// Lendo de arquivo com BufferedReader...

		/*
		 * try with resources
		 * 
		 * try( instancia de AutoCloseable ) { ... }
		 * 
		 */
		try (BufferedReader in = new BufferedReader(new FileReader("dados.txt"))) {
			// FileReader f = new FileReader("dados.txt");
			// BufferedReader in = new BufferedReader(f);

			String linha;
			while ((linha = in.readLine()) != null)
				System.out.println("Leu:" + linha);

			/*
			 * outras possibilidades: char []vet = new char[100]; int quantosLeu =
			 * in.read(vet); //se retornar -1, alcancou final da stream quantosLeu =
			 * in.read(vet, 2, 4); //le a partir da posicao 2, 4 chars
			 */

			// in.close();
		} catch (IOException e) {
		}

		// Gravando arquivo com PrintWriter...
		try (PrintWriter out = new PrintWriter(new FileWriter("dadosSaida.txt"))) {
			// FileWriter f = new FileWriter("dadosSaida.txt");
			// PrintWriter out = new PrintWriter(f);

			out.println("primeira linha");
			out.println("segunda linha");
			out.println(123);
			out.println(77.3);

			out.close();
		} catch (IOException e) {
		}
	}
}
