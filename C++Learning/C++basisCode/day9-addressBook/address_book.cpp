/**
 * @Author: Song-zy
 * @Date: 2021/11/4 20:01
 * @Description: 通讯录管理系统
 * 姓名、性别、年龄、联系电话、家庭住址
 */
#include "iostream"

using namespace std;
//定义联系人结构体
struct contact {
    string name;
    bool gender;//true男，false女
    int age;
    long long tel;
    string address;
};

//菜单界面
void showMenu();

//1.添加联系人功能
void addContact(contact *con);

//2.显示联系人
void showContact(contact cons[], int len, int index);

//3 删除联系人
void removeContact(contact cons[], int len);

//4 查找联系人
void findContact(contact cons[], int len);

//5 修改联系人
void updateContact(contact cons[], int len);

//6 清空联系人
void clearContact(int *len);

int main() {
    int length = 100;
    contact cons[length];
    for (int i = 0; i < length; i++) {
        cons[i] = {};
    }
    int i = 0;
    int select = 0;
    while (true) {
        showMenu();
        cin >> select;
        switch (select) {
            case 1:
                cout << "请添加一个联系人！" << endl;
                addContact(&cons[i]);
                i++;
                break;
            case 2://显示联系人
                cout << "所有联系人信息如下：" << endl;
                showContact(cons, length, 0);
                break;
            case 3:
                removeContact(cons, length);
                break;
            case 4:
                findContact(cons, length);
                break;
            case 5:
                updateContact(cons, length);
                break;
            case 6:
                clearContact(&length);
                break;
            case 0:
                cout << "欢迎下次使用通讯录！！！" << endl;
                return 0;
            default:
                break;
        }
    }
    return 0;
}

void showMenu() {
    cout << "***********************" << endl;
    cout << "***** 1 添加联系人 *****" << endl;
    cout << "***** 2 显示联系人 *****" << endl;
    cout << "***** 3 删除联系人 *****" << endl;
    cout << "***** 4 查找联系人 *****" << endl;
    cout << "***** 5 修改联系人 *****" << endl;
    cout << "***** 6 清空联系人 *****" << endl;
    cout << "***** 0 退出通讯录 *****" << endl;
    cout << "***********************" << endl;
    cout << "请输入你的选择(0~6): " << endl;
}

//1.添加联系人功能
void addContact(contact *con) {
    //姓名、性别、年龄、联系电话、家庭住址
    cout << "姓名: " << endl;
    cin >> con->name;

    cout << "性别(1:男/0:女): " << endl;
    cin >> con->gender;

    cout << "年龄: " << endl;
    cin >> con->age;

    cout << "电话: " << endl;
    cin >> con->tel;

    cout << "住址: " << endl;
    cin >> con->address;
}

//2.显示联系人
void showContact(contact cons[], int len, int index) {
    cout << "姓名\t性别\t        年龄\t  电话\t  住址" << endl;
    for (int i = index; i < len; i++) {
        if (cons[i].name.empty()) {
            continue;
        }
        string s;
        s = cons[i].gender ? "MAN" : "WOMEN";
        cout << cons[i].name << "\t" << s << "\t" << cons[i].age
             << "\t" << cons[i].tel << "\t" << cons[i].address << endl;
    }
}

//3 删除联系人
void removeContact(contact cons[], int len) {
    string s;
    contact c;
    cout << "请输入你要删除的人的姓名: " << endl;
    cin >> s;
    cout << endl;
    for (int i = 0; i < len; i++) {
        if (s == cons[i].name) {
            cons[i] = c;
            break;
        }
    }
}

//4 查找联系人
void findContact(contact cons[], int len) {
    cout << "请输入你要查找人的姓名: " << endl;
    string s;
    cin >> s;
    for (int i = 0; i < len; i++) {
        if (s == cons[i].name) {
            showContact(cons, i + 1, i);
            break;
        }
    }
}

//5 修改联系人
void updateContact(contact cons[], int len) {
    cout << "请输入你要修改联系人的姓名: " << endl;
    string s;
    cin >> s;
    for (int i = 0; i < len; i++) {
        if (s == cons[i].name) {
            addContact(&cons[i]);
        }
    }
}

//6 清空联系人
void clearContact(int *len) {
    while (true) {
        cout << "你确定清空联系人吗？(y/n): " << endl;
        string s;
        cin >> s;
        if (s == "y") {
            *len = 0;
            break;
        } else if (s == "n") {
            break;
        }
    }
}