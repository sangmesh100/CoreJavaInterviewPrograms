package com.sam.collection.arrayList.needComparableAndComparator;
import java.util.*;
public class ArrayListSorting  {

     public static void main(String args[]){
	   ArrayList<Student> arraylist = new ArrayList<Student>();
	   arraylist.add(new Student(223, "Chaitanya", 26));
	   arraylist.add(new Student(245, "Rahul", 24));
	   arraylist.add(new Student(209, "Ajeet", 32));

	   Collections.sort(arraylist);	//

	   for(Student str: arraylist){
			System.out.println(str);
	   }
     }
}

/*
I tried to call the Collections.sort() on the List of Objects and boom! 
I got the the error message like this –
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The method sort(List<T>) in the type Collections is not applicable for the arguments (ArrayList<Student>)

	at com.sam.collection.arrayList.needComparableAndComparator.ArrayListSorting.main(ArrayListSorting.java:11)


Reason: I Just called the sort method on an ArrayList of Objects which actually doesn’t work until unless we use interfaces like Comparable and Comparator.
*/