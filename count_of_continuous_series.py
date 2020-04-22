t=int(input())
l=list(map(int,input().split()))
a=[]
for i in range(1,len(l)):
    r=l[i]-l[i-1]
    a.append(r)
print(a)
t=[]
t.append(a[0])
for i in range(1,len(a)):
    if(a[i] != a[i-1]):
        t.append(a[i])
print(t)
print(t.count(1))