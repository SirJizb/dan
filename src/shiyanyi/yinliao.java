package shiyanyi;

import java.util.Scanner;

class yinliao {
    public static void main(String[] args) {
        int button1,button2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请投币（一元请输入1，五角请输入2）");
        try {
            button1 = scanner.nextInt();
            if (button1 != 1 && button1 != 2){
                System.out.println("输入无效");
                return;
            }
        } catch (Exception e){
            System.out.println("输入无效");
            return;
        }
        System.out.println("请选择商品（啤机请输入1，橙汁请输入2）");
        try {
            button2 = scanner.nextInt();
            if (button2 != 1 && button2 != 2){
                System.out.println("输入无效");
                return;
            }
        } catch (Exception e){
            System.out.println("输入无效");
            return;
        }
        if (button1 == 2 && button2 == 1 ){
            System.out.println("请取走您的啤酒");
        }
        else if (button1 == 2 && button2 == 2 ){
            System.out.println("请取走您的橙汁");
        }
        else if (button1 == 1 && button2 == 1 ){
            System.out.println("请取走您的啤酒，将找零五角");
        }
        else if (button1 == 1 && button2 == 2 ){
            System.out.println("请取走您的橙汁，将找零五角");
        }
    }
}
