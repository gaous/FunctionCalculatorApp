/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Gaous
 */
public class CosFunction extends MathAlgorithm implements IMathAlgorithm {

	private final double a;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	public CosFunction(Parameters parameters) {
		// begin-user-code
		a = parameters.get("a", Double.class);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	public void run() {
		// begin-user-code
				if (a <= 0.0) {
					status = 2;
					errorMessage = "Non-positive argument for cos";
				} else {
		status = 0;
		result = Math.toRadians(a);
		result = Math.cos(result);
				}

		// end-user-code
	}
}