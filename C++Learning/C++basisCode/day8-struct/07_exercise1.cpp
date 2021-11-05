/**
 * @Author: Song-zy
 * @Date: 2021/11/4 15:32
 * @Description: 
 */
#include <ctime>
#include "iostream"

using namespace std;
struct student {
    string name;
    int age;
    double score;
};
struct teacher {
    string name;
    int age;
    student s[5];//每个老师带5个学生
};

void all(teacher ts[], int len) {
    srand((unsigned) time(NULL));
    string names = "ABCDE";
    for (int i = 0; i < len; i++) {
        ts[i].name = "T_";
        ts[i].name += names[i];
        ts[i].age = (rand() % 20 + 50);

        for (int j = 0; j < 5; j++) {
            ts[i].s[j].name = "S_";
            ts[i].s[j].name += names[j];
            ts[i].s[j].age = (rand() % 20 + 10);
            ts[i].s[j].score = (rand() % 20 + 70);
        }
    }
}

void printT(teacher ts[], int len) {
    cout << "Tname\tTage\tStudents of Teacher" << endl;
    for (int i = 0; i < len; i++) {
        cout << ts[i].name << "\t" << ts[i].age << endl;
        cout << "\t\t" << "Sname\tSage\tscore" << endl;
        for (int j = 0; j < 5; j++) {
            cout << "\t\t" << ts[i].s[j].name << "\t" << ts[i].s[j].age
                 << "\t" << ts[i].s[j].score << endl;
        }
    }
}

int main() {
    teacher teachers[3];
    all(teachers, 3);
    printT(teachers, 3);
    return 0;
}