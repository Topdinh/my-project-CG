let array = ["Topdinh", 12931, "No1", "1231", 3242];

let first = 0;
let last = array.length - 1;
let theThan;

while(first<last){
    theThan = array[first];
    array[first] = array[last];
    last = theThan;

    first ++;
    last --;
}

document.write(array);