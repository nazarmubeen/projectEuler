package level1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Problem22 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = null;
		int totalSum=0;
		ArrayList<String> namesList=new ArrayList<String>();
		File file=new File("D://Java99//ProjectEuler//src//names.txt");
		try {
			String line;
			FileReader ins=new FileReader(file);
			br=new BufferedReader(ins);
			while((line=br.readLine())!=null)
			{
				String[] names=line.split(",");
				for(String name:names)
				{
					namesList.add(name.substring(1, name.length()-1));
				}
				
			}
			
			Collections.sort(namesList);
		
		for(String name:namesList)
		{
	//		System.out.println(name);
			int index=namesList.indexOf(name);
		//	System.out.println(index);
			totalSum=totalSum+sumOfValues(name,index+1);
		}
		
		System.out.println("total sum = "+totalSum);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(br!=null)
			{
				br.close();
			}
		}
		
		
	}
	
	static int sumOfValues(String name,int index)
	{
		
		int sum=0;
		for(char n:name.toCharArray())
		{
			sum=sum+(int)n-64;
		}
		
		return sum*index;

	}
}
