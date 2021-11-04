#include <iostream>
using namespace std;
#include <ctime>
int main()
{
    //1.生成随机数
    cout << "本游戏会生成一个随机数，请你猜出正确的值！！！" << endl;
    //添加<ctime>头文件
    srand((unsigned int)time(NULL));//添加随机数种子。利用当前时间生成随机数，不要生成伪随机数。
    int random = rand() % 100 + 1; //生成1~100的随机数
    // printf("%d",random);
    int num = 0; 
    while (true)
    {
        printf("请猜数:");
        cin >> num;
        if (num > random)
        {
            cout << "大了！" << endl;
        }
        else if (num < random)
        {
            cout << "小了！" << endl;
        }
        else
        {
            cout << "恭喜你，回答正确！" << endl;
            break;
        }
    }
}