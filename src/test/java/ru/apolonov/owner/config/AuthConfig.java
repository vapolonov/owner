package ru.apolonov.owner.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:C:\\temp\\auth.properties",
        "classpath:auth.properties"
})

public interface AuthConfig extends Config {

    @Key("username")
    String username();

    @Key("password")
    String password();
}
