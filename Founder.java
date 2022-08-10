class Founder
{
	String name;
	String from;
	Profession profession;
	int since;
	boolean alive;
	double income;
	
	Founder(String name,String from,Profession profession,int since,boolean alive,double income)
	{
		this.name=name;
		this.from=from;
		this.profession=profession;
		this.since=since;
		this.alive=alive;
		this.income=income;
		
	}
	void printData()
	{
		System.out.println(this.name);
		System.out.println(this.from);
		System.out.println(this.profession);
		System.out.println(this.since);
		System.out.println(this.alive);
		System.out.println(this.income);
		
	}


}