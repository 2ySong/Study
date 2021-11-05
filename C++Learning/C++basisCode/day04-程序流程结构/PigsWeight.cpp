#include <iostream>
using namespace std;
//三只小猪比体重，第二种方法

int main()
{
    int pig_weight[7];                                       //实例化一个数组存放三只小猪的体重
    int length = sizeof(pig_weight) / sizeof(pig_weight[0]); //获取数组的长度
    printf("小猪的体重分别为：\n");
    for (int i = 0; i < length; i++)
    {
        cin >> pig_weight[i];
    }

    // int length = sizeof(pig_weight) / sizeof(pig_weight[0]); //获取数组的长度

    int index = -1;

    cout << "一共有" << length << "只猪" << endl;

    int max = 0;
    for (int i = 0; i < length - 1; i++)
    {
        if (pig_weight[i] > max)
        {
            max = pig_weight[i];
            index = i;
        }
    }

    cout << "最重的是第" << index + 1 << "只猪, 重" << max << "kg" << endl;
    return 0;
}