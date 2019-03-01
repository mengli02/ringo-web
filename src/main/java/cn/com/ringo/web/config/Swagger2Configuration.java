package cn.com.ringo.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * 
 * @author dream.li
 *
 */
@Configuration
@EnableSwagger2
public class Swagger2Configuration {
	
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
					.apiInfo(apiInfo())
					.select()
					.apis(RequestHandlerSelectors.basePackage("cn.com.ringo.web.controller"))
					.paths(PathSelectors.any())
					.build();
	}

	private ApiInfo apiInfo() {
		Contact contact = new Contact("dream.li","www.ringo.com.cn","meng_li02@gzgi.com");
		return new ApiInfoBuilder().title("Spring Boot中使用Swagger2构建RESTful APIs")
					.description("更多Spring Boot相关文章请关注：http://blog.didispace.com/")
					.termsOfServiceUrl("http://blog.didispace.com/")
					.contact(contact)
					.version("1.0")
					.build();
	}
	
}
