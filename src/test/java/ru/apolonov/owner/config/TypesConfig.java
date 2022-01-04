package ru.apolonov.owner.config;

import org.aeonbits.owner.Config;

public interface TypesConfig extends Config {

    @Key("integer")
    Integer getInteger();

    @Key("double")
    Double getDouble();

    @Key("boolean")
    Boolean getBoolean();

    @Key("enum")
    Browser getEnum();
}
