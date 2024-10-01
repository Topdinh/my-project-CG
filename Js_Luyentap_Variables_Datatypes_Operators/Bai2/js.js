let C;

do{
    C = +prompt("Nhập vào độ C (hãy nhập số):");
}while(isNaN(C));

let change;
change = C * (9/5) + 32;

alert("Sau khi chuyển đổi từ độ C sang F: " + change);