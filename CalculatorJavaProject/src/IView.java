/**
 * 
 */
import java.awt.event.ActionListener;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Gaous
 */
public interface IView {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	String getTextA();

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	String getTextB();

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	void setTextC(String text);

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	void addMultiplyListener(ActionListener listener);

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	void addDivideListener(ActionListener listener);

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	void addLogarithmListener(ActionListener listener);

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	void addExpressionListener(ActionListener listener);

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	void addExpression2Listener(ActionListener listener);

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	void addCosFunctionListener(ActionListener listener);

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	void addExpression3Listener(ActionListener listener);
}