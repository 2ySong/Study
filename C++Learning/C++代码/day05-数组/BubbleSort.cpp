#include <iostream>
using namespace std;
//ð������
int main()
{
    int arr[] = {32, 453, 3, 0, -4, 56, 2};
    int arrLength = sizeof(arr) / sizeof(arr[0]); //��ȡ���鳤��
    cout << "ԭ����: arr=[";
//��ʽ������
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

    int temp = 0;
    //�������
    for (int i = 0; i < arrLength - 1; i++)
    {
        for (int j = 0; j < arrLength - 1 - i; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
    cout << "\nð������������: newArr=[";
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
    system("pause");
    return 0;
}