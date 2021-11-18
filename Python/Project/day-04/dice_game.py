'''
    掷色子游戏乘法口诀
'''
import random

coins = 0
while True:
    win = ''
    if coins >= 5:
        yesGame = input('''
+-+-+-+-+-+-+-+-+-+-+-+-+
|                  😄x%d|
+   开始游戏: y          +
|   退出游戏: n          |
+-+-+-+-+-+-+-+-+-+-+-+-+       
    请输入你的选择: ''' % coins)
        if yesGame == 'n':
            print('游戏结束')
            break
        if yesGame == 'y':
            print('游戏开始: 一局游戏5个金币，获胜得7个金币，失败扣3个金币')
            coins -= 5
            ran1 = random.randint(1, 6)
            ran2 = random.randint(1, 6)
            guess = input('请猜大小(B/S): ')
            if (guess == 'B' and ran1 + ran2 > 6) or (guess == 'S' and ran1 + ran2 <= 6):
                win = '胜利'
                coins += 7
            else:
                win = '失败'
                coins -= 3
            print('''
+-+-+-+-+-+-+-+-+-+-+
|   游戏结果: %s    |
+       色子1: %d点   +
|       色子2: %d点   |
+-+-+-+-+-+-+-+-+-+-+
            ''' % (win, ran1, ran2))

    else:
        print('金币不够，需要充值')
        while True:
            addCoins = int(input('请输入你要充值的金币数(一元=一币, 充值金额只能是10的整数倍):'))
            if addCoins % 10 != 0:
                addCoins = 0
                print('失败：充值不符合规范！！')
            else:
                coins += addCoins
                yesNo = input('是否继续冲值?(y/n):')
                if yesNo == 'y':
                    print('请继续充值')
                    continue
                else:
                    print('充值结束，你现在的金币余额为: %d' % coins)
                    break
