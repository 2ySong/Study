/**
 * @Author: Song-zy
 * @Date: 2021/11/4 20:01
 * @Description: ͨѶ¼����ϵͳ
 * �������Ա����䡢��ϵ�绰����ͥסַ
 */
#include "iostream"

using namespace std;
//������ϵ�˽ṹ��
struct contact {
    string name;
    bool gender;//true�У�falseŮ
    int age;
    long long tel;
    string address;
};

//�˵�����
void showMenu();

//1.�����ϵ�˹���
void addContact(contact *con);

//2.��ʾ��ϵ��
void showContact(contact cons[], int len, int index);

//3 ɾ����ϵ��
void removeContact(contact cons[], int len);

//4 ������ϵ��
void findContact(contact cons[], int len);

//5 �޸���ϵ��
void updateContact(contact cons[], int len);

//6 �����ϵ��
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
                cout << "�����һ����ϵ�ˣ�" << endl;
                addContact(&cons[i]);
                i++;
                break;
            case 2://��ʾ��ϵ��
                cout << "������ϵ����Ϣ���£�" << endl;
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
                cout << "��ӭ�´�ʹ��ͨѶ¼������" << endl;
                return 0;
            default:
                break;
        }
    }
    return 0;
}

void showMenu() {
    cout << "***********************" << endl;
    cout << "***** 1 �����ϵ�� *****" << endl;
    cout << "***** 2 ��ʾ��ϵ�� *****" << endl;
    cout << "***** 3 ɾ����ϵ�� *****" << endl;
    cout << "***** 4 ������ϵ�� *****" << endl;
    cout << "***** 5 �޸���ϵ�� *****" << endl;
    cout << "***** 6 �����ϵ�� *****" << endl;
    cout << "***** 0 �˳�ͨѶ¼ *****" << endl;
    cout << "***********************" << endl;
    cout << "���������ѡ��(0~6): " << endl;
}

//1.�����ϵ�˹���
void addContact(contact *con) {
    //�������Ա����䡢��ϵ�绰����ͥסַ
    cout << "����: " << endl;
    cin >> con->name;

    cout << "�Ա�(1:��/0:Ů): " << endl;
    cin >> con->gender;

    cout << "����: " << endl;
    cin >> con->age;

    cout << "�绰: " << endl;
    cin >> con->tel;

    cout << "סַ: " << endl;
    cin >> con->address;
}

//2.��ʾ��ϵ��
void showContact(contact cons[], int len, int index) {
    cout << "����\t�Ա�\t        ����\t  �绰\t  סַ" << endl;
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

//3 ɾ����ϵ��
void removeContact(contact cons[], int len) {
    string s;
    contact c;
    cout << "��������Ҫɾ�����˵�����: " << endl;
    cin >> s;
    cout << endl;
    for (int i = 0; i < len; i++) {
        if (s == cons[i].name) {
            cons[i] = c;
            break;
        }
    }
}

//4 ������ϵ��
void findContact(contact cons[], int len) {
    cout << "��������Ҫ�����˵�����: " << endl;
    string s;
    cin >> s;
    for (int i = 0; i < len; i++) {
        if (s == cons[i].name) {
            showContact(cons, i + 1, i);
            break;
        }
    }
}

//5 �޸���ϵ��
void updateContact(contact cons[], int len) {
    cout << "��������Ҫ�޸���ϵ�˵�����: " << endl;
    string s;
    cin >> s;
    for (int i = 0; i < len; i++) {
        if (s == cons[i].name) {
            addContact(&cons[i]);
        }
    }
}

//6 �����ϵ��
void clearContact(int *len) {
    while (true) {
        cout << "��ȷ�������ϵ����(y/n): " << endl;
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