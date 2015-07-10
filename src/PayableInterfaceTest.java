
public class PayableInterfaceTest {

	public static void main( String[] args ) {
		Payable[] payableObjects = new Payable[ 4 ];

		payableObjects[ 0 ] = new Invoice( "vida", "duz", 15000, 0.04 );
		payableObjects[ 1 ] = new Invoice( "tornavida", "duz", 10, 10 );
		payableObjects[ 2 ] = new SalariedEmployee( "Mete", "Kucuktas", "95024054", 15 );
		payableObjects[ 3 ] = new SalariedEmployee( "Levent", "Divilioglu", "131134134", 135 );

		System.out.println( "Invoices and Employees processed polymorphically:\n" );

		for ( Payable currentPayable : payableObjects ) {
			System.out.printf( "%s \n%s: $%,.2f\n\n", currentPayable.toString(), "payment due",
					currentPayable.getPaymentAmount() );

		}

	}

}
