package com.xworkz.person.service;

import com.xworkz.person.dto.PersonDTO;
import com.xworkz.person.repository.PersonRepository;
import com.xworkz.person.repository.PersonRepositoryImpl;

public class PersonServiceImpl implements PersonService{
	
	public PersonServiceImpl() {
		System.out.println("Create "+ this.getClass().getSimpleName());
	}
	
	@Override
	public boolean validateAndSave(PersonDTO dto)
	{
		System.out.println("Validation");
		int id=dto.getId();
		String name=dto.getName();
		String email=dto.getEmail();
		Long mobileNumber=dto.getMobileNumber();
		String gender=dto.getGender();
		String qualification=dto.getQualification();
		Boolean married=dto.getMarried();
		Boolean working=dto.getWorking();
		String companyName=dto.getCompanyName();
		double salary=dto.getSalary();
		int age=dto.getAge();
		int experience=dto.getExperience();
		String location=dto.getLocation();
		String city=dto.getCity();
		String state=dto.getState();
		String country=dto.getCountry();
		long aadharNo=dto.getAadharNo();
		String panNo=dto.getPanNo();
		Boolean alive=dto.getAlive();
		long bankAccountNo=dto.getBankAccountNo();
		
			if(id>0 && id<500) {
				System.out.println("id is valid");
				if(name!=null && name.length()>1 && name.length()<80) {
					System.out.println("name is valid");
					if(email!=null && email.length()>1 && email.length()<50) {
						System.out.println("email is valid");
						if(mobileNumber>=0 ) {
							System.out.println("mobile number is valid");
							if(gender!=null ) {
								System.out.println("gender is valid");
								if(qualification!=null && qualification.length()>1 && qualification.length()<50 ) {
									System.out.println("qualification is valid");
									if(married!=null) {
										System.out.println("married is valid");
										if(working!=null) {
											System.out.println("working is valid");
											if(companyName!=null && companyName.length()>1 && companyName.length()<50) {
												System.out.println("company is valid");
												if(salary>10000 && salary<500000 ) {
													System.out.println("salary is valid");
													if(age>18 && age<100) {
														System.out.println("age is valid");
														if(experience>0 && experience<30) {
															System.out.println("experience is valid");
															if(location!=null && location.length()>1 && location.length()<50) {
																System.out.println("location is valid");
																if(city!=null && city.length()>1 && city.length()<50) {
																	System.out.println("city is valid");
																	if(state!=null && state.length()>1 && state.length()<50) {
																		System.out.println("state is valid");
																		if(country!=null && country.length()>1 && country.length()<50) {
																			System.out.println("country is valid");
																			if(aadharNo>=0 ) {
																				System.out.println("aadhar is valid");
																				if(panNo!=null && panNo.length()>1 && panNo.length()<50) {
																					System.out.println("pan no is valid");
																					if(alive!=null) {
																						System.out.println("alive is valid");
																						if(bankAccountNo>=0) {
																					     System.out.println("accountNo is valid");
																					     System.out.println("All data is valid and can save");

																					     PersonRepository repo=new PersonRepositoryImpl();
																					     repo.save(dto);
																						}
																						else {
																	 					    System.out.println("accountNo is not valid");


																						}
																					}
																					else {
																						System.out.println("alive is not valid");
																					}
																				}
																				else {
																					System.out.println("pan no is not valid");
																				}
																			}
																			else {
																				System.out.println("aadhar is not valid");
																			}
																		}
																		else {
																			System.out.println("country is not valid");
																		}
																	}
																	else {
																		System.out.println("state is not valid");
																	}
																}
																else {
																	System.out.println("city is not valid");
																}
															}
															else {
																System.out.println("location is not valid");
															}
														}
														else {
															System.out.println("experience is not valid");
														}
													}
													else {
														System.out.println("age is not valid");
													}
												}
												else {
													System.out.println("salary is not valid");
												}
											}
											else {
												System.out.println("company is not valid");
											}
										}
										else {
											System.out.println("working is not valid");
										}
									}
									else {
										System.out.println("married id not valid");
									}
								}
								else {
									System.out.println("qualification is not valid");
								}
							}
							else {
								System.out.println("gender is not valid");
							}
						}
						else {
							System.out.println("mobile number is not valid");
						}
					}
					else {
						System.out.println("email is not valid");
					}
				}
				else {
					System.out.println("name is not valid");
				}
			}
			else {
				System.out.println("id is not valid");
			}
			return false;
		}
		@Override
		public void displayAll() {
	     System.out.println("running displayAll in service");
	     PersonRepository repo=new PersonRepositoryImpl();
	     repo.displayAll();
		}
		@Override
		public void displayAllAgeGreaterThanOrderByName(int age) {
	    System.out.println("greater than age order by name");
	    PersonRepository repo=new PersonRepositoryImpl();
	    repo.displayAllAgeGreaterThanOrderByName(age);
		}
		@Override
		public void displayAllByGenderDescOrderByName(String gender) {
	      System.out.println("gender desc order by name");
	      PersonRepository repo=new PersonRepositoryImpl();
		  repo.displayAllByGenderDescOrderByName(gender);
	      
		}
		@Override
		public void displayAllBySalaryGreaterThanOrderByDesc(double salary) {
	     System.out.println("salary is greater than order by desc");
	     PersonRepository repo=new PersonRepositoryImpl();
	     repo.displayAllBySalaryGreaterThanOrderByDesc(salary);
	     
		}
		@Override
		public void displayCount() {
		System.out.println("total count");
		PersonRepository repo=new PersonRepositoryImpl();
	    repo.displayCount();
		
		}
		@Override
		public void displaySumOfSalary() {
			System.out.println("sum of salary");
			PersonRepository repo=new PersonRepositoryImpl();
		    repo.displaySumOfSalary();
			

		}
		

}
