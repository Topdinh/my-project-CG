let r;

do{
    r = +prompt("Nhập vào bán kính r (nhập số): ");
}while(isNaN(r));

let Area;
Area = 3.14 * r * r;

alert(`Diện tích hình tròn với r = ${r} là ` + Area);
