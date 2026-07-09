import java.io.*;

public class FileHandler {
    public static void main(String[] args) {
 /* Refactor
        readFile("src/example.txt");
    }

    public static void readFile(String fileName){
        BufferedReader br = null;

        try{
            br = new BufferedReader(new FileReader(fileName));
            String line = null;
            while((line = br.readLine()) != null){
                System.out.println(line);
                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo");
        } finally {
            try {
                if (br != null) {
                    br.close();
                    System.out.println("Archivo cerrado exitosamente");
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo");
            }
        }
*/

        try {
            readFile("src/example.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Fin del programa");
    }

    public static void readFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = null;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
    }
}