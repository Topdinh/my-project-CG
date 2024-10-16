let array = [];

let numOfArray;

let newInformation01;

while(true){
    numOfArray = +prompt("Nhập độ dài array mà bạn muốn: ");
    if(isNaN(numOfArray) && numOfArray >= 0){
        alert("Bạn phải nhập số tự nhiên lớn hơn không để có thể tiếp tục thao tác, hãy nhập lại");
    }else{
        alert(`Độ dài mảng: ${numOfArray}`);
        break;
    }
}

for(let i = 0; i < numOfArray; i++){
    while(true){
        newInformation01 = +prompt(`Nhập phần tử (STT = ${i + 1})`);
        if(isNaN(newInformation01)){
            alert("Bạn chỉ có thể nhập số tự nhiên, Hãy nhập lại");
        }else{
            array.push(newInformation01);
            break;
        }
    }
}

let max;

for(let i = 0; i < numOfArray - 1; i++){
    let j;
    for(j = 1; j < numOfArray; j++){
        max = array[i];
        if(array[i] < array[j]){
            max = array[j];
        }
    }
    alert(`Phần tử lớn nhất Max = ${max}`);
    break;
}