package ru.apolonov.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import ru.apolonov.owner.config.Browser;
import ru.apolonov.owner.config.TypesConfig;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TypeConfig {

    @Test
    public void testInteger() {
        System.setProperty("integer", "10");

        TypesConfig config = ConfigFactory.create(TypesConfig.class, System.getProperties());
        assertThat(config.getInteger()).isEqualTo(10);
    }

    @Test
    public void testDouble() {
        System.setProperty("double", "10.1234");

        TypesConfig config = ConfigFactory.create(TypesConfig.class, System.getProperties());
        assertThat(config.getDouble()).isEqualTo(10.1234);
    }

    @Test
    public void testBoolean() {
        System.setProperty("boolean", "true");

        TypesConfig config = ConfigFactory.create(TypesConfig.class, System.getProperties());
        assertThat(config.getBoolean()).isEqualTo(true);
    }

    @Test
    public void testEnum() {
        System.setProperty("enum", "CHROME");

        TypesConfig config = ConfigFactory.create(TypesConfig.class, System.getProperties());
        assertThat(config.getEnum()).isEqualTo(Browser.CHROME);
    }
}
