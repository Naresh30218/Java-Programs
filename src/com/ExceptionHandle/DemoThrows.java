package com.ExceptionHandle;
import java.io.*;
public class DemoThrows {
	public static void find() throws IOException{
		throw new IOException("File NOt found");
	}
	public static void main(String[] args) {
		try {
			find();
			System.out.println("rest of coden in try block");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
