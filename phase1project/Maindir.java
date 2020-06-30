package phase1project;

import java.util.*;
import java.io.*;
public class Maindir {
	public static String input1="";

	public static void main(String[] args) {
	
		Dirbo ofordirbo=new Dirboimplements();
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome");
		System.out.println("you can play with dirtectory by entering the commands");
		File file=new File("Rootdir");
		//mkdir return boolean values.
		if(!file.exists())
		{
			if(file.mkdir())
			{
				System.out.println("Root directory is created");
			}
			else
			{
				System.out.println("failed to create root directory");
			}
		}
		else
		{
			System.out.println("root directory is already created");
		}
		
		System.out.println();
		System.out.println();
		int input=0;
		do
		{
		System.out.println("press 1 to return the files in ascending order");
		System.out.println("press 2 to work on files");
		System.out.println("press 3 to exit the application");
		input =sc.nextInt();
		
		switch(input)
		{
		case 1:
			ofordirbo.listallfiles();
			break;
		case 2:
			do
			{
			
			System.out.println("press 2.1 to add a file to the existing directory");
			System.out.println("press 2.2 to delete a file from existing directory");
			System.out.println("press 2.3 to search a file from main directory");
			System.out.println("press 2.4 to navigate back to main context");
			input1 =sc.next();
				switch(input1)
				{
				case "2.1":
					System.out.println("enter the file name to create");
					String filename=sc.next();
					ofordirbo.createfiles(filename);
					break;
				case "2.2":
					System.out.println("enter a file name to delete");
					String fname=sc.next();
					ofordirbo.delete(fname);
					break;
				case "2.3":
					System.out.println("enter the file name to search");
					String nametosearch=sc.next();
					ofordirbo.search(nametosearch);
					break;
				case "2.4":
					break;
					
				
				}
			}while(!(input1.equals("2.4")));
		case 3:
			break;
	
		}
		}
		while(input!=3);
		System.out.println("project end");

	}

}


