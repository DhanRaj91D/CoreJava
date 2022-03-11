// created class using function

// function student(roll,name,dob)
// {
//     this.roll=roll;
//     this.name=name;
//     this.dob=dob;
// }

//prottype created 
// student.prototype.getDetails= function(){
//     return this.name+" "+this.dob+" "+this.roll
// }

// var s1= new student(1,'dhanraj','16-05-1998')


// console.log(s1.getDetails())


//prototype chaning all object get chained 

let obj = {name:'prachi',city:'pune' }
let pro = {age:45,qualification:'ME'}
let pro2 = {hobby:'sleeping'}
Object.setPrototypeOf(obj,pro)
Object.setPrototypeOf(pro,pro2)

console.log(obj.address,obj.hobby ,obj.qualification,obj.name)
