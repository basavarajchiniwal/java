class StringInstance
{
	public static void main(String[] method)
	{
		//String toUpperCase()
		String dist="Mandya";
		dist.toUpperCase();
		String dt=dist.toUpperCase();
		System.out.println(dt);
		
		//String toLowerCase()
		String taluk="Maddur";
		taluk.toLowerCase();
		String tq=taluk.toLowerCase();
		System.out.println(tq);
		
		//String concat(String str)
		String inst=new String();
		String cat=inst.concat("Cream");
		System.out.println(cat);
		
		//int length()
		int len=inst.length();
		System.out.println(len);
		
		//int compareToIgnoreCase(String str)
		int ignore=inst.compareToIgnoreCase("Method");
		System.out.println(ignore);
		
		//boolean contentEquals(StringBuffer sb)
		StringBuffer sb=new StringBuffer("Bujji");
		boolean boo=inst.contentEquals(sb);
		System.out.println(boo);
		
		//boolean endsWith(String suffix)
		boolean bo=inst.endsWith("MS");
		System.out.println(bo);
		
		//int hashCode()
		int hash=inst.hashCode();
		System.out.println(hash);
		
		//indexOf(int ch)
		int index=inst.indexOf(20);
		System.out.println(index);
		
		//indexOf(int ch, int fromIndex)
		int index1=inst.indexOf(25,30);
		System.out.println(index);
		
		//int indexOf(String str)
		int index2=inst.indexOf("PetName");
		System.out.println(index2);

		//int indexOf(String str, int fromIndex)
		int index3=inst.indexOf("str", 60);
		System.out.println(index3);

		// String intern()
		String tern=inst.intern();
		System.out.println(tern);

		//boolean isEmpty()
		boolean empt=inst.isEmpty();
		System.out.println(empt);

		//int lastIndexOf(int ch)
		int last=inst.lastIndexOf(100);
		System.out.println(last);

		//int lastIndexOf(String str)
		int lasts=inst.lastIndexOf("Index");
		System.out.println(lasts);


			
		
	}
}