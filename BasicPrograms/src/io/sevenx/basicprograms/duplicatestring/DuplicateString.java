package io.sevenx.basicprograms.duplicatestring;

public class DuplicateString {
	public static void main(String[] args) {
		String str="Toshi is and when toshi is happy he wants to eat happy haapy cookies to celebrate ";
		int count=0;
		str=str.toLowerCase();
		String s[]=str.split(" ");
		System.out.println("Duplicate words in the string:"+str);
		for(int i=0;i<s.length;i++) {
			count=1;
			for(int j=i+1;j<s.length;j++) {
				if(s[i].equals(s[j])) {
					count++;
					s[j]="0";
				}
			}
			if(count>1 && s[i]!="0") {
				System.out.print(s[i]+" ");
				
			}
		}
	}

}
