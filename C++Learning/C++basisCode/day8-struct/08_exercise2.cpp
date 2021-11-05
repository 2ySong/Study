/**
 * @Author: Song-zy
 * @Date: 2021/11/4 19:27
 * @Description: 
 */
#include "iostream"

using namespace std;

string isMan(bool b) {
    return b ? "男" : "女";
}

struct hero {
    string name;
    int age;
    bool sex;//性别：true男，false女
};

//按年龄大小升序
void bubbleSort(hero *hs, int len) {
    for (int i = 0; i < len - 1; i++) {
        for (int j = 0; j < len - 1 - i; j++) {
            if (hs[j].age < hs[j + 1].age) {
                hero temp = hs[j];
                hs[j] = hs[j + 1];
                hs[j + 1] = temp;
            }
        }
    }
}

void printHero(hero hs[], int len) {
    cout << "姓名\t年龄\t性别" << endl;
    for (int i = 0; i < len; i++) {
        string s;
        s = isMan(hs[i].sex);
        cout << hs[i].name << "\t" << hs[i].age << "\t" << s << endl;
    }
}

int main() {
    hero hs[5] = {
            {"刘备", 35, true},
            {"关羽", 33, true},
            {"张飞", 29, true},
            {"赵云", 45, true},
            {"貂蝉", 18, false},
    };
    bubbleSort(hs, 5);
    printHero(hs, 5);
    return 0;
}