// occurences ending with "bad"
let pattern1 = /bad/
//let pattern2 =/bad$/
//let pattern3 =/^bad/

 
var arr= ['ahmedabad','delhi','khultabad','badlapur','badni','aurangabad']

arr.filter((element)=>{
    return element.match(pattern1)
}).forEach((element)=>{console.log(element)})
 

//occurences ending with 3 digits
//let pattern4 = /[0-9]{3}$/


 //3 numbers preceded by 1 or more charachters
/* let pattern5= /[a-z A-Z]+[0-9]{3}$/

var arr= ['hellow123','1234567','678','re5tr34','rto09','row333','111rrrr444']

arr.filter((element)=>{
    return element.match(pattern5)
}).forEach((element)=>{console.log(element)})
  */

//valid email pattern
/* let emailpattern = /[a-zA-Z -_]+\@[a-z A-z]+\.[a-z A-Z]{3}$/
var arr= ['---@aaa.com','pra@gmail.org','pra_g@hotmail.com','pra@hotmail','pra__gre@ggg.vvv',"test@gov.in"]

arr.filter((element)=>{
    return element.match(emailpattern)
}).forEach((element)=>{console.log(element)})

 */


