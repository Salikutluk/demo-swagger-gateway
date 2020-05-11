package com.example.demo.swagger;

import io.dekorate.kubernetes.annotation.ImagePullPolicy;
import io.dekorate.kubernetes.annotation.KubernetesApplication;
import io.dekorate.kubernetes.annotation.ServiceType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
@EnableSwagger2
@KubernetesApplication(
        name = "demo-swagger-gateway",
        imagePullPolicy = ImagePullPolicy.IfNotPresent,
        serviceType = ServiceType.ClusterIP
)
public class DemoSwaggerGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSwaggerGatewayApplication.class, args);
    }

}
