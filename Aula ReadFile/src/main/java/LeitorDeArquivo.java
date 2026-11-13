import java.io.*;

public class LeitorDeArquivo {

    public void readFile() {
        String caminho = "C:\\Faculdade Tarefas\\POO\\ArquivoDeTex";
        File file = new File(caminho);
        FileReader reader = null;
        try {
            reader =  new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("O arquivo não existe sua mula");
        }
        BufferedReader bufferedReader = new BufferedReader(reader);
        String linha = "";

        while(true) {
            try {
                if (!((linha = bufferedReader.readLine()) != null)) break;
            }catch (IOException e){
                throw new ChamadaException(e);
            }
            System.out.println(linha);
        }
    }
}
