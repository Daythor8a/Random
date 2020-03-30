import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 * Esta clase se usa para crear un archivo con el número de elementos necesarios
 */
public class CrearArchivoCaracteresAleatorios {

    public void crearArchivo() {

        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        int n;
        int cantidad;

        do{
            System.out.println("Introduce número de elementos: ");
            cantidad = sc.nextInt();
        }while(cantidad < 1);

        try (PrintWriter salida = new PrintWriter("/Users/edgar.ochoa/Downloads/Random/src/caracteres.txt")) {

            while (cont < cantidad) {

                n = rnd.nextInt(255); //se obtiene un número

                    //si el número corresponde a una letra o a un espacio se escribe en el fichero
                    if ((Character.toUpperCase((char) n) >= 'A'
                            && Character.toUpperCase((char) n) <= 'Z')
                            || ((char) n == ' ')
                            || ((char) n == 'ñ')
                            || ((char) n == 'Ñ')) {
                        salida.print((char) n + n +",");
                        cont++;
                    }
                }


        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}