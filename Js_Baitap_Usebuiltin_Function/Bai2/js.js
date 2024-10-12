let a;
let str;

while(true){
    a = +prompt("Nhập vào chuỗi số bạn muốn (lưu ý chỉ nhập chuỗi số)");
    if(isNaN(a)){
        alert("Lỗi/không phải số/hãy nhập lại");
    }else{
        str = a.toString();
        alert(`Chuỗi hiện tại của bạn ${str}`);
        break;
    }
}

let result = [str[0]];
let i;
for(i = 0; i < str.length; i++){
    if(str[i -1] % 2 === 0 && str[i] % 2 === 0){
        result.push("-", str[i]);
    }else{
        result.push(str[i]);
    }
}
document.write(result.join(''));
