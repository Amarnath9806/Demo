package exercise;

public class Format {
	public static void main(String[] args) {
		String s= "24M284-22";
		char[] ch = s.toCharArray();
	for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
			{
				System.out.println(" invalid");
			}
			else {
				int c=0;
					
				for (int j = 0; j < ch.length; j++) {
					if(i!=2&&i!=6&&i+1!=2&&i+1!=6) {
						if(ch[i]+ch[i+1]%2==0)
							c++;
						
					}
					if(c==4)
						System.out.println("valid");
					else
						System.out.println("invalid");
				}
				
			}
					
			
	}
	}
}
	