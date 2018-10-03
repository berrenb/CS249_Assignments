/*
 Created by Bryan Berrent
 
 The Loadable interface contains a load method
 which will throw an exception if errors occur
 */

import java.util.Scanner;

public interface Loadable {
	abstract void load(Scanner input)throws Exception;
}
