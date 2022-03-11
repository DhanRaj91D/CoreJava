class Book{
constructor(bname,bcost)
{
    this.bname=bname;
    this.bcost=bcost;

    this.showDetails=function(){
        console.log(`the name of book is ${this.bname} and cost is ${this.bcost}`)
    }
}
// prototype of book class
showBookCost(){
    console.log(`the cost of book is ${thsi.cost}`)
}

}//end of class

var book =new Book('geeta',500)

//typeof shows type of clasas and prototype
console.log(typeof(book),typeof(Book.prototype))

//Object .gwtownproperty shows propertys of object
console.log(Object.getOwnPropertyNames(book),Object.getOwnPropertyNames(Book.prototype))

//U can set as much prototype you want
Book.prototype.dothis=function(){}
Book.prototype.dothat=function(){}

console.log(Object.getOwnPropertyNames(book),Object.getOwnPropertyNames(Book.prototype))
