'''
乘法口诀表
'''
for i in range(1, 10):
    for j in range(1, i + 1):
        print('%d x %d = %d\t' % (j, i, i * j), end='')
    print()
