#include <iostream>
using namespace std;
int main()
{
    int score;
    while (true)
    {
        printf("请给战狼电影打分(0~10): ");
        cin >> score;

        switch (score)
        {
        case 10:
            cout << "完美！" << endl;
            break;
        case 9:
            cout << "优秀！" << endl;
            break;
        case 8:
            cout << "良好！" << endl;
            break;
        case 7:
            cout << "ok！" << endl;
            break;
        case 6:
            cout << "及格！" << endl;
            break;

        default:
            cout << "垃圾电影！" << endl;
            break;
        }
    }
    system("pause");
    return 0;
}