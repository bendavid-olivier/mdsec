package graphoTools.guiEditor.graphicComponents;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
public class ImageComponent extends JComponent {
	private BufferedImage bufferedImage;
   public void paint(Graphics g) {
        g.drawImage(getBufferedImage(), 0, 0, null);
   }
   public static BufferedImage scale(BufferedImage source, int width, int height) {
        BufferedImage buf = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = buf.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.drawImage(source, 0, 0, width, height, null);
        g.dispose();
        return buf;
    }
    public ImageComponent() {
        setBackground(Color.white);
        try {
            bufferedImage = ImageIO.read(new File("Graph.png"));
        } catch (IOException e) {
        }
    }
    public ImageComponent(File f) {
        try {
            bufferedImage = ImageIO.read(f);
        } catch (IOException e) {
        }
    }
    public ImageComponent(BufferedImage bi) {
        bufferedImage = bi;
    }
    public Dimension getPreferredSize() {
        if (getBufferedImage() == null) {
            return new Dimension(100, 100);
        } else {
            return new Dimension(getBufferedImage().getWidth(null), getBufferedImage().getHeight(null));
        }
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Load Image Sample");
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setSize(400, 400);
        JScrollPane jsp = new JScrollPane(new ImageComponent(new File("/home/obendavi/Bureau/coding/workspaceKEVOREE/kevoree-experiment/org.kevoree.experiment.kevoreeAndIncQuery/graphs/ola.png")));
        f.add(jsp);
        f.setVisible(true);
    }
    public BufferedImage getBufferedImage() {
        return bufferedImage;
    }
    public void setBufferedImage(BufferedImage img) {
        this.bufferedImage = img;
     }
}