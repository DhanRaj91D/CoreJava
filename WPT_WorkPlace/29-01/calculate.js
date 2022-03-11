function calculate(num1,num2,choice){

let prod;
var result;
if(choice == '+'){
result=parseInt(num1) + parseInt(num2);

}
if(choice == '*'){
    result=parseInt(num1) * parseInt(num2);
    
    }
    if(choice == '/'){
        result=parseInt(num1) / parseInt(num2);
        
        }
        if(choice == '-'){
            result=parseInt(num1) - parseInt(num2);
            
            }
            return result;
}

