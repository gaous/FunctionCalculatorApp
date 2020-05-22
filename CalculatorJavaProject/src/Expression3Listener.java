/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Gaous
 */
public class Expression3Listener extends Listener {

	public Expression3Listener(IView view) {
		// begin-user-code
		super(view);
		// end-user-code
	}

	@Override
	public Parameters getParameters(IView view) {
		// begin-user-code
		double a = Lib.convertTextToNumber(view.getTextA());
		double b = Lib.convertTextToNumber(view.getTextA());
		Parameters parameters = new Parameters();
		parameters.put("a", Double.class, a);
		parameters.put("b", Double.class, b);
		return parameters;

		// end-user-code
	}

	public IMathAlgorithm getAlgorithm(Parameters parameters) {
		// begin-user-code
		return new Expression3(parameters);
		// end-user-code
	}
}