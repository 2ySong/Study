#include <iostream>
using namespace std;
int main()
{
    int score;
    while (true)
    {
        printf("���ս�ǵ�Ӱ���(0~10): ");
        cin >> score;

        switch (score)
        {
        case 10:
            cout << "������" << endl;
            break;
        case 9:
            cout << "���㣡" << endl;
            break;
        case 8:
            cout << "���ã�" << endl;
            break;
        case 7:
            cout << "ok��" << endl;
            break;
        case 6:
            cout << "����" << endl;
            break;

        default:
            cout << "������Ӱ��" << endl;
            break;
        }
    }
    system("pause");
    return 0;
}