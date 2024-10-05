let danhSach = [];
let viTri = 0;
let newInformation;

function Add_new() {
    newInformation = document.getElementById("Contract").value;
    danhSach.push(newInformation);
    alert("Thông tin vừa nhập: " + danhSach[danhSach.length - 1] + "\n" + "Vị trí lưu trữ: " + (danhSach.length - 1));
    document.getElementById("Contract").value = "";
}

function Display_Information() {
    let gachngang = `<hr>`;
    for (let i = 0; i < danhSach.length; i++) {
        gachngang += "Vị trí = " + i + " Thông tin = " + danhSach[i] + "<br>";
    }
    document.getElementById("result").innerHTML = gachngang;
}
