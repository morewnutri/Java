package com.lagou.array;

import java.util.Scanner;

/**
 * 编程实现数组中指定元素累加的功能
 */
public class ArraySumTest {

    public static void main(String[] args){

        // 1.声明一个16行16列的二维数组，数组元素的默认值为0
        int[][] arr = new int[16][16];

        // 2.提示用户输入二维数组中所有位置的元素值
        // 由于从键盘输入纯粹是体力活，因此下面使用固定的数据作为数组的元素值
        //Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 15; i++) {
            for (int j = 0; j <= 15; j++) {
                //System.out.println("请输入下标为[" + i + "][" + j + "]位置的元素值：");
                //arr[i][j] = sc.nextInt();
                arr[i][j] = 1;
            }
        }

        // 3.打印二维数组中的所有元素值
        for (int i = 0; i <= 15; i++) {
            for(int j = 0; j <= 15; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------------------------");
        // 4.实现每一行中所有元素值的和并打印
        // 记录每一行所有元素累加和的规则是：行下标保持不变，列下标从0到15
        for (int i = 0; i <= 15; i++) {
            // 声明变量用于记录当前行所有元素的和
            int sum = 0;
            for(int j = 0; j <= 15; j++) {
                sum += arr[i][j];
            }
            System.out.println("第" + (i+1) + "行的所有元素的累加和为：" + sum);
        }

        System.out.println("---------------------------------------------------");
        // 5.实现每一列中所有元素值的和并打印
        // 记录每一列中所有元素累加和的规则是：列下标保持不变，行下标从0到15
        for (int j = 0; j <= 15; j++) {
            // 声明变量用于记录当前列所有元素的和
            int sum = 0;
            for(int i = 0; i <= 15; i++) {
                sum += arr[i][j];
            }
            System.out.println("第" + (j+1) + "列的所有元素的累加和为：" + sum);
        }

        System.out.println("---------------------------------------------------");
        // 6.实现从左上角到右下角所有元素的和并打印
        // 记录左上角到右下角所有元素累加和的规则是：行列下标同时从0到15，同时加1
        // 声明变量用于记录当前列所有元素的和
        int sum = 0;
        for(int i = 0; i <= 15; i++) {
                sum += arr[i][i];
        }
        System.out.println("从左上角到右下角所有元素的累和为：" + sum);


        System.out.println("---------------------------------------------------");
        // 7.实现从右上角到左下角的元素和并打印
        // 记录右上角到左下角所有元素累加和的规则是：行加1，列减1，由于行列都是15，因此相加结果为15
        sum = 0;
        for(int i = 0; i <= 15; i++) {
            sum += arr[i][15-i];
        }
        System.out.println("从左上角到右下角所有元素的累和为：" + sum);

    }
}
