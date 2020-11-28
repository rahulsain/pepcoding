import java.io.*;
import java.util.*;

public class Main {

	public static String toggleCase(String s){
		StringBuilder sb = new StringBuilder(s);
		
		for(int i = 0; i< sb.length(); i++){
		    char ch = sb.charAt(i);
		    if(ch >= 'a'){
		        char up = (char)('A' + ch - 'a'); 
		        sb.setCharAt(i,up);
		    }
		    else{
		        char lo = (char)('a' + ch - 'A');
		        sb.setCharAt(i,lo);
		    }
		    
		}

		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}