import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;

abstract class Image implements Serializable{
    String name;
    int width;
    int height;
    int type;
    File file;
    transient BufferedImage img;
    ImageIcon ii;

    // Constructors:
    public Image(){

    }

    public Image(String name) {
        this.name = name;
    }

    public Image(BufferedImage img) {
        this.img = img;
    }

    //--------------------------------

    abstract String getImgName(); // Get loaded image name.
    abstract void imgLoad(String dir) throws IOException; // Loading image from specified location - dir (directory).
    abstract void imgSave(String dir) throws IOException; // Saving image with .jpeg extension.
    abstract void imgInfo(); // Printing image information.
}
