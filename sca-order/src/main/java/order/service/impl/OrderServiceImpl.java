package order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import common.utils.RandomUtil;
import lombok.extern.slf4j.Slf4j;
import order.data.User;
import order.mapper.UserMapper;
import order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: lyk
 * @date: 2022/2/11 22:34
 * @description:
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public String getOrderInfo() {
        QueryWrapper<User> queryWrapper=new QueryWrapper<>();
        List<User> users = userMapper.selectList(queryWrapper);
        log.info("获取到用户信息为：{}",users);
        log.info("订单系统-调用获取订单信息服务");
        return RandomUtil.genRandomNumber(11);
    }
}
