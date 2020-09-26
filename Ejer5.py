n=int(input())
nn=0
p=1
while n>0:
	d=n%10
	n=n//10
	if d%2!=0:
		nn=d*p+nn
		p=p*10
print(nn)
