package entities;

import java.io.*;

public class GestioFichero {


    public static void writeFloristeria(Floristeria floristeria) {

        ObjectOutputStream oos;

        {
            try {
                oos = new ObjectOutputStream(new FileOutputStream("persistencia.txt"));
                oos.writeObject(floristeria);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static Floristeria readFloristeria() {

        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("persistencia.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            Floristeria floristeria = (Floristeria) ois.readObject();
            return floristeria;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
