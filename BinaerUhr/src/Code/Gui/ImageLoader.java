package Gui;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class ImageLoader {
    public BufferedImage Image, Explain;
    public void ImageLoaderT(){

            try {
                //Button Image
                Image = ImageIO.read(new File("src/Design/button.png"));
                //Explain Screen Image
                Explain = ImageIO.read(new File("src/Design/explain.png"));

            } catch (IOException e) {

                e.printStackTrace();
            }
        
    }
}

