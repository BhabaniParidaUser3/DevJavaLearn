package objectClassesInterfacesInheritancePackage_1;
public class BicycleDemo {

	public static void main(String[] args) {
 Bicycle bk1=new Bicycle();
 Bicycle bk2=new Bicycle();
 
 bk1.changeCadence(50);
 bk1.changeGear(3);
 bk1.printStates();
 
 bk2.changeCadence(60);
 bk2.changeGear(4);
 bk2.speedUp(20);
 bk2.printStates();
 
 bk2.changeCadence(40);
 bk2.changeGear(2);
 bk2.applyBreaks(10);;
 bk2.printStates();
 

 
 
	}

}
