package cn.tedu.sp09.service;

import cn.tedu.sp01.pojo.Item;
import cn.tedu.sp01.util.JsonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author 000
 * @version 1.0
 * @date 2019/12/31 15:55
 */
@FeignClient(name="item-service", fallback = ItemFeignServiceFB.class)
public interface ItemFeignService {

    @GetMapping("/{orderId}")
    JsonResult<List<Item>> getItems(@PathVariable String orderId);

    @PostMapping("/decreaseNumber")
    JsonResult decreaseNumber(@RequestBody List<Item> items);

}
