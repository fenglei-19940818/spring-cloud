package cn.tedu.sp09.service;

import cn.tedu.sp01.pojo.User;
import cn.tedu.sp01.util.JsonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 000
 * @version 1.0
 * @date 2019/12/31 15:55
 */
@FeignClient(name="user-service", fallback = UserFeignServiceFB.class)
public interface UserFeignService {
    @GetMapping("/{userId}")
    JsonResult<User> getUser(@PathVariable Integer userId);

    /**
     * 拼接路径 /{userId}/score?score=新增积分
     * 如果请求参数和方法参数同名,@RequestParam可省略
     *
     * @param userId
     * @param score
     * @return
     */
    @GetMapping("/{userId}/score")
    JsonResult addScore(@PathVariable Integer userId, @RequestParam Integer score);
}