/**
 * @Author: Song-zy
 * @Date: 2021/11/4 19:27
 * @Description: 
 */
#include "iostream"

using namespace std;

string isMan(bool b) {
    return b ? "��" : "Ů";
}

struct hero {
    string name;
    int age;
    bool sex;//�Ա�true�У�falseŮ
};

//�������С����
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
    cout << "����\t����\t�Ա�" << endl;
    for (int i = 0; i < len; i++) {
        string s;
        s = isMan(hs[i].sex);
        cout << hs[i].name << "\t" << hs[i].age << "\t" << s << endl;
    }
}

int main() {
    hero hs[5] = {
            {"����", 35, true},
            {"����", 33, true},
            {"�ŷ�", 29, true},
            {"����", 45, true},
            {"����", 18, false},
    };
    bubbleSort(hs, 5);
    printHero(hs, 5);
    return 0;
}