package com.xworkz.object.sub;

public class Fish {
	
	private String breed;
	private String type;
	
	 public Fish()
	{
		System.out.println("Fish default Constructor");
	}
	 public Fish(String breed,String type)
		{
				this.breed=breed;
				this.type=type;
		}
	@Override
	public String toString() {
		return super.toString();
	}
	public String getBreed()
	{
		return this.breed;
	}
	public String getType()
	{
		return this.type;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			System.out.println("Object is not null");
			if(obj instanceof Fish)
			{
				System.out.println("I is Fish");
				
				Fish convert=(Fish)obj;     //type casting
				String conBreed=convert.breed;
				String conType=convert.type;
				if(this.breed.equals(conBreed) && this.type.equals(conType))
						{
					System.out.println("Fish is equal");
					return true;
						}
				else {
					System.out.println("Fish is not equal");
					
				}
			}
			else {
				System.out.println("Obeject is null");
			}
		}
		return super.equals(obj);
	}
	 
	
	 
	
	
	

}
