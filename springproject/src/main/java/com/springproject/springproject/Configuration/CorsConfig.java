package com.springproject.springproject.Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer

    /*Needed for the configuration of the web and all the ENDPOINTS
    * It is important to have a CORS for the origins of the request
    * take into account that having a secure and reliable backend
    * requires a strong CORS configuration*/

{


}
