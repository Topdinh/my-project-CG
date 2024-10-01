let total = 0;
let a;
do{
    while(isNaN(a) || a != -1){
        a = +prompt("Nhập vào một số (nếu nhập -1 sẽ không nhập thêm số)");
        alert(a);
        total += a;
        alert(`Total = ${total}`);
    }
    if(a = -1){
        break;
    }
}while(true);