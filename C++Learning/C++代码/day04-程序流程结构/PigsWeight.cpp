#include <iostream>
using namespace std;
//��ֻС������أ��ڶ��ַ���

int main()
{
    int pig_weight[7];                                       //ʵ����һ����������ֻС�������
    int length = sizeof(pig_weight) / sizeof(pig_weight[0]); //��ȡ����ĳ���
    printf("С������طֱ�Ϊ��\n");
    for (int i = 0; i < length; i++)
    {
        cin >> pig_weight[i];
    }

    // int length = sizeof(pig_weight) / sizeof(pig_weight[0]); //��ȡ����ĳ���

    int index = -1;

    cout << "һ����" << length << "ֻ��" << endl;

    int max = 0;
    for (int i = 0; i < length - 1; i++)
    {
        if (pig_weight[i] > max)
        {
            max = pig_weight[i];
            index = i;
        }
    }

    cout << "���ص��ǵ�" << index + 1 << "ֻ��, ��" << max << "kg" << endl;
    return 0;
}