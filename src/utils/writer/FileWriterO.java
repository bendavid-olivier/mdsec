/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package utils.writer;

/**
 *
 * @author obendavi
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterO {
	private FileWriter fw;
	public File writeStringOnFile(java.lang.String s, java.lang.String path) {
		File f =new File(path);
		try {
			fw= new FileWriter(f,false);
			fw.write(s, 0, s.length());
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return f;
	}

	public static void main(String[] args) {
		FileWriterO fw = new FileWriterO();
		fw.writeStringOnFile("test", "/home/obendavi/Bureau/test.txt");

	}

}
