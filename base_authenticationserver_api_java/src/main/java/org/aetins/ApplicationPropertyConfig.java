package org.aetins;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * <i>To configure config property files</i>
 * @author avinash
 *
 */
@Configuration
@PropertySources({@PropertySource("classpath:config/config.properties")})
public class ApplicationPropertyConfig {

}
