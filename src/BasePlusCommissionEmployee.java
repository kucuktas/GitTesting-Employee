
public class BasePlusCommissionEmployee extends CommissionEmployee {

	private double baseSalary;

	public BasePlusCommissionEmployee( String first, String last, String ssn, double sales, double rate,
			double salary ) {
		super( first, last, ssn, sales, rate );
		setBaseSalary( salary );
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary( double salary ) {
		if ( salary >= 0.0 )
			baseSalary = salary;
		else
			throw new IllegalArgumentException( "can't have negative salary" );
	}

	@Override
	public double earnings() {
		return super.earnings() + getBaseSalary();
	}

	@Override
	public String toString() {
		return String.format( "%s %s; %s: $%,.2f", "base-salaried", super.toString(), "base salary", getBaseSalary() );
	}
}
