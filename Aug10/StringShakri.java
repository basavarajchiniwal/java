class StringShakri
{
	public static void main(String[] hai)
	{
		String string=new String();
		System.out.println(string);
		
		//String string=new String(byte[] bytes);			
		byte[] byt={1,2,3,4,8,9,6};
		for(int byts=0;byts<byt.length;byts++)
		{
			System.out.println(byt[byts]);
		}
		String string1=new String(byt);
		System.out.println(string1);
		
		//String string=new String(char[] value);
		char[] sizes={'M','S','L'};
		String string6=new String(sizes);
		System.out.println(string6);
		
		/*String string=new String(char[] value,int offset,int count);
		char[] vals={'A','E','I','O','U'};
		String string7=new String(vals,8,11);
		System.out.println(string7);*/
		
		/*String string=new String(int[] codePoints,int offset,int count);
		int[] codePoints={10,12,13,14,15};
		String string8=new String(codePoints,9,4);
		System.out.println(string8);*/
		
		//String string=new String(String original);
		String string9=new String("Constructor");
		System.out.println(string9);
		
		//String string=new String(StringBuffer buffer);
		StringBuffer buffer=new StringBuffer("Java");
		String string10=new String(buffer);
		System.out.println(string10);
		
		//String string=new String(StringBuilder builder);
		StringBuilder builder=new StringBuilder("Java 1");
		String string11=new String("Java 1");
		System.out.println(string11);
		
		
		
	}
	
	
}