package com.elba.peachstore.order.configuration;

import com.elba.peachstore.order.application.Apps;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {
        PeachDomainContextConfig.class
})
@ComponentScan(basePackageClasses = {Apps.class})
public class PeachApplicationContextConfig {
}
