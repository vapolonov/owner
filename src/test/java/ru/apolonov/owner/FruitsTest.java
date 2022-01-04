package ru.apolonov.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import ru.apolonov.owner.config.FruitsConfig;

import static org.assertj.core.api.Assertions.assertThat;


public class FruitsTest {
    @Test
    public void testList() {
        System.setProperty("list", "orange, apple, banana");

        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
        assertThat(config.getFruitsList()).contains("orange", "apple", "banana");
    }

    @Test
    public void testArray() {
        System.setProperty("array", "banana, orange, apple");

        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
        assertThat(config.getFruitsArray()).contains("banana", "orange", "apple");
    }

    @Test
    public void testArrayWithDefault() {
        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
        assertThat(config.getFruitsListWithDefault()).contains("orange", "apple");
    }

    @Test
    public void testArrayWithSeparator() {
        System.setProperty("list-with-separator", "banana; orange; apple");
        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
        assertThat(config.getFruitsListWithSeparator()).contains("banana", "orange", "apple");
    }
}
