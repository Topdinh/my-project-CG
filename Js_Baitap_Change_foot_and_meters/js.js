let changeTofoot;
let changeTometer;


function meterToFoot(meter){
    return changeTofoot = 3.279 * meter;
}

function footToMeter(foot){
    return changeTometer = 0.305 * foot;
}

while(true){
    let a = +prompt("Nhập vào foot: ");
    let b = +prompt("Nhập vào meter");
    if(isNaN(a)){
        alert("Lỗi, a không phải là số, hãy nhập lại !");
    }else if(isNaN(b)){
        alert("Lỗi, b không phải là số, hãy nhập lại !");
    }else{
        meterToFoot(b);
        footToMeter(a);
        document.writeln(`Foot = ${meterToFoot(b)} <br>`);
        document.writeln(`Meter = ${footToMeter(a)}`);
        break;
    }
}