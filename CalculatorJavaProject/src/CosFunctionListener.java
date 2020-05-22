public class CosFunctionListener extends Listener {

	public CosFunctionListener(IView view) {
		// begin-user-code
		super(view);
		// end-user-code
	}

	@Override
	public Parameters getParameters(IView view) {
		// begin-user-code
		Parameters parameters = new Parameters();
		double a = Lib.convertTextToNumber(view.getTextA());
		parameters.put("a", Double.class, a);
		return parameters;
		// end-user-code
	}

	@Override
	public IMathAlgorithm getAlgorithm(Parameters parameters) {
		// begin-user-code
		return new CosFunction(parameters);
		// end-user-code
	}
}