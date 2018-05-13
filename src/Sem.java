import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

public class Sem extends Image {

    // Constructors:
    public Sem(){

    }

    public Sem(String name) {
        super(name);
    }

    public Sem(BufferedImage img) {
        super(img);
    }

    //--------------------------------

    // Get loaded image name.
    @Override
    String getImgName() {
        if(!super.name.isEmpty()){
            return super.name;
        }
        return null;
    }

    //--------------------------------

    // Loading image from specified location - dir (directory).
    @Override
    void imgLoad(String dir) throws IOException {
        try {
            if (!dir.isEmpty()) {
                super.img = ImageIO.read(super.file = new File(dir));
                super.name = super.file.getName();
                super.width = super.img.getWidth();
                super.height = super.img.getHeight();
                super.type = super.img.getType();
                System.out.println("File loaded from: " + dir);
            }
            else{
                System.out.println("Directory: " + dir + " is empty.");
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    //--------------------------------

    // Saving image with 'tif' extension in dir (directory).
    @Override
    void imgSave(String dir){
        try{
            if(super.img != null){
                ImageIO.write(super.img, "tif", new File(dir));
            }
            else{
                System.out.println("Error during file saving.");
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        System.out.println("File Saved in: "+dir+".");
    }

    //--------------------------------

    // Printing image information.
    @Override
    void imgInfo() {
        System.out.println("File info:");
        System.out.println("File name: " + super.name+",");
        System.out.println("File width: " + super.width+",");
        System.out.println("File height: " + super.height+",");
        System.out.println("File type: " + super.type+".");
    }

    //--------------------------------
}
