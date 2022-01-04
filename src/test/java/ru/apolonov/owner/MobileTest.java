package ru.apolonov.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import ru.apolonov.owner.config.AndroidConfig;
import ru.apolonov.owner.config.IOSConfig;
import ru.apolonov.owner.config.MobileConfig;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MobileTest {

    @Test
    public void testAndroid() {
        System.setProperty("device", "pixel");
        MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());
        assertThat(config.platformName()).isEqualTo("Android");
        assertThat(config.platformVersion()).isEqualTo("12.0");
        assertThat(config.deviceName()).isEqualTo("Google Pixel XL");
    }

    @Test
    public void testIos() {
        System.setProperty("device", "iphone");
        MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());
        assertThat(config.platformName()).isEqualTo("IOS");
        assertThat(config.platformVersion()).isEqualTo("11.0");
        assertThat(config.deviceName()).isEqualTo("iPhone 13");

    }
}
