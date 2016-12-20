package com.allen.web.controller.basic.menu;

import com.allen.dao.PageInfo;
import com.allen.service.basic.menu.FindMenuPageService;
import com.allen.web.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Allen on 2016/12/20.
 */
@Controller
@RequestMapping(value = "/findMenuPage")
public class FindMenuPageController extends BaseController {
    @Resource
    private FindMenuPageService findMenuPageService;

    @RequestMapping(value = "find")
    public String find(@RequestParam(value="name", required=false, defaultValue="") String name,
                                  HttpServletRequest request) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("name", name.trim());
        PageInfo pageInfo = super.getPageInfo(request);
        pageInfo = findMenuPageService.find(pageInfo, params);
        request.setAttribute("pageInfo", pageInfo);
        return "/menu/menuList";
    }
}
