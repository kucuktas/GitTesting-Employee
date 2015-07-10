
public class EmployeeTesting {

	public static void main( String[] args ) {

		SalariedEmployee salaried = new SalariedEmployee( "Salaried", "Employee", "000000000", 500 );
		HourlyEmployee hourly = new HourlyEmployee( "Hourly", "Employee", "111111111", 50, 41 );
		CommissionEmployee commission = new CommissionEmployee( "Commission", "Employee", "222222222", 1000, 0.1 );
		BasePlusCommissionEmployee bpCommission = new BasePlusCommissionEmployee( "BasePlus", "Employee", "333333333",
				1000, 0.9, 100 );
	}

}
