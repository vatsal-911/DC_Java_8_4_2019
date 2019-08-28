package Expressions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileEnter {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\asus\\Desktop\\Writer.txt");
	FileWriter fw=new FileWriter(f);
	BufferedWriter bw=new BufferedWriter(fw);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Text to be written to File");
	String s =sc.next();
	System.out.println(s);
	bw.write(s);
	sc.close();
	bw.close();
	}
	
	
}
