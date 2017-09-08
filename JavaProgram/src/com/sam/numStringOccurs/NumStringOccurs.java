package com.sam.numStringOccurs;
/* ask in Verifone company
write a java program to count number of occurrence of string occurs in a big string
*/
public class NumStringOccurs {
	public static void main(String[] args) {
		String str = "helloslkhellodjladfjhello";
		String findStr = "hello";
		int lastIndex = 0;
		int count = 0;

		while(lastIndex != -1){

		    lastIndex = str.indexOf(findStr,lastIndex);

		    if(lastIndex != -1){
		        count ++;
		        lastIndex += findStr.length();
		    }
		}
		System.out.println("'hello' string occurs " + count + " times");	
	}
}
