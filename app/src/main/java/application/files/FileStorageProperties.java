package application.files;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import lombok.*;

@Configuration
@ConfigurationProperties(prefix = "file")
@Getter
@Setter
public class FileStorageProperties {
    private String uploadDir;
}