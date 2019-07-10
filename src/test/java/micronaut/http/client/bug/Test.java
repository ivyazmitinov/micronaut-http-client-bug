package micronaut.http.client.bug;

import io.micronaut.context.ApplicationContext;
import io.micronaut.test.annotation.MicronautTest;

import javax.inject.Inject;

@MicronautTest
public class Test
{

    @Inject
    TestBugClient testBugClient;
    @Inject
    ApplicationContext applicationContext;

    @org.junit.jupiter.api.Test
    void test()
    {
        testBugClient.test();
    }
}
