package com.elba.peachstore.order.infrastructure.configuration;

import com.elba.peachstore.order.infrastructure.infrastructure.Infrastructure;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {})
@ComponentScan(basePackageClasses = {Infrastructure.class})
public class PeachInfrastructureContextConfig {
}
