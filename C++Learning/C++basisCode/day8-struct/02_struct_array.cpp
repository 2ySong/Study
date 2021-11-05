/**
 * @Author: Song-zy
 * @Date: 2021/11/4 12:31
 * @Description: 结构体数组
 */

#include "iostream"

using namespace std;

struct Student {
    string name;
    int age;
    double score;
};

int main() {
    //创建结构体数组
    struct Student students[3] = {{"jack",  16, 78},
                                  {"tom",   19, 90},
                                  {"smith", 24, 67}};
    for (int i = 0; i < 3; i++) {
        cout << (students + i)->name << ",";
        cout << (*(students + i)).age << ",";
        cout << (*(students + i)).score << endl;
    }
    return 0;
}