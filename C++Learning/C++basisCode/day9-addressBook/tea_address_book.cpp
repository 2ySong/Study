/**
 * @Author: Song-zy
 * @Date: 2021/11/5 14:50
 * @Description: 跟着老师写的
 */
#include "iostream"

using namespace std;
#define MAX 1000
struct Person {
    string name;
    string gender;
    int age;
    string tel;
    string address;
};

struct AddressBook {
    Person p_array[MAX];
    int size;
};

void addPerson(AddressBook *pBook);

void showPerson(AddressBook *pBook, int k);

void delPerson(AddressBook *pBook);

int findPerson(AddressBook *pBook, string name);

void updatePerson(AddressBook *pBook);

void showMenu() {
    cout << "***********************" << endl;
    cout << "***** 1 添加联系人 *****" << endl;
    cout << "***** 2 显示联系人 *****" << endl;
    cout << "***** 3 删除联系人 *****" << endl;
    cout << "***** 4 查找联系人 *****" << endl;
    cout << "***** 5 修改联系人 *****" << endl;
    cout << "***** 6 清空联系人 *****" << endl;
    cout << "***** 7 清空屏幕   *****" << endl;
    cout << "***** 0 退出通讯录 *****" << endl;
    cout << "***********************" << endl;
    cout << "请输入你的选择(0~6): ";
}

int main() {
    AddressBook abs;
    abs.size = 0;
    int select = 0;
    while (true) {
        showMenu();
        cin >> select;
        switch (select) {
            case 1:
                cout << "请添加一个联系人！" << endl;
                addPerson(&abs);
                break;
            case 2://显示联系人
                showPerson(&abs, -1);
                break;
            case 3:
                delPerson(&abs);
                break;
            case 4:
                findPerson(&abs, " ");
                break;
            case 5:
                updatePerson(&abs);
                break;
            case 6:
                abs.size = 0;
                system("cls");
                break;
            case 7:
                system("cls");
                break;
            case 0:
                cout << "欢迎下次使用通讯录！！！" << endl;
                return 0;
            default:
                break;
        }
    }
}

void updatePerson(AddressBook *pBook) {
    string pname;
    cout << "请输入你要修改联系人的姓名: ";
    cin >> pname;
    int index = findPerson(pBook, pname);
    if (index == -1) {
        cout << "该联系人不存在！" << endl;
    } else {
        cout << "姓名: ";
        cin >> pBook->p_array[index].name;

        cout << "性别(男/女): ";
        string sex;
        cin >> sex;
        if (sex == "男") {
            pBook->p_array[index].gender = "男";
        } else if (sex == "女") {
            pBook->p_array[index].gender = "女";
        } else {
            cout << "温馨提示：你的输入有误，默认为男性。";
            pBook->p_array[index].gender = "男";
        }
        cout << "年龄: ";
        cin >> pBook->p_array[index].age;

        cout << "电话: ";
        cin >> pBook->p_array[index].tel;

        cout << "住址: ";
        cin >> pBook->p_array[index].address;
        cout << "修改成功！" << endl;
    }
}

int findPerson(AddressBook *pBook, string name) {
    if (name == " ") {
        string pname;
        cout << "请输入你要查找联系人的姓名";
        cin >> pname;
        for (int i = 0; i < pBook->size; i++) {
            if (pBook->p_array[i].name == pname) {
                showPerson(pBook, i);
                return i;
            }
        }
        cout << "查无此人！" << endl;
        return -1;
    } else {
        for (int i = 0; i < pBook->size; i++) {
            if (pBook->p_array[i].name == name) {
                return i;
            }
        }
        return -1;
    }
}

void delPerson(AddressBook *pBook) {
    string pname;
    cout << "请输入你要删除联系人的姓名:";
    cin >> pname;
    if (findPerson(pBook, pname) == -1) {
        cout << "该联系人不存在于通讯录中" << endl;
    } else {
        int index = findPerson(pBook, pname);
        //数据前移
        for (int i = index; i < pBook->size; i++) {
            pBook->p_array[i] = pBook->p_array[i + 1];
        }
        pBook->size--;
        cout << "删除成功！" << endl;
    }
}

void showPerson(AddressBook *pBook, int k) {
    if (k == -1) {
        if (pBook->size == 0) {
            cout << "当前通讯录为空！" << endl;
        } else {
            cout << "姓名\t性别\t年龄\t电话\t住址" << endl;
            for (int i = 0; i < pBook->size; i++)
                cout << pBook->p_array[i].name << "\t" << pBook->p_array[i].gender << "\t"
                     << pBook->p_array[i].age << "\t" << pBook->p_array[i].tel << "\t"
                     << pBook->p_array[i].address << endl;
        }
    } else {
        cout << "姓名\t性别\t年龄\t电话\t住址" << endl;
        cout << pBook->p_array[k].name << "\t" << pBook->p_array[k].gender << "\t"
             << pBook->p_array[k].age << "\t" << pBook->p_array[k].tel << "\t"
             << pBook->p_array[k].address << endl;
    }
}


void addPerson(AddressBook *pBook) {
    if (pBook->size == MAX) {
        cout << "温馨提示：通讯录已满，不能再次添加！" << endl;
        return;
    } else {
        //姓名、性别、年龄、联系电话、家庭住址
        cout << "姓名: ";
        cin >> pBook->p_array[pBook->size].name;

        cout << "性别(男/女): ";
        string sex;
        cin >> sex;
        if (sex == "男") {
            pBook->p_array[pBook->size].gender = "男";
        } else if (sex == "女") {
            pBook->p_array[pBook->size].gender = "女";
        } else {
            cout << "温馨提示：你的输入有误，默认为男性。";
            pBook->p_array[pBook->size].gender = "男";
        }

        cout << "年龄: ";
        cin >> pBook->p_array[pBook->size].age;

        cout << "电话: ";
        cin >> pBook->p_array[pBook->size].tel;

        cout << "住址: ";
        cin >> pBook->p_array[pBook->size].address;

        pBook->size++;
    }
}
