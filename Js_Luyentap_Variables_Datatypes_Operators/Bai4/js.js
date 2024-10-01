let r;

do{
    r = +prompt("Nhập vào bán kính r (nhập số): ");
}while(isNaN(r));

let Perimeter;
Perimeter = 2 * 3.14 * r;

alert(`Diện tích hình tròn với r = ${r} là ` + Perimeter);
