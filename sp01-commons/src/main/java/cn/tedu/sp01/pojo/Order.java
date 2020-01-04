package cn.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author 000
 * @version 1.0
 * @date 2019/12/30 10:35
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private String id;
    private User user;
    private List<Item> items;

}
