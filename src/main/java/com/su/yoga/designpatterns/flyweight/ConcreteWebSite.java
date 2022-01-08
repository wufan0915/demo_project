package com.su.yoga.designpatterns.flyweight;

/**
 * @author wufan
 * @date 2022/1/8 11:31
 * @des
 */
public class ConcreteWebSite extends WebSite {

    /**
     * 网站发布的类型
     */
    private String type = "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use() {
        System.out.println("网站的发布形式为："+ type +"，开始工作.. ");
    }
}
