import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Expression3IntegrationTest {		
		
	@Test
	public final void testOutputForValidInput() {
		// given
		Parameters parameters = new Parameters();
		parameters.put("a", Double.class, 23.0);
		parameters.put("b", Double.class, 45.0);		
		Expression3 expression3 = new Expression3(parameters);
		// when
		expression3.run();
		// then
		assertThat(expression3.getStatus(), equalTo(0));
		assertThat(expression3.getResult(), closeTo(4.06, 0.01));
	}
	
	@Test
	public final void testOutputForInvalidInput() {
		// given
		Parameters parameters = new Parameters();
		parameters.put("a", Double.class, 1.0);
		parameters.put("b", Double.class, 45.0);		
		Expression3 expression3 = new Expression3(parameters);
		// when
		expression3.run();
		// then
		assertThat(expression3.getStatus(), equalTo(3));
		assertThat(expression3.getErrorMessage(),
				equalTo("log(a) = 0 results in division by 0"));	
	}	
}
