import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main (String [] args){

        System.out.println("ArrayList");
        LlenarArrayList arrayList = new LlenarArrayList();
        arrayList.cargarArrayList();
        /**
         * Time:2s 431ms
         */


        //System.out.println("Vector");
        //LlenarVector vector = new LlenarVector();
        //vector.cargarVector();
        /**
         * Time:2s 203ms
         */


        // System.out.println("LinkedList");
         //LlenarLinkedList linkedList = new LlenarLinkedList();
         //linkedList.cargarLinkedList();
         /**
         *Time: 2s 352 ms
        */

    }
}
