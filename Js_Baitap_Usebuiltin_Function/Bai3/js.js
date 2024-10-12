let a;
let str;

while(true){
    a = prompt("Nhập vào chuỗi số bạn muốn (lưu ý chỉ nhập chuỗi số)");
    if(isNaN(a)){
        str = a.toString();
        alert(`Chuỗi hiện tại của bạn ${str}`);
        break;
    }else{
        alert("Lỗi/không phải số/hãy nhập lại");
    }
}

let up = 'QWERTYUIOPASDFGHJKLZXCVBNM';
let low = 'qwertyuiopasdfghjklzxcvbnm';

let result = [];

for (var x = 0; x < str.length; x++) {
    if (up.indexOf(str[x]) !== -1) {
      result.push(str[x].toLowerCase());
    }
    else if (low.indexOf(str[x]) !== -1) {
      result.push(str[x].toUpperCase());
    }
    else {
      result.push(str[x]);
    }
  }
document.write(result.join(''));
