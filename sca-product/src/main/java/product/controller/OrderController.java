package product.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import product.feign.FeignService;

/**
 * @author: lyk
 * @date: 2022/2/11 22:30
 * @description:
 */
@RestController
@Slf4j
@RequestMapping("/product")
@RefreshScope
public class OrderController {
    @Value("${seqNo}")
    private String seqNo;
    @Autowired
    private FeignService feignService;

    /**
     * 获取订单信息
     * @return
     */
    @GetMapping("/getOrderInfo")
    public String getOrderInfo() {
        log.info("序列号是：{}",seqNo);
        return seqNo+"的序列号是"+feignService.getOrderInfo();
    }
}
