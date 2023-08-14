package com.IOclasss;

import java.io.ByteArrayInputStream;

public class ByteArrayIPStream {

	public static void main(String[] args) {
		String s = "helllo this is byte array input stream";
		byte[] b = s.getBytes();
		ByteArrayInputStream ip1 = new ByteArrayInputStream(b);
		int c=0;
		do {
			c=(byte)ip1.read();
			System.out.println((char)c);
		}while (c!=-1);
	}

}
