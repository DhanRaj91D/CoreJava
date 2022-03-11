// var d = new Date();

// console.log(d.getDate()+"-"+d.getMonth()+1+"-"+d.getFullYear())

// const indipendance=new Date(1947,7,15)

// console.log(indipendance)

// const re = new Date(1950,01,26)
// console.log(re)


const today = new Date()
const tomorro=new Date(2022,01,29)
tomorro.setHours(today.getHours())

let diff =tomorro-today

console.log(Math.round((((diff/1000)/60)/60)/24))