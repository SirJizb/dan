package shiyanyi;

import java.util.Scanner;

public class hangkongfuwu {
    public static void query(int b1,int b2,int b3){
        if (b1 == 1){
            System.out.println("享受服务：食物供应、播放电影");
            return;
        }
        if (b1 == 2 && b2 == 1){
            System.out.println("享受服务：食物供应、播放电影");
            return;
        }
        if (b1 == 2 && b2 == 2){
            System.out.println("享受服务：食物供应");
            return;
        }
        if (b1 == 3 && b2 == 1){
            System.out.println("享受服务：食物供应");
            return;
        }
        if (b1 == 3 && b2 == 2 && b3 == 2){
            System.out.println("享受服务：食物供应");
            return;
        }
        else
            System.out.println("享受服务：无");
    }
    public static void main(String[] args) {
        int button1,button2,button3;
        System.out.println("欢迎使用航空服务查询系统");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的航线（欧美请输入1，国外非欧美请输入2，国内请输入3）");
        try {
            button1 = scanner.nextInt();
            if (button1 != 1 && button1 != 2 && button1 !=3){
                System.out.println("输入无效");
                return;
            }
        } catch (Exception e){
            System.out.println("输入无效");
            return;
        }
        System.out.println("请输入您的舱位（商务舱请输入1，经济舱请输入2）");
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
        System.out.println("请输入您的飞行时间（两小时以内请输入1，超过两小时请输入2）");
        try {
            button3 = scanner.nextInt();
            if (button3 != 1 && button3 != 2){
                System.out.println("输入无效");
                return;
            }
        } catch (Exception e){
            System.out.println("输入无效");
            return;
        }
        query(button1,button2,button3);
    }
}