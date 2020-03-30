import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LlenarLinkedList {
    public void cargarLinkedList(){
        List<Integer> numeros = new LinkedList<>();

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
