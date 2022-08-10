class StaticMethod
{
	public static void main(String[] args)
	{
		//String valueOf(boolean b)
		String value=String.valueOf(true);
		System.out.println(value);
	
		//valueOf(char c)
		String value1=String.valueOf('M');
		System.out.println(value1);
		
		//valueOf(double d)
		String value3=String.valueOf(500);
		System.out.println(value3);
		
		//valueOf(float f)
		String value5=String.valueOf(300.1);
		System.out.println(value5);
		
		//valueOf(int i)
		String value7=String.valueOf(5);
		System.out.println(value7);
		
		//valueOf(long l)
		String value9=String.valueOf(9874563210L);
		System.out.println(value9);
		
	}
}