package com.ahao.boot.dubboproviderboot.conf;

import org.apache.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ahao
 * @since 2019/9/22 下午1:45
 */
@Configuration
public class DubboConfigCustomize {

    @Bean
    public RegistryConfig customizeRegistry() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("ahaoserver1:2181,ahaoserver2:2181,ahaoserver3:2181");
        return registryConfig;
    }
}
