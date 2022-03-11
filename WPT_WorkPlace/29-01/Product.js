class Product{

    constructor(productName, cost , expiryDate){

        this.ProductName=productName;
        this.cost=cost;
        this.expiryDate=expiryDate;
        
    }//End of constructor

    get ProductName()
    {
        return this._Productname;
    }

    set ProductName(value)
    {
        if(value.length>30)
        console.log('productName should not be more than 30 chars')

        else
        this._Productname=value;
    }

    get cost()
    {
        return this._cost;
    }

    set cost(value)
    {
        if(value<0)
        console.log('cost should not be negative')

        else
        this._cost=value;
    }

    get expiryDate()
    {
        return this._expiryDate;
    }

    set expiryDate(value)
    {
         if(value< new Date(2000,0,1))
         console.log('product is expired')

         else
        this._expiryDate=value;
    }

    showDetails()
    {
        console.log(`Product name: ${this._Productname}, Cost: ${this._cost}, ExpiryDate: ${this._expiryDate.getDate()+"-"+this._expiryDate.getMonth()+"-"+this._expiryDate.getFullYear()}`)
    }
}//end of class

var prod=new Product('maggi',50,new Date(2022,11,12));
prod.showDetails();