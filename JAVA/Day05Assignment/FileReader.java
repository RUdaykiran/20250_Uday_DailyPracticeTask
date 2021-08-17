package com.sonata.filereader;

import java.io.FileInputStream;

public class FileReader {

	public synchronized static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream("C:/test.txt");
		}catch(Exception e) {
			System.out.println("File not Found");
		}
		finally {
			System.out.println("Executed the program");
		}

	}

}

