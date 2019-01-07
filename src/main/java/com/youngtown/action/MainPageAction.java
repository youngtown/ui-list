package com.youngtown.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试的Controller
 *
 * @author xingzhi.lv
 * @description
 * @since 2019/1/7 15:26
 */
@Controller
public class MainPageAction {

    @RequestMapping(path = "/list")
    public String list() {
        return "common/main";
    }

}
