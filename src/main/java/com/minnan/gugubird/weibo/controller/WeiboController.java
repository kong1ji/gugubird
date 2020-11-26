package com.minnan.gugubird.weibo.controller;

import com.alibaba.fastjson.JSONObject;
import com.minnan.gugubird.weibo.service.IWeiboService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@Api(tags = "微博中心", description = "微博中心相关接口")
@RestController
public class WeiboController {

    @Autowired
    private IWeiboService iWeiboService;

    @ApiOperation(tags = "微博中心", value = "圣经查询")
    @RequestMapping(value = "dididada", method = RequestMethod.GET)
    public String welcome() {
        return "<h2 style='text-align: left; margin: 200px 400px'>最最喜欢你，绿子</br></br>" +
                "什么程度</br></br>" +
                "像喜欢春天的熊一样</br></br>" +
                "春天的熊？”绿子再次扬起脸，“什么春天的熊？</br></br>" +
                "春天的原野里，你一个人正走着，对面走来一只可爱的小熊，浑身的毛活像天鹅绒，眼睛圆鼓鼓的。</br></br>" +
                "它对你说道：’你好，小姐，和我一块儿打滚玩好吗？’" +
                "接着，你就和小熊抱在一起，顺着长满三叶草的山坡‘咕噜咕噜’滚下去，玩了整整一天。你说棒不棒？</br></br>" +
                "太棒了</br></br>" +
                "我就这么喜欢你</h2>" +
                "<h2 style='text-align: right'>《挪威的森林》村上春树</h2>";
    }

    @ApiOperation(tags = "微博中心", value = "微博热搜")
    @RequestMapping(value = "hotSearch", method = RequestMethod.GET)
    public JSONObject hotSearch() {
        return iWeiboService.getHotSearchList();
    }
}
