function isThisPrime(check){
    if(check < 2){
        return `${check} không phải số nguyên tó`;     
    }
    for(let i = 2; i < Math.sqrt(check); i++){
        if(check % i === 0){                      
            return `${check} không phải số nguyên tố`;
        }
    }
    return `${check} là số nguyên tố`;
}

let contrack;

while(true){
    check = +prompt("Nhập vào số bạn muốn check (lưu ý chỉ nhập số)");
    if(isNaN(check)){
        alert("Đây không phải số, hãy nhập lại");
    }else if(check < 0){
        alert("Số cần check không hợp lệ");
    }else if(check === null){
        alert("Bạn chưa nhập liệu!");
    }
    else{
        alert(isThisPrime(check));
        break;
    }
}