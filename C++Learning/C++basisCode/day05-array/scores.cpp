#include "iostream"

using namespace std;

int main() {
    //输出几个同学的成绩单
    int scores[3][3] = {
            {100, 60, 70},
            {90,  50, 80},
            {50,  67, 89}
    };
    int sum;
    string names[4] = {"张三", "李四", "王五"};
    cout << "姓名\t数学\t语文\t英语\t 总分" << endl;
    for (int i = 0; i < 3; i++) {
        cout << names[i] << "\t";
        for (int j = 0; j < 3; j++) {
            cout << scores[i][j] << "\t";
            sum+=scores[i][j];
        }
        cout <<sum<< endl;
    }
    system("pause");
    return 0;
}
