package com.seungmoo.springboot.springbootjsp;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

// 독립적인 JAR 파일이 아닌, 외부 톰캣에 WAR파일로 배포를 할때는 SpringBootServletInitializer 사용
// WebApplicationInitializer를 상속 받는다.
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringbootJspApplication.class);
    }

}
