package order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import order.data.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: lyk
 * @date: 2022/2/12 17:34
 * @description:
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
