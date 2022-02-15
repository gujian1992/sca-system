package product.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author: lyk
 * @date: 2022/2/11 22:28
 * @description:
 */
@Component
@FeignClient(name="order")
public interface FeignService {
    @GetMapping(value = "order/getOrderInfo")
    public String getOrderInfo();
}
