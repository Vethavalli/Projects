package com.src;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileCopyIOClasses {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(args[0]);
		FileOutputStream fos = new FileOutputStream(args[1]);
		int c;
		while((c = fis.read()) != -1)
		{
			fos.write((char)c);
		}
		System.out.println("Data written to file...");
		fis.close();
		fos.close();
	}

}

