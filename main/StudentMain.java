package com.mile1.main;
import com.mile1.bean.Student;
import com.mile1.service.*;
public class StudentMain {
	static Student[] data = new Student[4];
	StudentMain()
	{
		for(int i=0 ; i < data.length ; i++) {
			data[i] = new Student();
		}
	
	data[0] = new Student("Sekar" , new int[] {85,75,95});
	data[1] = new Student("uh iuhw iug" , null);
	data[2] = null;
	data[3] = new Student(null , new int[] {22,66,33,11});
	}
	public static void main(String[] args) {
		StudentMain sm = new StudentMain();
		StudentReport sr = new StudentReport();
		Student s = new Student();
		for(int i = 0 ; i < data.length ; i++)
		{
			try
			{
				String valid = sr.Validate(data[i]);
				if(valid.equals("VALID"))
				{
					String grade = sr.findGrades(data[i]);
					System.out.println("Grads" + grade);
				}
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
