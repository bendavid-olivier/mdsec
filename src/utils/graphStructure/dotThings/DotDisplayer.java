package utils.graphStructure.dotThings;

import java.io.File;
import java.io.IOException;

import utils.time.Chrono;

public class DotDisplayer {

	public static void displayPdfFile(final File dotFile) {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				String fileName = dotFile.getAbsolutePath().replace(".dot", "");
				Runtime runtime = Runtime.getRuntime();
				try {
					Chrono c = new Chrono();
					c.start();
					runtime.exec(
							new String[] { "dot", "-Tpdf", "-Kdot",
									dotFile.getAbsolutePath(), "-o",
									fileName + ".pdf" }).waitFor();
					c.stop();
					// System.out.println("display time : "+c.displayTime());
				} catch (InterruptedException e) {
					System.out
							.println("InterruptedException : " + e.toString());
				} catch (IOException e) {
					System.out.println("IOException : " + e.toString());
				}
				displayPDF(fileName + ".pdf");
			}
		};
		Thread t = new Thread(r);
		t.start();
	}

	public static void createPngFile(final File dotFile) {
		String fileName = dotFile.getAbsolutePath().replace(".dot", "");
		Runtime runtime = Runtime.getRuntime();
		try {
			Chrono c = new Chrono();
			c.start();
			runtime.exec(
					new String[] { "dot", "-Tpng", "-Kdot",
							dotFile.getAbsolutePath(), "-o", fileName + ".png" })
					.waitFor();
			c.stop();
			// System.out.println("display time : "+c.displayTime());
		} catch (InterruptedException e) {
			System.out.println("InterruptedException : " + e.toString());
		} catch (IOException e) {
			System.out.println("IOException : " + e.toString());
		}
	}
	
	public static void createPdfFile(final File dotFile) {
		String fileName = dotFile.getAbsolutePath().replace(".dot", "");
		Runtime runtime = Runtime.getRuntime();
		try {
			Chrono c = new Chrono();
			c.start();
			runtime.exec(
					new String[] { "dot", "-Tpdf", "-Kdot",
							dotFile.getAbsolutePath(), "-o", fileName + ".pdf" })
					.waitFor();
			c.stop();
			// System.out.println("display time : "+c.displayTime());
		} catch (InterruptedException e) {
			System.out.println("InterruptedException : " + e.toString());
		} catch (IOException e) {
			System.out.println("IOException : " + e.toString());
		}
	}

	public static void displayPDF(String s) {
		Runtime runtime = Runtime.getRuntime();
		try {
			runtime.exec(new String[] { "evince", s }).waitFor();
		} catch (InterruptedException e) {
			System.out.println("InterruptedException : " + e.toString());
		} catch (IOException e) {
			System.out.println("IOException : " + e.toString());
		}
	}
}
