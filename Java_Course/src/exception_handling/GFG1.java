// java program to illustrate checked exceptions where filenotfoundexception occurred
package exception_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GFG1 {
	public static void main(String[] args) throws IOException {
// Reading file from path in local directory
FileReader file = new FileReader("F:\\test\\a.txt");

// Creating object as one of ways of taking input
BufferedReader fileInput = new BufferedReader(file);

//Printing first 3 lines of file "F:\\test\\a.txt"
for(int counter = 0; counter<3; counter++) {
	System.out.println(fileInput.readLine());
//closing file connection
//
}
}
}
