package hello;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HelloControllerTest {

    @Test
    public void indexReturnsString() {
        HelloService mockHelloService = mock(HelloService.class);
        when(mockHelloService.retrieveHelloWorldStatement()).thenReturn("PillarCon 2019 Hype!");
        HelloController helloController = new HelloController(mockHelloService);

        String index = helloController.index();

        assertThat(index, is("PillarCon 2019 Hype!"));
    }
}

