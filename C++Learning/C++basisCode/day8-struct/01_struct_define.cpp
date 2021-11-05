//
// Created by szy on 2021/11/3.
//结构体定义

#include "iostream"

using namespace std;

//创建学生数据类型：姓名，年龄，分数
//自定义数据类型
struct Student {
    string name;
    int age;
    double score;
} s3, s4;//s3,s4,...:定义结构体时顺便创建变量

//创建学生对象
//1.struct Student s1;
//2.struct Student s2 = {....};
//3.定义结构体时顺便创建变量
int main() {
    struct Student s1;
    s1.name = "Tom";
    s1.age = 34;
    s1.score = 89.67;
    struct Student s2 = {"jack", 18, 89.5};
    s3.name = "smith";
    s3.age = 23;
    s3.score = 89;
    cout << "name\t" << "age\t" << "score" << endl;
    cout << s1.name << "\t" << s1.age << "\t" << s1.score << endl;
    cout << s2.name << "\t" << s2.age << "\t" << s2.score << endl;
    cout << s3.name << "\t" << s3.age << "\t" << s3.score << endl;
    return 0;
}

