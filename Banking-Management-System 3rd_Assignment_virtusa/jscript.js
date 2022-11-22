function validate(){
    var name=document.myform.name.value;
    var number=document.myform.number.value;
    var address=document.myform.address.value;
    var email=document.myform.email.value;
    var age=document.myform.age.value;
    var j=false;

    if(name=="" || name.length<6){
        window.alert("name must be more than 6 characters");
        return false;
    }
    else if(number.length!=10){
        window.alert("Phone number length must be equal to 10 characters");
        return false;
    }
    else if(address=="" || address.length<5){
        window.alert("address need to be filled fully");
        return false;
    }
    else if(email=="" || email.length<11){
        window.alert("Email must be greater than 11 characters");
        return false;
    }
    else if(age<1){
        window.alert("Age must be greater than 1");
        return false;
    }
    else{
        for(let i=0;i<email.length;i++){
            if(email[i]=="@")
            j=true;
        }
    }
    if(!j){
        window.alert("email must contain @ character");
        return false;
    }
    else{
        return true;
    }
    
}