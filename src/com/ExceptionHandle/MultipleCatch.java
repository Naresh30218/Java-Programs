package com.ExceptionHandle;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class MultipleCatch {

	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream("ns.txt");
			int x=(byte)f.read();
		}catch(IOException i) {
			i.printStackTrace();
			System.out.println(-1);
//		}catch(FileNotFoundException f) {
//			f.printStackTrace();
//			System.out.println(-1);
		}

	}

}
