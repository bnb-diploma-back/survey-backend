package kz.survey.library.jooq;

import org.jooq.conf.RenderQuotedNames;
import org.jooq.impl.DefaultConfiguration;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.jooq.autoconfigure.DefaultConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@AutoConfiguration
@ComponentScan
public class JooqDefaultConfiguration {

    @Bean
    public DefaultConfigurationCustomizer configurationCustomizer() {
        return (DefaultConfiguration c) -> c.settings()
                .withRenderFormatted(true)
                .withRenderQuotedNames(
                        RenderQuotedNames.EXPLICIT_DEFAULT_UNQUOTED
                );
    }
}
