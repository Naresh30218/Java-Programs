package com.IOclasss;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess {

	public static void main(String[] args)throws IOException{
		RandomAccessFile infile=null;
		RandomAccessFile outfile=null;
		try {
			int buf;
			long index,posn;
			infile= new RandomAccessFile("C:\\Users\\FX566LI\\Documents\\MCA\\Java\\PracticalJ\\txtfiles\\f1.txt","r");
			outfile= new RandomAccessFile("C:\\Users\\FX566LI\\Documents\\MCA\\Java\\PracticalJ\\txtfiles\\f2.txt","rw");
			posn = infile.length()-1;
			for(index=posn;index>=0;index--) {
				infile.seek(index);
				buf=infile.read();
				outfile.write(buf);
			}
			outfile.close();
			infile.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
