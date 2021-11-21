# def sum(num1, num2):
#     return num1 + num2


def calculate(num1, num2, str):
    if str == '+':
        return num1 + num2
    if str == '-':
        return num1 - num2
    if str == '*':
        return num1 * num2
    if str == '/':
        return num1 / num2
    else:
        return 0


a = 23
b = 67
# print(sum(a, b))
print('%d + %d = %d' % (a, b, calculate(a, b, '+')))
print('%d - %d = %d' % (a, b, calculate(a, b, '-')))
print('%d × %d = %d' % (a, b, calculate(a, b, '*')))
print('%d ÷ %d = %.2f' % (a, b, calculate(a, b, '/')))
print('%d ÷ %d = %.2f' % (a, b, calculate(a, b, 'p')))
