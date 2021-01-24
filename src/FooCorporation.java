public class FooCorporation {
	
	public static void main(String[] args)
	{
		pay(7.5, 35);
		pay(8.2, 47);
		pay(10, 73);
		pay(10, 40);
		pay(7.999, 60);
	}

	public static void pay(double basePay, int hours)
	{
		//initialize the parameters
		int baseHours = 40;
		int maxHours = 60;
		double minWage = 8;
		double overTimeRate = 1.5;
		double baseSalary = 0.00;
		double overTimeSalary = 0.00;
		double totalSalary = 0.00;
		
		//print error if wage is below minimum wage
		if(basePay < minWage)
			System.out.println("Error: Base wage " + basePay + " is less than the minimum wage of " + minWage);
		
		//print error if hours worked is more than maximum hours allowed
		else if(hours > maxHours)
			System.out.println("Error: Number of hours worked " + hours + " is more than the required hours of " + maxHours);
		
		else
		{
			//check for overtime hours and calculate for overtime pay
			if(hours > baseHours)
				overTimeSalary = (hours - baseHours) * overTimeRate * basePay;
			
			//calculate for base pay 
			baseSalary = hours * basePay;
			
			//total salary
			totalSalary = baseSalary + overTimeSalary;
			
			System.out.println(totalSalary);
			
		}
	}
}
