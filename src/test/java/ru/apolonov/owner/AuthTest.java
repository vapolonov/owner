package ru.apolonov.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import ru.apolonov.owner.config.AndroidConfig;
import ru.apolonov.owner.config.AuthConfig;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AuthTest {

    @Test
    public void testLocalFile() {
        AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());
        assertThat(config.username()).isEqualTo("vasvap");
        assertThat(config.password()).isEqualTo("QWE123qwe");
    }

    @Test
    public void testRemoteFile () throws Exception {
        String content = "username=apolvv\npassword=Qwerty123";
        Path props = Paths.get("C:\\temp\\auth.properties");

        Files.write(props, content.getBytes(StandardCharsets.UTF_8));

        AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());
        assertThat(config.username()).isEqualTo("apolvv");
        assertThat(config.password()).isEqualTo("Qwerty123");

        Files.delete(props);
    }
}
