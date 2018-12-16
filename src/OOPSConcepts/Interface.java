package OOPSConcepts;
interface Vechicle
  {
	 void drivingmode();
	 void parkingmode();
	 void reversing();
  }
	
class Car implements Vechicle
{
   
	public void drivingmode() {
		System.out.println(" Car is in driving mode");
	}
	public void reversing() {
		System.out.println(" Car is in Reverse Mode");
		
	}
	public void parkingmode() {
		System.out.println(" Car is in Parking Mode");
		
	}
	class bike implements Vechicle
	{

		@Override
		public void drivingmode() {
			// TODO Auto-generated method stub
			System.out.println(" Bike is in Driving Mode");
		}

		@Override
		public void parkingmode() {
			// TODO Auto-generated method stub
			System.out.println(" Bike is in Parking Mode");
		}

		@Override
		public void reversing() {
			// TODO Auto-generated method stub
			
		}
     }
}