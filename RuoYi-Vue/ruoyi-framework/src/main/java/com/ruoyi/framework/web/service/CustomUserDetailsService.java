package com.ruoyi.framework.web.service;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface CustomUserDetailsService extends UserDetailsService {

     boolean support(String type);
}
