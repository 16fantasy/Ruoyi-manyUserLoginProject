package com.ruoyi.framework.web.service;

import com.ruoyi.common.core.domain.entity.Myuser;
import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.system.mapper.MyuserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;


@Service("myUserDetailsService")
public class MyUserDetailsServiceImpl implements CustomUserDetailsService {

    private static final Logger log = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

    @Autowired
    private MyuserMapper  myuserMapper;

    private static final String  loginType = "app";

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Myuser myuser = myuserMapper.selectMyUserByUsername(username);
        if (Objects.isNull(myuser)){
           log.info("登录用户：{} 不存在.", username);
           throw new ServiceException("登录用户：" + username + " 不存在");
       }
       return myuser;
    }

    @Override
    public boolean support(String type) {
        return loginType.equals(type);
    }
}
