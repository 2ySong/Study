import random

numbers = []
for i in range(8):
    numbers.append(random.randint(-5, 10))
numbers.sort()
print('初始随机列表:',numbers)
num = int(input('请输入一个数: '))
numbers.append(num)
numbers.sort()
print(numbers)
