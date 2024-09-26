let login = prompt("Nhập dữ liệu: ");

let message = (login == 'Employee') ? 'Hello' : (login == 'Director') ? 'Greetings' : (login == '') ? 'No login' : '';

alert(message);