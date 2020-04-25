package main;

import java.io.*;

public class Object_in_out {
	
	public String readFile(String filename) {
		  String str="";
		  String pathname = "F:\\IdeaProjects\\BASIC_code\\course_selection_system\\"+filename+".txt";
		  try (FileReader reader = new FileReader(pathname);
		       BufferedReader br = new BufferedReader(reader) 
		  ) {
		      String line;
		      while ((line = br.readLine()) != null) { //判断每一行是否为空
		      	str=str+line;//读出每一行
		      }
		  } catch (IOException e) {//捕捉异常
		      e.printStackTrace();
		  }
		  return str;
	}
	
	public void writeFile(String filename,String s) {
		String pathname = "F:\\IdeaProjects\\BASIC_code\\course_selection_system\\"+filename+".txt";
		  try {
			  if(filename=="user") {
		      File writeName = new File(pathname); 
		      writeName.createNewFile(); 
		      try (FileWriter writer = new FileWriter(writeName,true);
		           BufferedWriter out = new BufferedWriter(writer)
		      ) {
		      		if(s!=null) {
		      		out.write(s); 
		      	}
		          out.flush(); 
		      }
			  }
			  else {
				  File writeName = new File(pathname); 
			      writeName.createNewFile(); 
			      try (FileWriter writer = new FileWriter(writeName);
			           BufferedWriter out = new BufferedWriter(writer)
			      ) {
			      		if(s!=null) {
			      		out.write(s); 
			      	}
			          out.flush(); 
			      }
			  }
		  } catch (IOException e) {
		      e.printStackTrace();
		  }
	}
	
	public void WriteFile(String[] s,String filename) {
		try {
            File writeName = new File("F:\\IdeaProjects\\BASIC_code\\course_selection_system\\"+filename+".txt");
            writeName.createNewFile(); 
            try (FileWriter writer = new FileWriter(writeName);
                 BufferedWriter out = new BufferedWriter(writer)
            ) {
            	for(int i=0;i<s.length;i++) {
            		if(s[i]!=null) {
            		out.write(s[i]); 
            	}
                out.flush();
            }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
