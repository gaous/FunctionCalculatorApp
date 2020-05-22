import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Expression3Test {		
	@Mock
	private Logarithm logarithmMock;
	
	@Mock
	private CosFunction cosFunctionMock;

	@Test
	public final void testOutputForValidInput() {
		// given a = 23
		when(logarithmMock.getStatus()).thenReturn(0);
		when(logarithmMock.getResult()).thenReturn(3.14);
		when(cosFunctionMock.getStatus()).thenReturn(0);
		when(cosFunctionMock.getResult()).thenReturn(0.92050);	
		Expression3 expression3 = new Expression3(logarithmMock, cosFunctionMock);
		// when
		expression3.run();
		// then
		assertThat(expression3.getStatus(), equalTo(0));
		assertThat(expression3.getResult(), closeTo(4.06, 0.01));
	}

	@Test
	public final void testOutputForInvalidInput() {
		// given a = 23
		when(logarithmMock.getStatus()).thenReturn(0);
		when(logarithmMock.getResult()).thenReturn(0.0);
		when(cosFunctionMock.getStatus()).thenReturn(0);
		when(cosFunctionMock.getResult()).thenReturn(2.5);	
		Expression3 expression3 = new Expression3(logarithmMock, cosFunctionMock);		
		// when
		expression3.run();
		// then
		assertThat(expression3.getStatus(), equalTo(3));
		assertThat(expression3.getErrorMessage(),
				equalTo("log(a) = 0 results in division by 0"));
	}
}
