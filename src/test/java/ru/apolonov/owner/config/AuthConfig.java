package ru.apolonov.owner.config;

import org.aeonbits.owner.Config;


// @Config.LoadPolicy(Config.LoadType.FIRST) // прочитается только первый файл Config.Sources
// @Config.LoadPolicy(Config.LoadType.MERGE) // прочитаются все файлы, но данные из последнего затрут предыдущие из Config.Sources
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
