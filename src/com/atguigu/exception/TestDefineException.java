package com.atguigu.exception;

/*
自定义一个异常，表示三边值不能组成三角形。
自定义异常的类型 NotATriangleException

自定义异常：
（1）要继承一个异常类型
（2）建议大家提供至少两个构造器，一个是无参构造，一个是(String message)构造器
（3）自定义异常对象只能手动抛出。抛出后由try..catch处理，也可以甩锅throws给调用者处理。

 */
public class TestDefineException {
    public static void main(String[] args) {
        try {
            Triangle t = new Triangle(1,1,1);
            System.out.println("t = " + t);
        } catch (NotATriangleException e) {
            e.printStackTrace();
        }
    }
}
