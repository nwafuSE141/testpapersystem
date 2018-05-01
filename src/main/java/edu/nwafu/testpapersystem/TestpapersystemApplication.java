package edu.nwafu.testpapersystem;

import edu.nwafu.testpapersystem.Filter.LoginFilter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("edu.nwafu.testpapersystem.domain.mapper")
public class TestpapersystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestpapersystemApplication.class, args);
	}

    @Bean
    public FilterRegistrationBean registration(){
        FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new LoginFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }
}
