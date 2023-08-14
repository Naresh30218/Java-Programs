package com.IOclasss;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileIOPStream {

	public static void main(String[] args) throws IOException {
		String source = "Letus learn Java Now.";
		byte buf[]=source.getBytes();
		FileOutputStream f0 = new FileOutputStream("C:\\Users\\FX566LI\\Documents\\MCA\\Java\\PracticalJ\\txtfiles/file1.txt");
		for(int i=0;i<buf.length;i++) {
			f0.write(buf[i]);
		}
		f0.close();
		OutputStream f1 = new FileOutputStream("C:\\Users\\FX566LI\\Documents\\MCA\\Java\\PracticalJ\\txtfiles/file2.txt");
		f1.write(buf);
		OutputStream f2 = new FileOutputStream("C:\\Users\\FX566LI\\Documents\\MCA\\Java\\PracticalJ\\txtfiles/file3.txt");
		f2.write(buf,6,5);
		f2.close();

	}

}
