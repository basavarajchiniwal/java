package com.xworkz.inheritancecast.main;

import com.xworkz.inheritancecast.sub.TouchPadKeyBoard;
import com.xworkz.inheritancecast.superclass.KeyBoard;

public class TouchPadShakri {

	public static void main(String[] args) {
		
	
		TouchPadKeyBoard touchPadKeyBoard=new TouchPadKeyBoard("touch",140,120);
		touchPadKeyBoard.torisu();
		
		KeyBoard keyBoard=new TouchPadKeyBoard("touh1",150,120);
		TouchPadKeyBoard convertFromParent=(TouchPadKeyBoard)keyBoard;
		convertFromParent.torisu();
		
		KeyBoard keyBoard1=new KeyBoard(12.05,12,14);
		keyBoard1.torisu();
		
		
		
		
		
		

	}

}
