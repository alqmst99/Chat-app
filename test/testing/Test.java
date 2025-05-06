package testing;

import chat.realtime.Swing.BlurHash.BlurHash;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

/**
 *
 * @author Nahuel Pierini
 * @Enterprise: FSTailSolution
 */
public class Test {

    public static void main(String[] args) {

        try {
            //encoder
            BufferedImage image = ImageIO.read(new File("C:\\Users\\Nahue\\Downloads\\dog.jpg"));
            String blurhashStr = BlurHash.encode(image);
            System.out.println(blurhashStr);
        } catch (Exception e) {
            e.printStackTrace();
        }

        
        
    }

}
