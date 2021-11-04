#include <iostream>
using namespace std;
//三只小猪比较体重

int main()
{
    int pig1_wight, pig2_wight, pig3_wight;
    printf("三只小猪的体重分别为：");
    cin >> pig1_wight >> pig2_wight >> pig3_wight;

    int max = (pig1_wight > pig2_wight ? pig1_wight : pig2_wight) > pig3_wight ? (pig1_wight > pig2_wight ? pig1_wight : pig2_wight) : pig3_wight;

    cout << "三只猪最重是" << max << "kg" << endl;

    cout << "pig1_wight=" << pig1_wight << endl;
    cout << "pig2_wight=" << pig2_wight << endl;
    cout << "pig3_wight=" << pig3_wight << endl;

    system("pause");
    return 0;
}