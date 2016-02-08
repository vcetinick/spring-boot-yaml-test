package au.com.springboot.config;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by sensei on 2/4/16.
 */
@ConfigurationProperties(locations = "config.yml", prefix = "config")
public class ConfigSettings {

    private String path;

    private String alternativePath;

    public String getAlternativePath() {
        return alternativePath;
    }

    public void setAlternativePath(String alternativePath) {
        this.alternativePath = alternativePath;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("path", path)
                .append("alternativePath", alternativePath)
                .toString();
    }
}
