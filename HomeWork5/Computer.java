import java.util.Scanner;

public class Computer {
    Scanner sc = new Scanner(System.in);
    String CPU;
    int RAM;
    int HDD;
    int workResource;
    int count = 0;

    Computer(String CPU, int RAM, int HDD, int workResource) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
        this.workResource = workResource;
    }

    public void description() {
        System.out.println("Процессор " + CPU);
        System.out.println("Оперативная память " + RAM);
        System.out.println("Жесткий диск " + HDD);
        System.out.println("Ресурс работы " + workResource);
    }

    public void turningOn() {
        int i = (int) (Math.random());
        System.out.println("Введите 1 или 0 ");
        int j = sc.nextInt();
        if (j <= 1 && j >= 0) {
            if (workResource != count && j == i) {
                System.out.println("Ресурс работы в циклах " + count);
            } else {
                System.out.println("Компьютер сломан " + "Циклов проработал " + count + " " + i);
                destroy();
            }
        } else {
            System.out.println("Вы не попали по кнопке");
        }
    }
    public void switchedOff (){
        int i = (int) (Math.random());
        System.out.println("Введите 1 или 0 ");
        int j = sc.nextInt();
        if (j <= 1 && j >= 0) {
            if (workResource != count && j == i) {
                count+=1;
                System.out.println("Ресурс работы в циклах " + count);
            } else {
                System.out.println("Компьютер сломан " + "Циклов проработал " + count);
                destroy();
            }
        } else {
            System.out.println("Вы не попали по кнопке");
        }
    }
        void destroy () {
            System.out.println("Компьютер сломан");
        }
    }


