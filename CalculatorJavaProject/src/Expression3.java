/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Gaous
 */
public class Expression3 extends MathAlgorithm implements IMathAlgorithm {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	private final Logarithm logarithm;
	private final CosFunction cosFunction;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	public Expression3(Logarithm logarithm, CosFunction cosFunction) {
		// begin-user-code
		this.logarithm = logarithm;
		this.cosFunction = cosFunction;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	public Expression3(Parameters parameters) {
		// begin-user-code
		this(new Logarithm(parameters), new CosFunction(parameters));
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	public void run() {
		// begin-user-code
		try {
			double left = getResult(logarithm);
			double right = getResult(cosFunction);
						if (left == 0 ) {
							status = 3;
							errorMessage = "log(a) = 0 results in division by 0";
						} else {
			status = 0;
			result = left + right;
						}
		} catch (RuntimeException e) {
			status = 2;
		}

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */

}