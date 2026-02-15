package kz.survey;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

  @Bean
  public OpenAPI surveyOpenAPI() {
    return new OpenAPI()
        .info(new Info()
            .title("Survey API")
            .description("Survey submission and results API")
            .version("1.0"));
  }
}
