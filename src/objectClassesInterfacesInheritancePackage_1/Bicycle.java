package objectClassesInterfacesInheritancePackage_1;

public class Bicycle {
	int cadence=0;
	int speed=0;
	int gear=1;
	
	void changeCadence(int newValue)
	{
		cadence=newValue;
	}

	void changeGear(int newValue)
	{
		gear=newValue;
	}
	
	void speedUp(int increament)
	{
		speed=speed + increament;
	}
	
	void applyBreaks(int decrement)
	{
		speed=speed - decrement;
	}
	
	void printStates()
	{
		System.out.println("cadence:"+" "+cadence+" "+"gear:"+gear+" "+"speed:"+speed);
	}
}
