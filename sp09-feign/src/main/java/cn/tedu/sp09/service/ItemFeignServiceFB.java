package cn.tedu.sp09.service;

import cn.tedu.sp01.pojo.Item;
import cn.tedu.sp01.util.JsonResult;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 000
 * @version 1.0
 * @date 2019/12/31 16:01
 */
@Component
public class ItemFeignServiceFB implements ItemFeignService {

    @Override
    public JsonResult<List<Item>> getItems(String orderId) {
        return JsonResult.err("无法获取订单商品列表");
    }

    @Override
    public JsonResult decreaseNumber(List<Item> items) {
        return JsonResult.err("无法修改商品库存");
    }

}
