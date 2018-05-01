package edu.nwafu.testpapersystem;

import com.github.pagehelper.PageHelper;
import edu.nwafu.testpapersystem.Filter.LoginFilter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.Properties;

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

    @Bean
    public PageHelper pageHelper(){
        System.out.println("==============================开始配置数据分页插件");
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("offsetAsPageNum","true");
        properties.setProperty("rowBoundsWithCount","true");
        properties.setProperty("reasonable","true");
        properties.setProperty("dialect","mysql");    //配置mysql数据库的方言
        pageHelper.setProperties(properties);
        return pageHelper;
    }
}
