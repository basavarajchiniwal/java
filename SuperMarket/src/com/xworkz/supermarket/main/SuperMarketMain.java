package com.xworkz.supermarket.main;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.supermarket.dto.SuperMarketDTO;
import com.xworkz.supermarket.service.SuperMarketService;
import com.xworkz.supermarket.service.SuperMarketServiceImpl;

public class SuperMarketMain {

	public static void main(String[] args) {
		
		SuperMarketDTO marketDTO=new SuperMarketDTO(1,"Costco","Castco Wholesale Corporation","19AACCC7675A1ZO",560002,"Wholesale");
		SuperMarketDTO marketDTO1=new SuperMarketDTO(2,"Kroger","Kroger Corporate Office","29AAQCS4503H1Z2",560103,"Wholesale");
		SuperMarketDTO marketDTO2=new SuperMarketDTO(3,"E Mart","Mart Corporation","39AACCC7675A1ZO",570002,"Grocery");
		SuperMarketDTO marketDTO3=new SuperMarketDTO(4,"Fresh Mart","mart Wholesale Corporation","19ADDDC7675A1Z1",561002,"Wholesale");
		SuperMarketDTO marketDTO4=new SuperMarketDTO(5,"D mart","Dmart Wholesale Corporation","19AACCC6565A1Z2",560102,"Wholesale");
		
		/*System.out.println(marketDTO);
		System.out.println(marketDTO1);
		System.out.println(marketDTO2);
		System.out.println(marketDTO3);
		System.out.println(marketDTO4);*/
		
		/*List<SuperMarketDTO> dto=new ArrayList<SuperMarketDTO>();
		dto.add(0, marketDTO);
		dto.add(1, marketDTO1);
		dto.add(2, marketDTO2);
		dto.add(3, marketDTO3);
		dto.add(4, marketDTO4);*/
		
		SuperMarketService serv=new SuperMarketServiceImpl();
		/*serv.validateAndSave(marketDTO);
		serv.validateAndSave(marketDTO1);
		serv.validateAndSave(marketDTO2);
		serv.validateAndSave(marketDTO3);
		serv.validateAndSave(marketDTO4);*/
		
		//serv.displayByName("Kroger");
		
		System.out.println("=============find by name method =============");
		serv.findByName("D mart");
		
		System.out.println("============find All=======");
		List list=serv.findAll();
		System.out.println(list);
		
		System.out.println("========find by pincode and type===========");
		List list2=serv.findByPincodeAndType("Grocery",570002);
		System.out.println(list2);
		
		System.out.println("==========find by type============");
		List list3=serv.findByType("Wholesale");
		System.out.println(list3);
		
		System.out.println("==========find by id============");
		SuperMarketDTO list4=serv.findById(1);
		System.out.println(list4);
		
		//dto.stream().forEach(e->System.out.println(serv.validateAndSave(e)));
	
		

	}

}
