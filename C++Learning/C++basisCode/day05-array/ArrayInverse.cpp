//
// Created by szy on 2021/10/21.
//���鷭ת

#include <iostream>
using namespace std;
int main()
{
    int length;
    cout << "��������Ҫ��������ĳ���:";
    cin >> length; //�������鳤��
    // cout << endl;
    int arr[length]; //��������
    //��ʼ������
    cout<<"������������飺";
    for (int i = 0; i < length; i++)
    {
        cin >> arr[i];
    }
    int arrLength = sizeof(arr) / sizeof(arr[0]);
    cout << "ԭ����: arr=[";

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

    cout << "\n���ú������: newArr=[";
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