import java.util.ArrayList;
import java.util.Collections;

public class LlenarVector {
    public void cargarVector(){
        int [] numeros = new int[10000];

        //Recorre para llenar la lista con números aleatorios
        for (int i = 0; i < 10000; i++) {
            numeros[i] = (int)(Math.random()*100+1);
            System.out.print(i + " ");
        }


    }
}
