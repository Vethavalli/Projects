package com.src;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileCopy {

	public static void main(String[] args) throws IOException {
		File f = new File(args[0]);
		File f1 = new File(args[1]);
		FileReader fr = new FileReader(f);
		FileWriter fw = new FileWriter(f1);
		int c;
		while((c = fr.read()) != -1)
		{
			fw.write((char)c);
		}
		System.out.println("Data written to file...");
		fr.close();
		fw.close();
	}

}
