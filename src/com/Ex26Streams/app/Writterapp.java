package com.Ex26Streams.app;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Writterapp {

	private static final int LIMIT = 0;
	public static void main(String[] args) 
	{
		
		File myFile=null;
		FileWriter myWriter=null;
		BufferedWriter myBuffer=null;
		Scanner input=new Scanner(System.in);
		int table=0;
		try
		{
			myFile=new File("c:\\a\\b.txt");
			myWriter=new FileWriter(myFile);
			myBuffer= new BufferedWriter(myWriter);
		 System.out.println("input multiplication");
		 table=input.nextInt();
		 for(int i=0;i<=LIMIT;i++)
		 {
			 System.out.println(String.format("%d X %d =%d",table, i, table*i));
			 myBuffer.write(String.format("%d X %d=%d \n", table, i, table*i));
			 }
		 
			
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				myBuffer.close();
				myWriter=null;
				myFile=null;
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}

	}

}
