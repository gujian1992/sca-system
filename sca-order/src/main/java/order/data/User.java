package order.data;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author: lyk
 * @date: 2022/2/12 17:31
 * @description:
 */
@Data
@TableName("user")
public class User {
    @TableId(type = IdType.INPUT)
    private Integer id;
    private String name;
    private String phone;
    private String mark;
    private String card;
    private Integer sex;
}
