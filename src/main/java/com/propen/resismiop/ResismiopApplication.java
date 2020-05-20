package com.propen.resismiop;


import org.apache.coyote.http11.AbstractHttp11Protocol;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;

/*
 * Kalo mau masang security lagi, anotasi @SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
 * di bawah diubah ke @SpringBootApplication aja
 */
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
//(exclude = { SecurityAutoConfiguration.class })
public class ResismiopApplication {

    private int maxUploadSizeInMb = 30 * 1024 * 1024; // 10 MB

    public static void main(String[] args) {
        SpringApplication.run(ResismiopApplication.class, args);
    }

    //Tomcat large file   connection reset
    //http://www.mkyong.com/spring/spring-file-upload-and-connection-reset-issue/
    @Bean
    public TomcatServletWebServerFactory tomcatEmbedded() {

        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();

        tomcat.addConnectorCustomizers((TomcatConnectorCustomizer) connector -> {
            if ((connector.getProtocolHandler() instanceof AbstractHttp11Protocol<?>)) {
                //-1 means unlimited
                ((AbstractHttp11Protocol<?>) connector.getProtocolHandler()).setMaxSwallowSize(-1);
            }
        });

        return tomcat;

    }

}
