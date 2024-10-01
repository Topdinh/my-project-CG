let Vatly;
let Hoahoc;
let Sinhhoc;

do{
    Vatly = +prompt("Nhập điểm Vật Lý (nhập số): ");
    Hoahoc = +prompt("Nhập điểm Hóa học (nhập số): ");
    Sinhhoc = +prompt("Nhập điểm Sinhhoc (nhập số): ");
}while(isNaN(Vatly,Hoahoc,Sinhhoc));

let TBC;
TBC = (Vatly + Hoahoc + Sinhhoc)/3;
alert("Điểm trung bình: "+TBC);