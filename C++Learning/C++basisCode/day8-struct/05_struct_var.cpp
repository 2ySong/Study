/**
 * @Author: Song-zy
 * @Date: 2021/11/4 15:07
 * @Description: 结构体作函数参数
 */
#include "iostream"

using namespace std;
struct student {
    string name;
    int age;
    double score;
};

//1.值传递
void print_struct1(student s) {
    s.age = 1000;
    cout << s.name << ", " << s.age << ", " << s.score << endl;
}

//2.地址传递
void print_struct2(student *p) {
    p->age = 999;
    cout << p->name << ", " << p->age << ", " << p->score << endl;
}

int main() {
    student s = {"Jack", 27, 89};
    print_struct1(s);//Jack, 1000, 89
    cout << s.age << endl;//27，年龄并未改变: 值传递
    student *p = &s;
    print_struct2(p);//Jack, 999, 89
    cout << s.age << endl;//999，年龄改变: 地址传递
    return 0;
}