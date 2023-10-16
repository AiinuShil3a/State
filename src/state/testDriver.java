package state;

public class testDriver {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		//you inserted a quarter (HAS_QUARTER);
		//You turned... (SOLD)
		//A gumballMachine comes rolling out the slot (count = 4 , NO_QUARTER)
		
		System.out.println(gumballMachine);
		
		//ยังไม่ได้เรียกใช้ตัว ejectQuarter และ dispense
	}

}
