let BangcuuChuong = document.getElementById('BangCC');

let tableHTML = '<table>';

for (let i = 2; i <= 9; i++) {
  tableHTML += '<tr>';
  for (let j = 1; j <= 10; j++) {
    tableHTML += `<td>${i} x ${j} = ${i * j}</td>`;
  }
  tableHTML += '</tr>';
}

tableHTML += '</table>';

BangcuuChuong.innerHTML = tableHTML;

