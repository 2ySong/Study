# 逻辑运算符
a = 60  # 60 = 0011 1100
b = 13  # 13 = 0000 1101
c = 0

c = a & b  # 12 = 0000 1100
print("1 - c 的值为：", c)

c = a | b  # 61 = 0011 1101
print("2 - c 的值为：", c)

c = a ^ b  # 49 = 0011 0001
print("3 - c 的值为：", c)

c = ~a  # -61 = 1100 0011
print("4 - c 的值为：", c)

c = a << 2  # 240 = 1111 0000
print("5 - c 的值为：", c)

c = a >> 2  # 15 = 0000 1111
print("6 - c 的值为：", c)
print(5 or 1)#5
print(1 or 5)#1
print(True or False)#True
print(0 or 9)#9