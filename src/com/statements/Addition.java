package com.statements;

import java.util.*;
import java.util.Map;
import java.util.Map.Entry;

public class Addition {
	public static void main(String[] args) {
		String S= "Vishal is a software tester";
		String[] split = S.split(" "); 
		
		String reverse ="";
		for(int i=0;i<split.length;i++) {
			String output="";
			for(int j=split[i].length()-1;j>=0;j--) {
				char ch=split[i].charAt(j);
				
				output=output+ch;
			}
			reverse=reverse+output+" ";
		}
		System.out.println(reverse);
	}

}
