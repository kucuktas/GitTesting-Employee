
public class EmployeeTesting {

	public static void main( String[] args ) {

		SalariedEmployee salaried = new SalariedEmployee( "Salaried", "Employee", "000000000", 500 );
		HourlyEmployee hourly = new HourlyEmployee( "Hourly", "Employee", "111111111", 50, 41 );
		CommissionEmployee commission = new CommissionEmployee( "Commission", "Employee", "222222222", 1000, 0.1 );
		BasePlusCommissionEmployee bpCommission = new BasePlusCommissionEmployee( "BasePlus", "Employee", "333333333",
				1000, 0.9, 100 );

		Employee[] employees = new Employee[ 4 ];

		employees[ 0 ] = salaried;
		employees[ 1 ] = hourly;
		employees[ 2 ] = commission;
		employees[ 3 ] = bpCommission;

		System.out.println( "Employees processed polymorphically:\n" );
		for ( Employee currentEmployee : employees ) {
			System.out.printf( currentEmployee.toString() );

			if ( currentEmployee instanceof BasePlusCommissionEmployee ) {
				BasePlusCommissionEmployee employee = ( BasePlusCommissionEmployee ) currentEmployee;

				employee.setBaseSalary( employee.getBaseSalary() * 1.1 );
				System.out.printf( "new base salary with 10%% increase is: $%,.2f\n", employee.getBaseSalary() );
			}
			
			System.out.printf("earnings: $%,.2f\n\n", currentEmployee.earnings());
		}

	}

}
