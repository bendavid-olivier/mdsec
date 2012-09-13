package graphoTools.guiEditor.graphicComponents;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileFilter;
/**
*
* @author obendavi
*/
public class FileChooser {
    private JFileChooser chooser;
    public FileChooser(JFrame parent) {
        chooser = new JFileChooser();
        chooser.addChoosableFileFilter(new FileFilter() {
@Override
public String getDescription() {
return "models xmi files";
}
@Override
public boolean accept(File arg0) {
return arg0.getName().endsWith(".xmi");
}
});
        int returnVal = chooser.showOpenDialog(parent);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("You chose to open this file: "
                    + chooser.getSelectedFile().getName());
        }
    }
/**
* @return the chooser
*/
    public JFileChooser getChooser() {
        return chooser;
    }
/**
* @param chooser the chooser to set
*/
    public void setChooser(JFileChooser chooser) {
        this.chooser = chooser;
    }
}