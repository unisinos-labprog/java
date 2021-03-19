package arq1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Teste_arq1 {

  public static void gravandoDados() {

    // criando o arquivo; objeto f eh o File Handler
    File f = new File("c:\\users\\ernie\\dados.txt");  // com path =>   "c:\\temp\\dados.txt"

    // armazenando (gravando) dados no arquivo
    try {
      FileOutputStream fos = new FileOutputStream(f);

      fos.write(83); // primeiro byte; eh o valor ASCII de 'S'
      fos.write(73); // segundo byte
      fos.write(77); // segundo byteFile 

      int x = 65;
      fos.write(x); // inteiros maiores que 255 ocupam + de um byte no arquivo

      fos.write('8');  // grava 56 que eh o cod. ASCII do char '8'
      fos.write(10);   // grava 10, que eh o ASCII da nova linha
      fos.write('\n'); // tambem grava 10

      for (int i = 0; i < 5; i++) {
        fos.write(i + 100);
        // isto grava os bytes 100 101 102 103 104
        // o que corresponde aos caracteres "defgh"

      }

      String str = "Inter";
      byte[] palavra = str.getBytes(); //converte string "Inter" num array de bytes

      fos.write(palavra, 0, 5); // grava um array de bytes; inicio no indice 0, total de 5 bytes

      fos.close();
    } catch (IOException e) {
      System.out.println("nao foi possivel salvar no arquivo...");
    }

    System.out.println("arquivo:" + f.getName());
    System.out.println("path:" + f.getAbsolutePath() + "\n"); // mostra o caminho onde o arquivo foi salvo.

  }
  // ...............................................................

  public static void lendoDados() {

    FileInputStream fis = null;
    try {
      fis = new FileInputStream("dados.txt");

      // lendo os dados do arquivo
      // aqui supoe-se que a quantidade de bytes a serem lidos (17) eh conhecida...

      System.out.println("Dados lidos:");

      for (int i = 0; i < 17; i++) {
        System.out.println(fis.read()); 
      }

      // se a quantidade nao for conhecida:
      /*
        byte byteLido;
        while((byteLido = (byte) fis.read()) != -1) {
           System.out.println(byteLido);
        }
       */
      // enquanto o valor do byte lido for diferente de 255 (que eh um byte com valor -1)
      // o tipo byte em Java eh um int com sinal (de -128 a 127)
      // ex: valor valor em byte
      // 128 -128
      // 129 -127
      // 130 -126 e assim por diante ate
      // 255 -1

      fis.close();
    } catch (IOException e) {
      System.out.println("nao foi possivel ler do arquivo...");
    } finally {
      try {
        if (fis != null) {
          fis.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    // APPEND: anexando no final do arquivo
    try {
      File f = new File("dados.txt");
      FileOutputStream fos = new FileOutputStream(f, true); // true informa que eh append...

      // grava os 3 bytes(xyz) no final do arquivo
      fos.write("xyz".getBytes(), 0, "xyz".length());
      fos.close();
    } catch (IOException e) {
      System.out.println("nao foi possivel salvar no arquivo...");
    }
  }
// ...............................................................
public static void lendoDeNovo() {

  //try with resources

    try (FileInputStream fis = new FileInputStream("dados.txt")) {
      
      System.out.println("\nDados lidos novamente:");

      for (int i = 0; i < 17; i++) {
        System.out.println(fis.read());
      }
      fis.close();
    }catch (IOException e) {
			e.printStackTrace();
		}
}

  // ...............................................................
  public static void main(String args[]) {

    gravandoDados();
    lendoDados();
    lendoDeNovo();
  }
}
