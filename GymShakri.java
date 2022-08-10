class GymShakri
{
	
	public static void main(String[] about)
	{
		String[] elements={"Kettle Ball","Stability Ball","Weight","Tread Mill","Step Mill"};
		Trainer trainer=new Trainer("Karna",2,Gender.MALE);
		trainer.setContactNo(9874561230L);
		Gym gym=new Gym("Boozi",1500D,elements,trainer);
		gym.printData();
		
		
		
	}
	
}