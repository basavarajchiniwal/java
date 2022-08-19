package com.xworkz.Inheritextend.main;

import com.xworkz.Inheritextend.market.Market;
import com.xworkz.Inheritextend.subcls.OnlineSuperMarket;
import com.xworkz.Inheritextend.supercls.SuperMarket;

public class MarketShakri {

	public static void main(String[] args) {
		
		OnlineSuperMarket osm=new OnlineSuperMarket(true,"Royal",10);
		osm.printData();
		
		SuperMarket superMar=new OnlineSuperMarket(9.00,22.30,1500);
		superMar.print();
		
		OnlineSuperMarket sup=(OnlineSuperMarket)superMar;      //super market type casting
		sup.print();
		
		SuperMarket superMar1=new SuperMarket(10.30,21.15,1525);
		superMar1.print();
		
		Market market=new OnlineSuperMarket("Mejestic",1000,25);
		market.torisu();
		OnlineSuperMarket mart=(OnlineSuperMarket)market;      //market casting(OSM)
		mart.torisu();
		Market market2=new Market();
		market2.torisu();
		
		Market market1=new SuperMarket("Mejestic1",1500,30);
		market1.torisu();
		SuperMarket supMar=(SuperMarket)market1;              //market casting(SM)
		supMar.print();
		Market market3=new Market();
		market3.torisu();				
	}
}
