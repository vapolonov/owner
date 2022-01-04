package ru.apolonov.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import ru.apolonov.owner.config.AndroidConfig;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AndroidTest {

    @Test
    public void testAndroid() {
        AndroidConfig config = ConfigFactory.create(AndroidConfig.class, System.getProperties());
        assertThat(config.platformName()).isEqualTo("Android");
        assertThat(config.platformVersion()).isEqualTo("12.0");
        assertThat(config.deviceName()).isEqualTo("Google Pixel XL");
    }
}
