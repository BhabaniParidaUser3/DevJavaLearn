package objectClassesInterfacesInheritancePackage_1;

public class ACEMBicycle implements Bicycles {
	int cadence=0;
	int speed=0;
	int gear=1;
	
	public void changeCadence(int newValue) {
		// TODO Auto-generated method stub
		cadence=newValue;
		
	}
	
	public void changeGear(int newValue) {
		// TODO Auto-generated method stub
		gear=newValue;
		
	}


	public void speedUp(int increment) {
		// TODO Auto-generated method stub
		speed=speed+increment;
		
	}

	public void applyBrakes(int decrement) {
		// TODO Auto-generated method stub
		speed=speed - decrement;
		
	}

	void printStates()
	{
		System.out.println("cadence:"+" "+cadence+" "+"gear:"+gear+" "+"speed:"+speed);
	}
	
	

}
