package com.su.yoga.designpatterns.flyweight;

/**
 * @author wufan
 * @date 2022/1/8 11:40
 * @des
 */
public class Client {

    public static void main(String[] args) {
        //创建一个工厂类
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        //客户A需要以新闻形式发布
        WebSite user1 = webSiteFactory.getWebSiteCategory("新闻");
        user1.use();
        //客户B需要以微博形式发布
        WebSite user2 = webSiteFactory.getWebSiteCategory("微博");
        user2.use();
        //客户C需要以微信公众号形式发布
        WebSite user3 = webSiteFactory.getWebSiteCategory("微信公众号");
        user3.use();
        //客户D需要以微博形式发布
        WebSite user4 = webSiteFactory.getWebSiteCategory("微博");
        user4.use();
        //客户E需要以微博形式发布
        WebSite user5 = webSiteFactory.getWebSiteCategory("微博");
        user5.use();

        int webSiteCount = webSiteFactory.getWebSiteCount();
        System.out.println("池中共有"+webSiteCount+"个网站数量");

    }
}
