
x = raw_input()
data = x.split(" ")

num1, num2 = data
alreadybookedroom = set()
for i in range(int(num2)):
    n = int(raw_input())
    alreadybookedroom.add(n)

found = False
for i in range(1, int(num1)+1):
    if i not in alreadybookedroom:
        print i
        found = True
        break

if not found:
    print 'too late'