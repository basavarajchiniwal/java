package com.xworkz.inheritancecast.main;

import com.xworkz.inheritancecast.sub.PlasticPipe;
import com.xworkz.inheritancecast.superclass.Plastic;

public class PipeShakri {

	public static void main(String[] args) {
		
		PlasticPipe plasticPipe=new PlasticPipe(2,200,"White");
		plasticPipe.torisu();
		
		Plastic plastic=new PlasticPipe(3,150,"Green");
		plastic.torisu();
		
		PlasticPipe convert=(PlasticPipe)plastic;
		convert.torisu();
		
		Plastic plastic1=new Plastic("PVC",400,1.8);
		plastic1.torisu();

	}

}
