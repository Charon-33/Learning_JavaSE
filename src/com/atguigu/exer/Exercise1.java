package com.atguigu.exer;

//异常-倒计时
public class Exercise1 {
    public static void main(String[] args) {

        //异常展示
//        Thread main = Thread.currentThread();
//        new Thread(){
//            public void run(){
//                main.interrupt();//中断线程，中断main
//            }
//        }.start();

        for (int i=10; i>=1; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);//选中要放到try中的代码，按快捷键ctrl + alt + T
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("新年快乐！");
    }
}


