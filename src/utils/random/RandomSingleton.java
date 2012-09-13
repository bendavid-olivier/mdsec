/*$Id: $
* Project : org.kermeta.language.mdk
* File : 	Random.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 8 d�c. 2008
* Authors : cfaucher
*/

package utils.random;

import java.util.Random;


public class RandomSingleton {
	
	public static int random(int range) {
		Random r = new Random();
		return r.nextInt(range);
	}
	public static double random() {
		Random r = new Random();
		return r.nextDouble();
	}


}


