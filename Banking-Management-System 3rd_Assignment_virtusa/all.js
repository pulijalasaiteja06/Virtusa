function validate(){
    var acc=document.myform.acc.value;
    if(acc.length!=12){
        window.alert("Account number must be 12 digits long");
        return false;
    }
    else{
        return true;
    }
}
function validate1(){
    var acc=document.myform.acc.value;
    var acc1=document.myform.acc1.value;
    if(acc.length!=12){
        window.alert("Account number must be 12 digits long");
        return false;
    }
    else if(acc1.length!=12){
        window.alert("Account number must be 12 digits long");
        return false;
    }
    else {
        return true;
    }
}