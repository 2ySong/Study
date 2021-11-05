/**
 * @Author: Song-zy
 * @Date: 2021/11/4 12:45
 * @Description: 
 */
#include "iostream"

using namespace std;

struct Student {
    string name;
    int age;
    double score;
};

int main() {
    Student s = {"уехЩ", 34, 90};
    Student *p = &s;
    cout << p->name << ", " << p->age << ", " << p->score << endl;
    cout << (*p).name << ", " << (*p).age << ", " << (*p).score << endl;
    return 0;
}