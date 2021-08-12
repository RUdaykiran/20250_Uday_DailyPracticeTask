package com.sonata;

public class ReadaString {

	public static void main(String[] args) {
		String str = "sonata";//Initializing the String object
		char ch[] = str.toCharArray(); //Convering String to character array
		for (int i = 0; i < ch.length; i++)
        {
               if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
               {
                ch[i]='$';//replaces all the vowels with '$'
               }   
        }
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);//print the value after replacing with '$'
        }
		
		

	}

}
