package com.su.yoga.designpatterns.flyweight;

import java.util.HashMap;

/**
 * @author wufan
 * @date 2022/1/8 11:34
 * @des 网站工厂类，根据需要返回一个网站
 */
public class WebSiteFactory {

    /**
     * 集合，充当池的作用
     */
    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    /**
     * @param type 网站类型
     * @return 指定类型的网站
     */
    public WebSite getWebSiteCategory(String type){
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebSite(type));
        }
        return pool.get(type);
    }

    /**
     * @return 池中网站总数
     */
    public int getWebSiteCount(){
        return pool.size();
    }

}
