package hello.core;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import static org.springframework.context.annotation.ComponentScan.*;

// @Configuration 이 붙은 AppConfig, TestConfig도 자동으로 스캔되어 버리기 때문에 excludeFilters 옵션으로 해당 애노테이션은 제외 시킨다.
@Configuration
@ComponentScan(excludeFilters = @Filter(type = FilterType.ANNOTATION, classes = Configuration.class))
public class AutoAppConfig {

}
