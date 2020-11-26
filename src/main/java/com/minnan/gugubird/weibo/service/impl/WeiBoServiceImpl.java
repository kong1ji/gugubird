package com.minnan.gugubird.weibo.service.impl;


import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.minnan.gugubird.utils.HttpUtils;
import com.minnan.gugubird.weibo.service.IWeiboService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service("iWeiboService")
public class WeiBoServiceImpl implements IWeiboService {

    /**
     * 功能描述：获取热搜排行榜
     *
     * @param
     * @return com.cunzhang.common.ResultVO
     * @author chen.zhihui
     * @date 2020/3/4 22:22
     */
    @Override
    public JSONObject getHotSearchList() {
        String url = "https://m.weibo.cn/page/pageJson?containerid=106003type%253D25%2526filter_type%253Drealtimehot%2526frompage%253Dall%2526t%253D&count=20&from=1055095010&need_head_cards=1&page=1";
        String res = HttpUtils.doGet(url);
        return JSONObject.parseObject(res);
    }
}
