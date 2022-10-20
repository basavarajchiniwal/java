package com.xworkz.database.main;

import com.xworkz.database.dto.HospitalDTO;
import com.xworkz.database.service.HospitalService;
import com.xworkz.database.service.HospitalServiceImpl;

public class HospitalMain {

	public static void main(String[] args) {
	
		HospitalDTO hospitalDTO=new HospitalDTO(1,"G Madegowda","G Madegowda Super Speciality","Normal",2019);
		System.out.println(hospitalDTO);
		HospitalDTO hospitalDTO1=new HospitalDTO(2,"C N Manjunath","Jaydev","Heart",1976);
		System.out.println(hospitalDTO1);
		HospitalDTO hospitalDTO2=new HospitalDTO(3,"Dr K Ravindranath","BGS","Tertiary care",1999);
		System.out.println(hospitalDTO2);
		HospitalDTO hospitalDTO3=new HospitalDTO(4,"Dr.T M A Pai","Manipal","Normal",1991);
		System.out.println(hospitalDTO3);
		HospitalDTO hospitalDTO4=new HospitalDTO(5,"S V Babu","Re-Life","Normal",1999);
		System.out.println(hospitalDTO4);
		HospitalDTO hospitalDTO5=new HospitalDTO(6,"Shivarathri Rajendra Mahaswamigalu","JSS","Normal",1963);
		System.out.println(hospitalDTO5);
		HospitalDTO hospitalDTO6=new HospitalDTO(7,"Prathap C Reddy","Apollo","Pedriatic",1983);
		System.out.println(hospitalDTO6);
		HospitalDTO hospitalDTO7=new HospitalDTO(8,"G Madegowda","NIMHANS Hospital","Normal",2019);
		System.out.println(hospitalDTO7);
		HospitalDTO hospitalDTO8=new HospitalDTO(9,"G Madegowda","Vydehi","Normal",2019);
		System.out.println(hospitalDTO8);
		HospitalDTO hospitalDTO9=new HospitalDTO(10,"G Madegowda","Victoria","Normal",2019);
		System.out.println(hospitalDTO9);
		HospitalDTO hospitalDTO10=new HospitalDTO(11,"G Madegowda","Sakra World Hospital","Normal",2019);
		System.out.println(hospitalDTO10);
		HospitalDTO hospitalDTO11=new HospitalDTO(12,"G Madegowda","Rainbow Hospital","Child Care",2019);
		System.out.println(hospitalDTO11);
		HospitalDTO hospitalDTO12=new HospitalDTO(13,"Dr.Devi Shetty","Narayan MultiSpeciality","Heart",2000);
		System.out.println(hospitalDTO12);
		HospitalDTO hospitalDTO13=new HospitalDTO(14,"Krishna Rajendra Wodeyar","KR Hospital","Tertiary Referal centre",1972);
		System.out.println(hospitalDTO13);
		HospitalDTO hospitalDTO14=new HospitalDTO(15,"G Madegowda","Trinetra","EyeCare",2019);
		System.out.println(hospitalDTO14);
		HospitalDTO hospitalDTO15=new HospitalDTO(16,"Sanjay Deshpande","Sanjo Hospital","Orthopedic",2000);
		System.out.println(hospitalDTO15);
		HospitalDTO hospitalDTO16=new HospitalDTO(17,"St.Jhon","St.john's Medical Hospital","Normal",1998);
		System.out.println(hospitalDTO16);
		HospitalDTO hospitalDTO17=new HospitalDTO(18,"Dr.Maridev","Mallya Hospital","Normal",1997);
		System.out.println(hospitalDTO17);
		HospitalDTO hospitalDTO18=new HospitalDTO(19,"St. Martha","St.Marthos Hospital","Normal",2018);
		System.out.println(hospitalDTO18);
		HospitalDTO hospitalDTO19=new HospitalDTO(20,"D S Negi","Rajiv Gandhi Super Speciality","Cancer",2007);
		System.out.println(hospitalDTO19);
		
		HospitalService service=new HospitalServiceImpl();
		service.validateAndSave(hospitalDTO);
		service.validateAndSave(hospitalDTO1);
		service.validateAndSave(hospitalDTO2);
		service.validateAndSave(hospitalDTO3);
		service.validateAndSave(hospitalDTO4);
		service.validateAndSave(hospitalDTO5);
		service.validateAndSave(hospitalDTO6);
		service.validateAndSave(hospitalDTO7);
		service.validateAndSave(hospitalDTO8);
		service.validateAndSave(hospitalDTO9);
		service.validateAndSave(hospitalDTO10);
		service.validateAndSave(hospitalDTO11);
		service.validateAndSave(hospitalDTO12);
		service.validateAndSave(hospitalDTO13);
		service.validateAndSave(hospitalDTO14);
		service.validateAndSave(hospitalDTO15);
		service.validateAndSave(hospitalDTO16);
		service.validateAndSave(hospitalDTO17);
		service.validateAndSave(hospitalDTO18);
		service.validateAndSave(hospitalDTO19);

	}

}
