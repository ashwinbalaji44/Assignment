package oops;


	public class InheritanceEx {
		public static void main(String[] args) {
			TVS tvs = new TVS();
			tvs.display();
			Honda h = new Honda();
			h.display();
			Yamaha y = new Yamaha();
			y.display();
			
			Unicorn_old uo = new Unicorn_old();
			Unicorn_new un = new Unicorn_new();
		    uo.display();
		    un.display();
		}
		}

		class Bikerelease
		{
			int speed = 80;
			
		}
		
		class TVS extends Bikerelease
		{	int speed = 70;
			void display()
			{
				System.out.println("Avg Speed of TVS: "+speed);
			}
		}
		class Honda extends Bikerelease
		{
			void display()
			{
				System.out.println("Avg Speed of Honda: "+speed);
			}
		}
		class Yamaha extends Bikerelease
		{
			int speed = 100;
			void display()
			{
				System.out.println("Avg Speed of Yamaha: "+speed);
			}
		}
		class Unicorn_old extends Honda
		{
		 void display()
		 {
			 System.out.println("Speed of old Unicorn: "+(speed-20));
		 }
		}
		class Unicorn_new extends Unicorn_old
		{
			 void display()
			 {
				 System.out.println("Speed of new Unicorn: "+(speed+20));
			 }
		}

