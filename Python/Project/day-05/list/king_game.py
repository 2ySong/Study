'''
王者荣耀管理系统
'''
king = [('李白', '男', '打野'), ('张飞', '男', '辅助'), ('嫦娥', '女', '法师')]
name = ''
gender = ''
work = ''
hero = (name, gender, work)
while True:
    print('''
✨✨✨-+-+-欢迎进入王者荣耀-+-+-✨✨✨
✨          1 添加角色            ✨
✨          2 删除角色            ✨
✨          3 修改角色            ✨
✨          4 查询角色            ✨
✨          5 显示所有角色         ✨
✨          0 退出系统            ✨
✨✨✨-+-+-+-+-+-+-+-+-+-+-+-+✨✨✨
    ''')
    select = int(input('请输入你的选择: '))
    if select == 1:
        name = input('姓名: ')
        gender = input('性别: ')
        work = input('职业: ')
        hero = (name, gender, work)
        king.append(hero)
        print('添加成功')
        # print(hero)
    if select == 2:
        name = input('请输入你要删除的角色名: ')
        yesNo = input('是否确认删除?(y/n): ')
        if yesNo == 'y':
            for i in range(len(king)):
                if king[i][0] == name:
                    king.pop(i)
                    print('删除成功')
                    break
            else:
                print('查无此英雄')
        else:
            print('取消删除')
    if select == 3:
        name = input('请输入你要修改的角色名: ')
        yesNo = input('是否确认修改?(y/n): ')
        if yesNo == 'y':
            for i in range(len(king)):
                if king[i][0] == name:
                    king.pop(i)
                    name = input('姓名: ')
                    gender = input('性别: ')
                    work = input('职业: ')
                    hero = (name, gender, work)
                    king.insert(i, hero)
                    print('修改成功')
                    break
            else:
                print('查无此英雄')
        else:
            print('取消修改')
    if select == 4:
        name = input('请输入你要查询的角色名: ')
        for i in range(len(king)):
            if king[i][0] == name:
                # print('角色信息如下:')
                print('''
✨-+-+-+角色信息如下+-+-+-✨
✨姓名-+-+-+性别-+-+-+职业✨
✨-+-+-+-+-+-+-+-+-+-+-+✨
✨%s\t\t%s\t\t%s✨
✨-+-+-+-+-+-+-+-+-+-+-+✨
                ''' % (king[i][0], king[i][1], king[i][2]))
                # print('姓名\t\t性别\t\t职业\n%s\t\t%s\t\t%s' % (king[i][0], king[i][1], king[i][2]))
                break
        else:
            print('查无此英雄')
    if select == 5:
        print('''
✨-+-+-+角色信息如下+-+-+-✨
✨姓名-+-+-+性别-+-+-+职业✨''')
        for i in range(len(king)):
            print('✨%s\t\t%s\t\t%s✨' % (king[i][0], king[i][1], king[i][2]))
        print('✨-+-+-+-+-+-+-+-+-+-+-+✨')
    if select == 0:
        print('退出系统，欢迎下次使用')
        break