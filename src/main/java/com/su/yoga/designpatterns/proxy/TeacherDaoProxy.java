package com.su.yoga.designpatterns.proxy;

/**
 * @author wufan
 * @date 2022/1/9 20:05
 * @des 代理对象，静态代理
 * 作用：增强
 */
public class TeacherDaoProxy implements ITeacherDao{

    /**
     * 目标对象，通过接口聚合
     */
    private ITeacherDao iTeacherDao;

    /**
     * @param iTeacherDao 构造器
     */
    public TeacherDaoProxy(ITeacherDao iTeacherDao) {
        this.iTeacherDao = iTeacherDao;
    }

    @Override
    public void tech() {
        System.out.println("开始代理...");
        iTeacherDao.tech();
        System.out.println("提交...");
    }
}
