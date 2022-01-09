package com.su.yoga.designpatterns.proxy;

/**
 * @author wufan
 * @date 2022/1/9 20:04
 * @des
 */
public class TeacherDao implements ITeacherDao{
    @Override
    public void tech() {
        System.out.println("老师授课中...");
    }
}
