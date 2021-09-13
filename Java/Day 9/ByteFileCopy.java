package com.src;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class ByteFileCopy {

	public static void main(String[] args) throws IOException {
		byte[] b = new byte[100];
		FileInputStream fis = new FileInputStream(args[0]);
		ByteArrayInputStream bis = new ByteArrayInputStream(b);
		FileOutputStream fos = new FileOutputStream(args[1]);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		int c;
		while((c = bis.read()) != -1)
		{
			bos.writeTo(fos);
		}
		System.out.println("Data written to file...");
		bis.close();
		bos.close();
	}

}


