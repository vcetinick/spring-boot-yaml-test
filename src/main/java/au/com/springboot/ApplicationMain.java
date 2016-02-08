package au.com.springboot;

import au.com.springboot.config.ApplicationSettings;
import au.com.springboot.config.ConfigSettings;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PostConstruct;

/**
 * Created by sensei on 2/8/16.
 */
@SpringBootApplication(
        exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class, ErrorMvcAutoConfiguration.class})
@ComponentScan({"au.com.springboot"})
@EnableConfigurationProperties({
        ApplicationSettings.class,
        ConfigSettings.class
})
@Slf4j
public class ApplicationMain {

    @Autowired
    private ConfigSettings configSettings;

    @Autowired
    private ApplicationSettings applicationSettings;

    @PostConstruct
    public void init() {
        log.info("Config Settings - {}", configSettings);
        log.info("Application Settings - {}", applicationSettings);

    }


    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationMain.class, args);
    }
}
