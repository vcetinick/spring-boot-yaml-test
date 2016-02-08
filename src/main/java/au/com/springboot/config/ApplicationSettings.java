package au.com.springboot.config;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by sensei on 2/8/16.
 */
@ConfigurationProperties(prefix = "app")
public class ApplicationSettings {
    private String path;
    private String alternativePath;


    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getAlternativePath() {
        return alternativePath;
    }

    public void setAlternativePath(String alternativePath) {
        this.alternativePath = alternativePath;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("path", path)
                .append("alternativePath", alternativePath)
                .toString();
    }
}
