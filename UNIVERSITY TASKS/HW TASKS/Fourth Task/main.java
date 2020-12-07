import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Main { 
    public static void main(String[] args) throws IOException { 

      BufferedReader reada = new BufferedReader(new FileReader("file.txt"));
      int lines = 0;
      while (reada.readLine() != null) lines++;
      reada.close();


        System.out.println("Hello, user\n"); 

        String hu="";

        File f = new File("file.txt");
        
        FileReader fr = new FileReader(f);
        BufferedReader reader = new BufferedReader(fr);


        BufferedWriter bw = new BufferedWriter(new FileWriter(f,true));

        EncryptDecryptString script = new EncryptDecryptString();

        String line = reader.readLine();


        System.out.println(lines);
        int number=0;

        while (number <= lines) {
            System.out.println(line);
            // считываем остальные строки в цикле
            
            //System.out.println("I AM HERE"+line);
            hu+= "\n" + script.encrypt(line)+ "\n" ;   
            System.out.println(hu);
            number++;
            line = reader.readLine();
        }

        bw.write(hu);
        bw.flush();
        bw.close();
        // bw.write("\nSome text");
        // bw.flush();
        // bw.close();
        
        // bw.write("Some more text");
        // bw.flush();
        // bw.close();
        // br.close();

        // hu=script.encrypt(hu);
        // System.out.println(hu);
        // hu=script.decrypt(hu);
        // System.out.println(hu);
    }
}
