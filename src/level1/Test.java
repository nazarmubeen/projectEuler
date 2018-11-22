package level1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Test {

	public static void main(String[] args) throws IOException
	{
		Object x="true";
		String m=" ";
		Boolean b=false;
		boolean b1=false;
		
		//b=(Boolean)x;
		b1=Boolean.parseBoolean((String) x);
		System.out.println("b= "+b +" b1 "+b1);
		
		File file=new File("D:\\Softwares\\eclipse-jee-neon-3-win32\\eclipse");
		try {
			FileOutputStream fstream=new FileOutputStream(file);
		
		 ZipOutputStream xmlDataSecDBOutput = null;
		 xmlDataSecDBOutput=new ZipOutputStream(fstream);
		 xmlDataSecDBOutput.putNextEntry(new ZipEntry("test.csv"));
		 xmlDataSecDBOutput.write(("sagdj,sahdkas,jsagdkj").getBytes());
		 xmlDataSecDBOutput.closeEntry();
		 xmlDataSecDBOutput.close();
		 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 Set<String> users=new HashSet<>();
		 
		 users.add("dsfsf");
		 users.add("dfgfdgsfsf");
		 users.add("ddfgfdgsfsf");
		 users.add("dsdfgdfgfsf");
		 
		 
		 for(String user:users)
		 {
			 System.out.println(user);
		 }
		 
		 String n="askhfdlksa";
		 
		 System.out.println(n!=m);
		 int c=1;
		 String currentRoleCode=" ";
		 String normal="test";
		 while(c<10)
		 {
			 if(c%2==0)
			normal=normal+c; 
         if (normal != currentRoleCode) {
             currentRoleCode = normal;
             System.out.println(currentRoleCode);
         }
         c++;
         }
		 
		 boolean a =true;
		 boolean t=true;
		 
		 if(a || t)
		 {
			 System.out.println("sajdgkas");
		 }
		 
		 }
	
}
