#include <iostream>
using namespace std;
//��ֻС��Ƚ�����

int main()
{
    int pig1_wight, pig2_wight, pig3_wight;
    printf("��ֻС������طֱ�Ϊ��");
    cin >> pig1_wight >> pig2_wight >> pig3_wight;

    int max = (pig1_wight > pig2_wight ? pig1_wight : pig2_wight) > pig3_wight ? (pig1_wight > pig2_wight ? pig1_wight : pig2_wight) : pig3_wight;

    cout << "��ֻ��������" << max << "kg" << endl;

    cout << "pig1_wight=" << pig1_wight << endl;
    cout << "pig2_wight=" << pig2_wight << endl;
    cout << "pig3_wight=" << pig3_wight << endl;

    system("pause");
    return 0;
}