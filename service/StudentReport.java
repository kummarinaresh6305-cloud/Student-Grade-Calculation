package com.mile1.service;
import com.mile1.bean.*;
import com.mile1.exception.*;
public class StudentReport {
    public String findGrades(Student StudentObject)
    {
    	int[] marks = StudentObject.getMarks();
    	int sum = 0;
    	for(int i=0 ; i < marks.length ; i++)
    	{
    		sum += (marks[i]);
    	}
    	if(sum < 35)
    	{
    		return "F";
    	}
    	else
    	{
    		if(sum < 150)
    		{
    			return "C";
    		}
    		else if(sum < 200)
    		{
    			return "B";
    		}
    		else if(sum < 250)
    		{
    			return "A";
    		}
    		else
    		{
    			return "A+";
    		}
    	}
    }
    public String Validate(Student data) throws NullNameException,NullMarksArrayException,NullStudentObjectException
    {
    	if( data == null )
    	{
    		throw new NullStudentObjectException();
    	}
    	else if(data.getName() == null)
    	{
    		throw new NullNameException();
    	}
    	else if(data.getMarks() == null)
    	{
    		throw new NullMarksArrayException();
    	}
    	else 
    	{
		    return "VALID";
    	}
    }
    public int findNumberOfNullMarksArray(Student s[])
    {
    	int c = 0;
    	if(s != null)
    	{
    		for(Student ss : s)
    		{
    			if(ss != null && ss.getMarks() == null)
    			{
    				c++;
    			}
    		}
    	}
		return c;
    }
    public int findNumberOfNullNameException(Student s[])
    {
    	int c = 0;
    	if(s != null)
    	{
    		for(Student ss : s)
    		{
    			if(ss != null && ss.getName() == null)
    			{
    				c++;
    			}
    		}
    	}
		return c;
    }
    public int findNumberOfNullStudentObjectException(Student s[])
    {
    	int c = 0;
    	if(s != null)
    	{
    		for(Student ss : s)
    		{
    			if(ss == null)
    			{
    				c++;
    			}
    		}
    	}
		return c;
    	
    }
}
