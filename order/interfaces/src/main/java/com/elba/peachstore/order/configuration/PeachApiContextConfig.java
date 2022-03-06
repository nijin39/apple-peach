package com.elba.peachstore.order.configuration;

import com.elba.peachstore.order.interfaces.api.Apis;
import com.elba.peachstore.order.interfaces.message.Messages;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {PeachApplicationContextConfig.class})
@ComponentScan(basePackageClasses = {Apis.class, Messages.class})
public class PeachApiContextConfig {
}
