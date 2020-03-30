
import java.util.ArrayList;
import java.util.Collections;

public class LlenarArrayList {

    public void cargarArrayList(){
        ArrayList<Integer> numeros = new ArrayList<>();

        //Recorre para llenar la lista con números aleatorios
        for (int i = 0; i < 10000; i++) {
            numeros.add((int)(Math.random()*100+1));
            System.out.print(numeros.get(i)+ " ");
        }
/*
        // Esta línea es la que organiza el ArrayList
        Collections.sort(numeros);
        System.out.println();
        System.out.println(" *** Imprimiendo Datos *** ");
        for (Integer integer : numeros)
            System.out.print(integer + " ");
*/

    }
}
