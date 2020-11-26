package com.minnan.gugubird.weibo.consts;

import java.util.HashMap;
import java.util.Map;

public class WeiBoConsts {

    /***
     * 微博接口Map<接口名，api路径>
     */
    public static final Map<String, String> weiBoApiMap = new HashMap();

    static {
        //当前登陆用户uid
        weiBoApiMap.put("get_uid", "https://api.weibo.com/2/account/get_uid.json?access_token=");
        //用户信息
        weiBoApiMap.put("show", "https://api.weibo.com/2/users/show.json?access_token=");
        //关注用户的最新微博
        weiBoApiMap.put("home_timeline", "https://api.weibo.com/2/statuses/home_timeline.json?access_token=");
        //好友(双向关注)的最新微博
        weiBoApiMap.put("bilateral_timeline", "https://api.weibo.com/2/statuses/bilateral_timeline.json?access_token=");
    }

}
