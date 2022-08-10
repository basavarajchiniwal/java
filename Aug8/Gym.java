class Gym
{
	String name;
	double fees;
	String[] eqipments;
	Trainer trainer;
	
	
	Gym(String name,double fees,String[] eqipments,Trainer trainer)
	{
		this.name=name;
		this.fees=fees;
		this.eqipments=eqipments;
		this.trainer=trainer;		
	}
	
	void printData()
	{
		System.out.println(this.name);
		System.out.println(this.fees);
		
		for(int eqp=0;eqp<this.eqipments.length;eqp++)
		{
			System.out.println(this.eqipments[eqp]);
		}
		
		this.trainer.printData();
	}
	
	
	
	
	
	
}