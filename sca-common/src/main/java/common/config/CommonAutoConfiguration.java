package common.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import common.web.WebConfiguration;

/**
 * @author zhonghuashishan
 * @version 1.0
 */
@Configuration
@Import(value = {WebConfiguration.class,MybatisPlusConfig.class})
public class CommonAutoConfiguration {

}