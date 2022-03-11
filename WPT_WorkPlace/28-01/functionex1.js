// function f1()
// {
//     console.log('f1 is called');
// }

// f1()

// function f2(s)
// {
//     if(typeof(s.valueOf())=='string')
//     console.log(s.toUpperCase())
//     else
//     console.log('wrong parameter')
// }

// f2('ram')

// f2(new String('aaaa'))

// f2(50)


// function f3(a=1,b=5) // default parameter function in this if you give parameter then it take them otherwise it use default parameter 

// {
//     console.log(a+b)
// }

// f3()
// f3(5)
// f3(5,6)

// function f4(...a)//Rest parameter function you can give any numbers you want it is of array type 
                    //in rest function rest parameter should be lasrt formal parameter
// {
//     var sum=0
//     while(a.length>0)
//     {   
//         var x=a.pop()
//         sum+=x
//     }
//     console.log(sum) 
// }

// // f4(10,5,4)
// f4()
// f4(5,4,7,0)


//pass function to another function 

function f6(p,func)
{
    if(p<45)
    console.log(`hi value ${p} is smaller than 45`)

    else
    func(p)
}

// f6()

// f6(55,(k)=>{console.log(`you entered ${k} in argument`)}) //aroow type of function


// create a function saperately and pass it
// function temp(k)
// {
//     console.log(`You entered ${k} in argument`)
// }

// f6(56,temp)

function f7( langauge)
{
    function greet()
    {
        console.log("welcome")
    }

    if(langauge == 'EN')
    return greet

    let g=function(){console.log("namaste")} //anonimus function
    if(langauge=='HI')
    return g

    if(langauge=='TM')
    return ()=>{console.log('Vannakam')}
}

f7('EN')()

f7('HI')()

