//
// Created by szy on 2021/10/21.
//数组翻转

#include <iostream>
using namespace std;
int main()
{
    int length;
    cout << "请输入你要输入数组的长度:";
    cin >> length; //键入数组长度
    // cout << endl;
    int arr[length]; //创建数组
    //初始化数组
    cout<<"请输入你的数组：";
    for (int i = 0; i < length; i++)
    {
        cin >> arr[i];
    }
    int arrLength = sizeof(arr) / sizeof(arr[0]);
    cout << "原数组: arr=[";

    for (int i = 0; i < arrLength; i++)
    {
        if (i == arrLength - 1)
        {
            cout << arr[i] << "]";
        }
        else
        {
            cout << arr[i] << ",";
        }
    }

    cout << "\n逆置后的数组: newArr=[";
    int temp = 0;
    for (int i = 0, j = arrLength - 1; i < j; i++, j--)
    {
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    for (int i = 0; i < arrLength; i++)
    {
        if (i == arrLength - 1)
        {
            cout << arr[i] << "]";
        }
        else
        {
            cout << arr[i] << ",";
        }
    }
    cout << endl;
    system("pause");
    return 0;
}