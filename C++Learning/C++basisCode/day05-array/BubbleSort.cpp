//
// Created by szy on 2021/10/21.
//冒泡排序

#include <iostream>

using namespace std;

//冒泡排序
int main() {
    int arr[] = {32, 453, 3, 0, -4, 56, 2};
    int arrLength = sizeof(arr) / sizeof(arr[0]); //获取数组长度
    cout << "原数组: arr=[";
//格式化数组
    for (int i = 0; i < arrLength; i++) {
        if (i == arrLength - 1) {
            cout << arr[i] << "]";
        } else {
            cout << arr[i] << ",";
        }
    }

    int temp = 0;
    //排序过程
    for (int i = 0; i < arrLength - 1; i++) {
        for (int j = 0; j < arrLength - 1 - i; j++) {
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
    cout << "\n冒泡排序后的数组: newArr=[";
    for (int i = 0; i < arrLength; i++) {
        if (i == arrLength - 1) {
            cout << arr[i] << "]";
        } else {
            cout << arr[i] << ",";
        }
    }
    system("pause");
    return 0;
}