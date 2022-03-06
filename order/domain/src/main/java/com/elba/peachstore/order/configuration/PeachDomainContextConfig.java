package com.elba.peachstore.order.configuration;

import com.elba.peachstore.order.domain.Domains;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {})
@ComponentScan(basePackageClasses = {Domains.class})
public class PeachDomainContextConfig {
}
