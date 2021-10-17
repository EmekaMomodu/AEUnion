package com.EmekaMomodu.AEUnion.configuration;

import com.EmekaMomodu.AEUnion.utility.CustomInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author CMOMODU
 * @version 1.0
 * @date 10/17/21 1:10 PM
 */
@Component
public class InterceptorConfig extends WebMvcConfigurerAdapter {

    @Autowired
    CustomInterceptor customInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(customInterceptor);
    }
}
