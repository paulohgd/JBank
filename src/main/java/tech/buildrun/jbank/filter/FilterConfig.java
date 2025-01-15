package tech.buildrun.jbank.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    private final IpFilter ipFilter;

    public FilterConfig(IpFilter ipFilter) {
        this.ipFilter = ipFilter;
    }

    @Bean
    public FilterRegistrationBean<IpFilter> filterFilterRegistrationBeanRegistrationBean(){
        var registrationBean = new FilterRegistrationBean<IpFilter>();

        registrationBean.setFilter(ipFilter);
        registrationBean.setOrder(0);

        return registrationBean;
    }
}
