#include <iostream>
using namespace std;
#include <ctime>
int main()
{
    //1.���������
    cout << "����Ϸ������һ�������������³���ȷ��ֵ������" << endl;
    //���<ctime>ͷ�ļ�
    srand((unsigned int)time(NULL));//�����������ӡ����õ�ǰʱ���������������Ҫ����α�������
    int random = rand() % 100 + 1; //����1~100�������
    // printf("%d",random);
    int num = 0; 
    while (true)
    {
        printf("�����:");
        cin >> num;
        if (num > random)
        {
            cout << "���ˣ�" << endl;
        }
        else if (num < random)
        {
            cout << "С�ˣ�" << endl;
        }
        else
        {
            cout << "��ϲ�㣬�ش���ȷ��" << endl;
            break;
        }
    }
}