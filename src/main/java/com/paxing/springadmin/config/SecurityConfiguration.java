package com.paxing.springadmin.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 使用了security 依赖之后，会对所有的url 进行过滤：
 * 判断header 里是否带有系统生成的 token，与系统生成的进行校验，如果校验不通过，返回httpCode 403
 * 如果校验通过之后，继续访问
 * <a>https://blog.csdn.net/sinat_28454173/article/details/52251004 参考</a>
 *
 * @author wtzhang
 */
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 这里去除跨域校验即可
        // 如果不想去掉校验，则需要传递token
//        http.csrf().disable();
        // 可以针对特定的url 不增加校验
        // @see org.springframework.security.config.annotation.web.configurers.CsrfConfigurer.ignoringAntMatchers()
        http.csrf().ignoringAntMatchers("/instances");
    }
}