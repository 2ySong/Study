/**
 * @Author: Song-zy
 * @Date: 2021/11/4 15:22
 * @Description: 
 */
#include "iostream"

using namespace std;

struct person {
    string name;
    int age;
};

void print_person(const person *p) {
//    p->age=9;//const关键字，不能修改
    cout << p->name << ", " << p->age << endl;
}

int main() {
    person p = {"Tom", 45};
    print_person(&p);
    return 0;
}