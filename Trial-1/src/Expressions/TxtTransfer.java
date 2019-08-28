package Expressions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TxtTransfer {
	public static void main(String[] args) throws IOException {
		File f1=new File("C:\\Users\\asus\\Desktop\\Read.txt");
		File f2=new File("C:\\Users\\asus\\Desktop\\Write.txt");
		FileReader fr=new FileReader(f1);
		FileWriter fw=new FileWriter(f2);
		BufferedReader br=new BufferedReader(fr);
		BufferedWriter bw=new BufferedWriter(fw);
		String temp;
		while((temp =br.readLine()) != null) {
			bw.write(temp);
			bw.newLine();
		}
		bw.close();
		br.close();
	}
}
