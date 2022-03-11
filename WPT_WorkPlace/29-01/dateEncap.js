class MyDate
{
    constructor(d,m,y)
    {
        this.day=d;
        this.month=m;
        this.year=y;
    }
    get day()
    {
        return this._day;
    }
    set day(value)
    {
        if(value>=1 && value<=31)
        this._day=value;

        else
        console.log('day cannot be set invalid day')
    }

    showDate()
    {
        console.log(`${this.day}-${this.month}-${this.year}`)
    }

}// end of class


var d= new MyDate(32,11,2022)
d.showDate()