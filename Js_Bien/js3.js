let a, b;

do{
    a = +prompt("Nhập vào số a (Hãy nhập vào số):  ");
    b = +prompt("Nhập vào số b (Hãy nhập vào số):  ");
}while(isNaN(a) && isNaN(b));

if(a % b == 0){
    alert("True");
}else{
    alert("False");
}
