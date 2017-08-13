package reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadData {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\PeopleNTech\\Documents\\July2017Selenium\\file1.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(filePath);
			br = new BufferedReader(fr);
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
			System.out.println("Check the file path");
		}
		String st = "";
		try {
			while((st = br.readLine())!=null) {
				System.out.println(st);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try{
			if(br !=null) {
				br.close();
			}
			if(fr != null) {
				fr.close();
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	}
}
