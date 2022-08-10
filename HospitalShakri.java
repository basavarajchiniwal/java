class HospitalShakri
{
	public static void main(String[] args)
	{
		String[] equips={"Strechers","Beds","Bedside Screen","Obstetric Tables"};
		Hospital hospital=new Hospital("Jayadev",Specialization.CARDIACANAESTHESIA,equips,2000D);
		Founder founder=new Founder("C N Manjunath","Cholenahalli",Profession.DIRECTOR,1957,true,50000000D);
		hospital.setFounder(founder);
		hospital.printData();
		
	}

}