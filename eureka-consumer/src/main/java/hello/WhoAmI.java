package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
class WhoAmI {
    @Value("${spring.application.name}")
    public String springApplicationName;

    @Value("${server.port:8080}")
    public String serverPort;
}