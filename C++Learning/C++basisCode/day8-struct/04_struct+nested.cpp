/**
 * @Author: Song-zy
 * @Date: 2021/11/4 12:51
 * @Description: 结构体嵌套
 */
#include "iostream"

using namespace std;

//定义学生结构体
struct student {
    string id;
    string name;
    int age;
    double score;
};
//定义教师结构体
struct teacher {
    string id;
    string name;
    int age;
    student s;//老师得学生
};


int main() {
    teacher teachers[] = {
            {"001", "T-1", 34, {"01", "S-2", 21, 89}},
            {"002", "T-2", 56, {"02", "S-1", 19, 67}},
            {"003", "T-3", 78, {"03", "S-3", 20, 10}},
    };
    for (int i = 0; i < 3; i++) {
        teacher *p = &teachers[i];
        student *ps = &teachers[i].s;
        cout << "teacher{" << p->id << ", " << p->name << ", " << p->age <<
             ", student{" << ps->id << ", " << ps->name << ", " << ps->score << "}}" << endl;
    }
    return 0;
}