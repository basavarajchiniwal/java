class Hospital
{
	String name;
	Specialization specialization;
	String[] equipments;
	double consultationFees;
	Founder founder;
	
	Hospital(String name,Specialization specialization,String[] equipments,double consultationFees)
	{
		this.name=name;
		this.specialization=specialization;
		this.equipments=equipments;
		this.consultationFees=consultationFees;
		
	}
	void setFounder(Founder founder)
	{
		this.founder=founder;
	}
	void printData()
	{
		System.out.println(this.name);
		System.out.println(this.specialization);
		for(int eqp=0;eqp<this.equipments.length;eqp++)
		{
			System.out.println(this.equipments[eqp]);
		}
		System.out.println(this.consultationFees);
		this.founder.printData();
		
	}



}