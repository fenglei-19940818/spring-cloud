package cn.tedu.sp01.service;

import cn.tedu.sp01.pojo.Item;

import java.util.List;

/**
 * @author 000
 * @version 1.0
 * @date 2019/12/30 10:35
 */
public interface ItemService {
    List<Item> getItems(String orderId);
    void decreaseNumbers(List<Item> list);
}
