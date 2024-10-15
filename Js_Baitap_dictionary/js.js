let NameDinhNghia = [];
let Ynghia = [];

let newInformation01;
let newInformation02;

function Add_new(){               // Hàm thêm mới phần tử vào mảng (2 mảng)
    newInformation01 = document.getElementById("New_name01").value;
    newInformation02 = document.getElementById("New_name02").value;
        // Lệnh if này để check xem người dùng có điền đầy đủ 2 ô hay không
        if(newInformation01 === ""){
            alert("Bạn chưa điền dữ liệu vào ô 'Tên định nghĩa'");
        }else if (newInformation02 === ""){
            alert("Bạn chưa điền dữ liệu vào ô 'Ý nghĩa'");           
        }else if(NameDinhNghia.includes(newInformation01)){     // lệnh if này để kiểm tra xem dữ liệu truyền vào có trùng lặp với những dữ liệu có sẵn không
            alert("Phát hiện dữ liệu trùng lặp, không thể thêm vào danh sách");
            return;
        }else{
            NameDinhNghia.push(newInformation01);
            document.getElementById("New_name01").value = "";
            Ynghia.push(newInformation02);
            document.getElementById("New_name02").value = "";
    
            alert("Thông tin đã được thêm mới !");
        }
}
function Display_Information(){     // Hàm hiện thị danh sách vừa thêm
    let gachngang = `<hr>`;
    for (let i = 0; i < NameDinhNghia.length; i++){
        gachngang += (i + 1) + "." + NameDinhNghia[i] + " " + ":" + " " + Ynghia[i] + `<br>`;
    }
    document.getElementById("result").innerHTML = gachngang;
}

function search() {                 // Hàm tìm kiếm
    let searchInput = document.getElementById("search-input").value.toLowerCase();
    let resultContainer = document.getElementById("result");
    let results = [];

    for (let i = 0; i < NameDinhNghia.length; i++) {
        if (NameDinhNghia[i].toLowerCase().includes(searchInput)) {         // lệnh includes() là lệnh tìm các chuỗi có chứa từ khóa 
            results.push(NameDinhNghia[i]);
        }
    }

    if (results.length > 0) {
        resultContainer.innerHTML = `<h3>Kết quả tìm kiếm:</h3>` + results.join("<br>");
    } else {
        resultContainer.innerHTML = `<h3>Không tìm thấy kết quả nào.</h3>`;
    }
}
