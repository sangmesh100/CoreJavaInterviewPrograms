package com.sam.collection.arrayList.needComparator;

import java.util.*;
public class Details  {

	public static void main(String args[]){
	   ArrayList<Student> arraylist = new ArrayList<Student>();
	   arraylist.add(new Student(101, "sam", 26));
	   arraylist.add(new Student(505, "kailas", 24));
	   arraylist.add(new Student(809, "ram", 32));

	   /*Sorting based on Student Name*/
	   System.out.println("Student Name Sorting:");
	   Collections.sort(arraylist, Student.StuNameComparator);

	   for(Student str: arraylist){
			System.out.println(str);
	   }

	   /* Sorting on Rollno property*/
	   System.out.println("RollNum Sorting:");
	   Collections.sort(arraylist, Student.StuRollno);
	   for(Student str: arraylist){
			System.out.println(str);
	   }
	   
	   /* Sorting on Age property*/
	   System.out.println("Age Sorting:");
	   Collections.sort(arraylist, Student.StuAge);
	   for(Student str: arraylist){
			System.out.println(str);
	   }
	}
}