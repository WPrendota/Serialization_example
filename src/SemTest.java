import javax.imageio.ImageIO;
import java.io.*;

// Testing class for
public class SemTest extends Sem implements Serialization{
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Sem sem = new Sem(); //Creation of Sem new object.

        String dir = ""; // Image file direction.

        sem.imgLoad(dir);
        sem.imgSave(dir); // Saving image to file.
        sem.imgInfo(); // Printing image information.
        Serialization.saveObject("SEM.sem",sem); // Saving object to file: 'SEM.sem'.
        Serialization.loadObject("SEM.sem"); //sem.loadObject("SEM.sem"); // Loading object from file: 'SEM.sem'.

        Sem sem1 = new Sem(); //Creation of Sem new object.
        sem1 = (Sem) Serialization.loadObject("SEM.sem");// Loading saved 'sem' object.
        sem1.imgSave(dir); // Saving image to file.
        sem1.imgInfo();
        sem1.imgLoad("SEM.sem.png");
        if(sem1.img == null){
            System.out.println("Empty img");
        }
    }
}
