#include <iostream>
using namespace std;
/*��������:��1��ʼ��������100,������ָ�λ����7,��������ʮλ����7,
���߸�������7�ı���,���Ǵ�ӡ
������,��������ֱ�Ӵ�ӡ�����
*/
int main()
{
    int n1,n2;
    for (int i = 0; i < 100; i++)
    {
        n1 = i / 10; //ʮλ
        n2 = i % 10; //��λ
        if ((n1 == 7 || n2 == 7 || i % 7 == 0) && i != 0)
        {
            cout << i << endl;
        }
    }
    system("pause");
    return 0;
}