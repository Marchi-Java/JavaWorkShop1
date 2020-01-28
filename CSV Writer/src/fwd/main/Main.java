package fwd.main;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

import fwd.customer.*;
import fwd.utils.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\DELL\\CSV\\test.csv";
		
		// Delete File
		File file = new File(path);
		file.delete();
		
		FileWriter writer = new FileWriter(path);
		writer.append("Name,Sur Name, Age\r\n");
		writer.append("N0,S0,20\r\n");
		writer.append("N1,S1,21");
		writer.flush();
		writer.close();
		//User naiKor = new User("A", "B", 10);
		//User[] customers = new User[10];
		//customers[0] = naiKor;
		
		User[] customers = {
				new User("N0", "L0", 20, 100),
				new User("N1", "L1", 21, 200),
				new User("N2", "L2", 22, 200),
				new User("N3", "L3", 23, 200),
				new User("N4", "L4", 24, 200),
				new User("N5", "L5", 25, 200),
				new User("N6", "L6", 26, 200),
				new User("N7", "L7", 27, 200),
				new User("N8", "L8", 28, 200),
				new User("N9", "L9", 29, 200)
		};
		
		SmartCsv csv = new SmartCsv(path, "windows");
		csv.write(customers);
		
		//for(int i = 0; i < customers.length; i++)
		//System.out.println(customers[i].toString());
		
		//User.log(customers); 
	}
}
