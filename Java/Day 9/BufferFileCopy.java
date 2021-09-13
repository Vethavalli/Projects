package com.src;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class BufferFileCopy {

	public static void main(String[] args) throws IOException {
		byte[] b = new byte[100];
		FileInputStream fis = new FileInputStream(args[0]);
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream(args[1]);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int c;
		while((c = bis.read(b)) != -1)
		{
			bos.write(b);
		}
		System.out.println("Data written to file...");
		bis.close();
		bos.close();
	}

}


