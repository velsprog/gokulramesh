package phase1project;

import java.io.File;
import java.util.Arrays;

public class Dirboimplements implements Dirbo 
{
		public void createfiles(String Name)
		{
			File createobj=new File("Rootdir\\"+Name);// same for deletion
			if(!createobj.exists())
			{
				try
				{
				createobj.createNewFile();
				System.out.println("file created successfully");
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			else
			{
				System.out.println("file already existing");
			}
			
		}
		
		
		public void listallfiles()
		{
		File objforlist=new File("Rootdir");
			String[] arr=objforlist.list();
			int size=arr.length;
			//bubble sort
			if(size==0)
			{
				System.out.println("oops! no files inside the directory");
			}
			else
			{
				System.out.println("you will find the all files in acending order");
			}
			for(int i=0;i<size;i++)
			{
				for(int j=i+1;j<size;j++)
				{
					String n1=arr[i];
					String n2=arr[j];
					int value=n1.compareTo(n2);
					if(value>0)
					{
			           String temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			for(String x:arr)
			{
				System.out.println(x);
			}

		}
		
		
		public void search(String name)
		{
			String nametosearch=name;
			File objforsearch=new File("Rootdir");
			String[] arr1=objforsearch.list();
			for(String iterator1:arr1)
			{
				if(iterator1.equals(nametosearch))
				{
					System.out.println("file is found");
					System.out.println(iterator1);
					break;
				}
				else
				{
					System.out.println("file not found");
				}
			}
		}
		public void delete(String name)
		{
			File objfordelete =new File("Rootdir\\"+name);
			if(objfordelete.exists())
			{
				try
				{
				objfordelete.delete();
				System.out.println("file deleted successfully");
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			else
			{
				System.out.println("please a enter a correct file name");
			}
		}

}
