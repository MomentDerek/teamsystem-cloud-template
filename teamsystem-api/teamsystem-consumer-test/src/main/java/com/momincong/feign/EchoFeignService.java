package com.momincong.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@Component
@FeignClient(name = "provider-test")
public interface EchoFeignService extends EchoApi{
}
