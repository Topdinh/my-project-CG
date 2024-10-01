let Witdth;
let Height;

do{
    Witdth = +prompt("Nhập vào chiều dài (nhập vào số) ");
    Height = +prompt("Nhập vào chiều rộng (nhập vào số) ");
}while(isNaN(Witdth, Height));

let Acreage;
Acreage = Witdth * Height;
alert(Acreage);
