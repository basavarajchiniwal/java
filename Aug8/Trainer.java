class Trainer
{
	String name;
	long contactNo;
	int experience;
	Gender gender;
	
	Trainer(String name,int experience,Gender gender)
	{
		this.name=name;
		this.experience=experience;
		this.gender=gender;		
	}
	void setContactNo(long contactNo)
	{
		this.contactNo=contactNo;
		
	}
	void printData()
	{
		System.out.println(this.name);
		System.out.println(this.contactNo);
		System.out.println(this.experience);
		System.out.println(this.gender);
	}
	
	
	
	
}