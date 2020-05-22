import java.awt.event.ActionListener;

public class ViewMock implements IView {
	private String textA;
	private String textB;
	private String textC;
	private ActionListener multiplyListener;
	private ActionListener divideListener;
	private ActionListener logarithmListener;
	private ActionListener expressionListener;
	private ActionListener expression2Listener;
	private ActionListener expression3Listener;
	private ActionListener cosFunctionListener;

	@Override
	public String getTextA() {
		return textA;
	}

	@Override
	public String getTextB() {
		return textB;
	}

	@Override	
	public void setTextC(String text) {
		this.textC = text;
	}

	@Override	
	public void addMultiplyListener(ActionListener listener) {
		this.multiplyListener = listener;
	}

	@Override	
	public void addDivideListener(ActionListener listener) {
		this.divideListener = listener;
	}

	@Override	
	public void addLogarithmListener(ActionListener listener) {
		this.logarithmListener = listener;
	}

	@Override	
	public void addExpressionListener(ActionListener listener) {
		this.expressionListener = listener;
	}

	@Override	
	public void addExpression2Listener(ActionListener listener) {
		this.expression2Listener = listener;
	}
	
	@Override	
	public void addExpression3Listener(ActionListener listener) {
		this.expression3Listener = listener;
	}
	@Override	
	public void addCosFunctionListener(ActionListener listener) {
		this.cosFunctionListener = listener;
	}
		
	public void setTextA(String text) {
		this.textA = text;
	}

	public void setTextB(String text) {
		this.textB = text;
	}
		
	public String getTextC() {
		return textC;
	}
		
	public void clickMultiply() {
		if (multiplyListener == null)
			throw new RuntimeException("Unregistered multiply listener");
		multiplyListener.actionPerformed(null);
	}	
	
	public void clickDivide() {
		if (divideListener == null)
			throw new RuntimeException("Unregistered divide listener");
		divideListener.actionPerformed(null);
	}
	
	public void clickCalculateLogarirthm() {
		if (logarithmListener == null)
			throw new RuntimeException("Unregistered logarithm listener");
		logarithmListener.actionPerformed(null);
	}
	
	public void clickCalculateExpression() {
		if (expressionListener == null)
			throw new RuntimeException("Unregistered expression listener");
		expressionListener.actionPerformed(null);
	}
	
	public void clickCalculateExpression2() {
		if (expression2Listener == null)
			throw new RuntimeException("Unregistered expression2 listener");
		expression2Listener.actionPerformed(null);
	}
	public void clickCalculateExpression3() {
		if (expression3Listener == null)
			throw new RuntimeException("Unregistered expression3 listener");
		expression3Listener.actionPerformed(null);
	}
	public void clickCalculateCosFunction() {
		if (cosFunctionListener == null)
			throw new RuntimeException("Unregistered cosFunction listener");
		cosFunctionListener.actionPerformed(null);
	}
}
