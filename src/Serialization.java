import javax.imageio.ImageIO;
import java.io.*;

public interface Serialization {
    // Saving Sem object to file: 'SEM.sem'.
    public static void saveObject(String dir, Sem sem) {
        try{
            FileOutputStream fos = new FileOutputStream(dir);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            ImageIO.write(sem.img, "png", new File(dir+".png"));
            oos.writeObject(sem);
            oos.close();
            System.out.println("Object saved: "+dir+".");
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    //-------------------------------- // Saving object.

    // Loading Sem object from file: 'SEM.sem'.
    public static Object loadObject(String dir) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(dir);
        ObjectInputStream ois = new ObjectInputStream(fis);

        return ois.readObject();
    }
    //-------------------------------- // Loading object.
}
