/**
 * @Author: Song-zy
 * @Date: 2021/11/5 14:50
 * @Description: ������ʦд��
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
    cout << "***** 1 �����ϵ�� *****" << endl;
    cout << "***** 2 ��ʾ��ϵ�� *****" << endl;
    cout << "***** 3 ɾ����ϵ�� *****" << endl;
    cout << "***** 4 ������ϵ�� *****" << endl;
    cout << "***** 5 �޸���ϵ�� *****" << endl;
    cout << "***** 6 �����ϵ�� *****" << endl;
    cout << "***** 7 �����Ļ   *****" << endl;
    cout << "***** 0 �˳�ͨѶ¼ *****" << endl;
    cout << "***********************" << endl;
    cout << "���������ѡ��(0~6): ";
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
                cout << "�����һ����ϵ�ˣ�" << endl;
                addPerson(&abs);
                break;
            case 2://��ʾ��ϵ��
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
                cout << "��ӭ�´�ʹ��ͨѶ¼������" << endl;
                return 0;
            default:
                break;
        }
    }
}

void updatePerson(AddressBook *pBook) {
    string pname;
    cout << "��������Ҫ�޸���ϵ�˵�����: ";
    cin >> pname;
    int index = findPerson(pBook, pname);
    if (index == -1) {
        cout << "����ϵ�˲����ڣ�" << endl;
    } else {
        cout << "����: ";
        cin >> pBook->p_array[index].name;

        cout << "�Ա�(��/Ů): ";
        string sex;
        cin >> sex;
        if (sex == "��") {
            pBook->p_array[index].gender = "��";
        } else if (sex == "Ů") {
            pBook->p_array[index].gender = "Ů";
        } else {
            cout << "��ܰ��ʾ�������������Ĭ��Ϊ���ԡ�";
            pBook->p_array[index].gender = "��";
        }
        cout << "����: ";
        cin >> pBook->p_array[index].age;

        cout << "�绰: ";
        cin >> pBook->p_array[index].tel;

        cout << "סַ: ";
        cin >> pBook->p_array[index].address;
        cout << "�޸ĳɹ���" << endl;
    }
}

int findPerson(AddressBook *pBook, string name) {
    if (name == " ") {
        string pname;
        cout << "��������Ҫ������ϵ�˵�����";
        cin >> pname;
        for (int i = 0; i < pBook->size; i++) {
            if (pBook->p_array[i].name == pname) {
                showPerson(pBook, i);
                return i;
            }
        }
        cout << "���޴��ˣ�" << endl;
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
    cout << "��������Ҫɾ����ϵ�˵�����:";
    cin >> pname;
    if (findPerson(pBook, pname) == -1) {
        cout << "����ϵ�˲�������ͨѶ¼��" << endl;
    } else {
        int index = findPerson(pBook, pname);
        //����ǰ��
        for (int i = index; i < pBook->size; i++) {
            pBook->p_array[i] = pBook->p_array[i + 1];
        }
        pBook->size--;
        cout << "ɾ���ɹ���" << endl;
    }
}

void showPerson(AddressBook *pBook, int k) {
    if (k == -1) {
        if (pBook->size == 0) {
            cout << "��ǰͨѶ¼Ϊ�գ�" << endl;
        } else {
            cout << "����\t�Ա�\t����\t�绰\tסַ" << endl;
            for (int i = 0; i < pBook->size; i++)
                cout << pBook->p_array[i].name << "\t" << pBook->p_array[i].gender << "\t"
                     << pBook->p_array[i].age << "\t" << pBook->p_array[i].tel << "\t"
                     << pBook->p_array[i].address << endl;
        }
    } else {
        cout << "����\t�Ա�\t����\t�绰\tסַ" << endl;
        cout << pBook->p_array[k].name << "\t" << pBook->p_array[k].gender << "\t"
             << pBook->p_array[k].age << "\t" << pBook->p_array[k].tel << "\t"
             << pBook->p_array[k].address << endl;
    }
}


void addPerson(AddressBook *pBook) {
    if (pBook->size == MAX) {
        cout << "��ܰ��ʾ��ͨѶ¼�����������ٴ���ӣ�" << endl;
        return;
    } else {
        //�������Ա����䡢��ϵ�绰����ͥסַ
        cout << "����: ";
        cin >> pBook->p_array[pBook->size].name;

        cout << "�Ա�(��/Ů): ";
        string sex;
        cin >> sex;
        if (sex == "��") {
            pBook->p_array[pBook->size].gender = "��";
        } else if (sex == "Ů") {
            pBook->p_array[pBook->size].gender = "Ů";
        } else {
            cout << "��ܰ��ʾ�������������Ĭ��Ϊ���ԡ�";
            pBook->p_array[pBook->size].gender = "��";
        }

        cout << "����: ";
        cin >> pBook->p_array[pBook->size].age;

        cout << "�绰: ";
        cin >> pBook->p_array[pBook->size].tel;

        cout << "סַ: ";
        cin >> pBook->p_array[pBook->size].address;

        pBook->size++;
    }
}
