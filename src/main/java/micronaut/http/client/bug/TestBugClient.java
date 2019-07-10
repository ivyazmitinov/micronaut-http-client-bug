package micronaut.http.client.bug;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@Client("test-bug-service")
public interface TestBugClient
{
    @Get("/test")
    Object test();
}
