package ajk.bilberry.sample;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class ConnectionIT {
    @Test
    public void verifyConnection() throws IOException {
        URL url = new URL("http://localhost:9200");

        System.out.println(IOUtils.toString((InputStream) url.getContent()));
    }
}
