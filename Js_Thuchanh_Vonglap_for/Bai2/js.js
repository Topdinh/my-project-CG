let khaiBao = prompt("Nhập vào số bất kỳ: ");
let i;
let total = 0;
for(i = 1; i <= khaiBao; i++){
    total += i; 
}
document.getElementById("b2For").innerHTML = total;