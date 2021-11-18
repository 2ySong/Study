'''
要求：
    用户名：
        全为小写
        首字母不能是数字
        长度必须大于6
    手机号码：
        11位
        纯数字
    密码：
        6位
        纯数字
'''
# while True:
#     name = input('用户名: ')
#     if name[0].isdigit() or len(name) < 6 or not name.islower():
#         continue
#     else:
#         break
# while True:
#     tel = input('电话号码: ')
#     if not tel.isdigit() or not len(tel) == 11:
#         continue
#     else:
#         break
while True:
    name = input('用户名/电话: ')
    str = '用户名'
    if name.isdigit():
        tel = name
        str = '电话'
        if not tel.isdigit() or not len(tel) == 11:
            print('电话号码输入错误')
            continue
        else:
            break
    if name[0].isdigit() or len(name) < 6 or not name.islower():
        print('用户名输入错误')
        continue
    else:
        break

while True:
    pwd = input('密码: ')
    if not pwd.isdigit() or not len(pwd) == 6:
        continue
    else:
        break

print(str, '\t\t\t密码\n%s\t\t%s' % (name, pwd))
