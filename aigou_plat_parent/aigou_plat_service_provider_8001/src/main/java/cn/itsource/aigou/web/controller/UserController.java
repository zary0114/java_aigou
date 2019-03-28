package cn.itsource.aigou.web.controller;

import cn.itsource.aigou.common.AjaxResult;
import cn.itsource.plat.domain.User;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/plat")
public class UserController {


    /**
     * 我们学习了restful的风格：
     *   地址：定位资源
     *   http动词：标识操作
     *   @RequestBody 把前台提交的body的参数封装到user对象中
     *
     *
     *   post请求：
     *     要测试：浏览器直接发送的是get请求；
     *   postman：
     *   swagger：
     * @param user
     * @return
     */
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody User user){
        //调用service和mapper：
        //写死模拟：
        // 通过前台的用户名和密码：作为查询条件从数据库查询：如果有数据就是对的，否则就是错误的：
        // select * from t_user u where u.name=#{name} and u.password=#{password}
        if(user!=null&& !StringUtils.isEmpty(user.getName())&&!StringUtils.isEmpty(user.getPassword())){
          if("admin".equals(user.getName())&&"xxxooo".equals(user.getPassword())){
              return AjaxResult.me().setMsg("登录成功");
          } else {
              return AjaxResult.me().setSuccess(false).setMsg("登录失败");
          }
        }
        return AjaxResult.me().setSuccess(false).setMsg("登录失败");
    }
}
