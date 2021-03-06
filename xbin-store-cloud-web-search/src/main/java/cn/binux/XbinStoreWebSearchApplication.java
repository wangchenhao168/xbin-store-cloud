package cn.binux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
@Configuration
//@EnableApolloConfig
public class XbinStoreWebSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(XbinStoreWebSearchApplication.class, args);
	}
}
