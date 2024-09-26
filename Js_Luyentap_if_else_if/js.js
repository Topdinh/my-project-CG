let user = prompt("Who are you ?");
if(user == 'Admin'){
    let pass = prompt("Password: ");
    if(pass == TheMaster){
        alert("Welcome");
    }else{
        alert("Wrong password");
    }
}else{
    alert("I dont'n know you");
}