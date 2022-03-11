class shape {
    constructor(shname) {
        this.shname = shname;
        this.getName = function () {
            console.log(this.shname)
        }
    }//end of constructor

    static shapy() {
        console.log("shapy")
    }

    get shname() {
        return this._shname;
    }

    set shname(value) {

        if(value.length<4)
        alert("name is too short")

        else
        this._shname = value;
    }

    sayhi()
    {
        console.log("hi")
    }


}//end of class

// var s= new shape("Circle")

// s.getName()

// console.log(typeof(sayhi))
// console.log(Object.getOwnPropertyNames(s),Object.getOwnPropertyNames(shape.prototype))

shape.shapy()

class circle extends shape
{
    constructor(rm,rad){
        super(rm)
        this.radius=rad

        this.getName=function()
        {
            console.log(super.shname,this.radius)
        }
    }// end of constructor
}//end of class


var c= new circle('test', 4)

c.getName()


console.log(Object.getOwnPropertyNames(c),Object.getOwnPropertyNames(circle.prototype))