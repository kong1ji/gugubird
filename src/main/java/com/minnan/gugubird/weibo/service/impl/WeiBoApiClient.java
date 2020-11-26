package com.minnan.gugubird.weibo.service.impl;

import com.minnan.gugubird.utils.HttpUtils;
import com.minnan.gugubird.weibo.consts.WeiBoConsts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;

@Service("weiBoApiClient")
public class WeiBoApiClient {

    @Value("${weibo.code}")
    protected String code;

    @Value("${weibo.client.id}")
    protected String clientId;

    @Value("${weibo.client.secret}")
    protected String clientSecret;

    @Value("${weibo.redirect.uri}")
    protected String redirectUri;

    @Value("${weibo.grant.type}")
    protected String grantType;

    @Value("${weibo.api.interval.time}")
    protected String apiIntervalTime;

    /**
     * 功能描述：根据微博接口名通过http get请求对应的api
     *
     * @param apiName
     * @return java.lang.String
     * @author chen.zhihui
     * @date 2020/4/3 15:05
     */
    public String httpGetWeiBoApi(String apiName) {
        String accessToken = this.getWeiBoAccessToken();
        String url = WeiBoConsts.weiBoApiMap.get(apiName) + accessToken;
        return HttpUtils.doGet(url);
    }

    /**
     * 功能描述：根据微博接口名通过http get请求对应的api
     *
     * @param apiName
     * @param paramMap
     * @return java.lang.String
     * @author chen.zhihui
     * @date 2020/4/3 15:06
     */
    public String httpGetWeiBoApi(String apiName, HashMap<String, String> paramMap) {
        String accessToken = this.getWeiBoAccessToken();
        String url = WeiBoConsts.weiBoApiMap.get(apiName) + accessToken;
        for (String s : paramMap.keySet()) {
            url += ("&" + s + "=" + paramMap.get(s));
        }
        return HttpUtils.doGet(url);
    }

    /**
     * 功能描述：获取微博token
     *
     * @param
     * @return java.lang.String
     * @author chen.zhihui
     * @date 2020/3/2 15:03
     */
    private String getWeiBoAccessToken() {
//        Jedis jedis = new Jedis("localhost");
//        String accessToken = jedis.get("accessToken");
//        if (accessToken == null) {
//            String params = "client_id=" + clientId
//                    + "&client_secret=" + clientSecret
//                    + "&grant_type=" + grantType
//                    + "&redirect_uri=" + redirectUri + "&code=" + code;
//            // 用code换取accessToken
//            String result = HttpUtils.doPost("https://api.weibo.com/oauth2/access_token?" + params, "");
//            JSONObject jsonObject = JSONObject.parseObject(result);
//            accessToken = jsonObject.get("access_token").toString();
//            jedis.set("accessToken", accessToken);
//        }
//        return accessToken;
        return "";
    }
}
