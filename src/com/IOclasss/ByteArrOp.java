package com.IOclasss;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrOp {

	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream f= new ByteArrayOutputStream();
		String str = "this byte array output strea example";
		byte buff[]=str.getBytes();
		f.write(buff);
		System.out.println(f.toString());
		byte b [] = f.toByteArray();
		for(int i=0;i<b.length;i++) {
			System.out.println((char)b[i]);
		}
		f.reset();
		for(int i=0;i<3;i++) {
			f.write('X');
			System.out.println(f.toString());
		}
	}

}
