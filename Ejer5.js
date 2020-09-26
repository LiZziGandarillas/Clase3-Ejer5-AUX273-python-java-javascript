process.stdin.on('data',function(data){
	var n=parseInt(data.toString());
	var nn=0, p=1;
	while(n>0)
	{
		var d=n%10;
		n=parseInt(n/10);
		if(d%2!=0)
		{
			nn=d*p+nn;
			p=p*10;
		}
	}
	console.log(nn);
	process.exit();
});
