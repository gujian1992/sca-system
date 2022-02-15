package order.controller;

import order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lyk
 * @date: 2022/2/11 22:36
 * @description:
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;
    @GetMapping("/getOrderInfo")
    public String getOrderInfo(){
      return  orderService.getOrderInfo();
    }
}
