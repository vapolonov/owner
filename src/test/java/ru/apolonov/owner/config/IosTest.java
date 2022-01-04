package ru.apolonov.owner.config;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class IosTest {
    @Test
    public void testIos() {
        IOSConfig config = ConfigFactory.create(IOSConfig.class, System.getProperties());
        assertThat(config.platformName()).isEqualTo("IOS");
        assertThat(config.platformVersion()).isEqualTo("11.0");
        assertThat(config.deviceName()).isEqualTo("iPhone 13");

    }
}
