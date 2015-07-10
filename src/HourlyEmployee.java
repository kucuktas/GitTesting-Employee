
public class HourlyEmployee extends Employee {

	private double wage;
	private double hours;

	public HourlyEmployee( String first, String last, String ssn, double hourlyWage, double hoursWorked ) {
		super( first, last, ssn );
		setWage(hourlyWage);
		setHours(hoursWorked);
	}

	public double getWage() {
		return wage;
	}

	public void setWage( double hourlyWage ) {
		if ( hourlyWage >= 0.0 )
			wage = hourlyWage;
		else
			throw new IllegalArgumentException( "wage can't be negative" );

	}

	public double getHours() {
		return hours;
	}

	public void setHours( double hoursWorked ) {

		if ( hoursWorked >= 0.0 )
			hours = hoursWorked;
		else
			throw new IllegalArgumentException( "hours worked can't be negative" );
	}

	@Override
	public double earnings() {
		if ( getHours() <= 40 )
			return getHours() * getWage();
		else
			return 40 * getWage() + ( getHours() - 40 ) * getWage() * 1.5;
	}

	@Override
	public String toString() {
		return String.format( "hourly employee: %s\n%s: $.2f, %s:.2f", super.toString(), "hourly wage", getWage(),
				"hours worked", getHours() );
	}
}
