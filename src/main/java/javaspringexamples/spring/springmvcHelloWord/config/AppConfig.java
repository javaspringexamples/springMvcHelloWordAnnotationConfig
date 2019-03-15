package javaspringexamples.spring.springmvcHelloWord.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
@Configuration
@ComponentScan(basePackages = { "javaspringexamples.spring.springmvcHelloWord" })
public class AppConfig {

	@Bean
	public InternalResourceViewResolver getInternalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
}
