class Person
{
    constructor(fname,lname,)
    {
        this.fname=fname;
        this.lname=lname;
    }
}

function showData(flag, obj)
{
    if(flag == true)
    console.log(JSON.stringify(obj))

    else
    console.log(JSON.parse(obj))
     
}

var obj = new Person('Dhanraj','dhumal')
showData(true,obj)

var str='{"fname":"Dhanraj","lname":"dhumal"}';
showData(false,str)

