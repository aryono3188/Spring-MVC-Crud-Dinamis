var d = Date();
document.getElementById("demo").innerHTML = d;

date = new Date();
// millisecond = date.getMilliseconds();
detik = date.getSeconds();
menit = date.getMinutes();
jam = date.getHours();
arrhari = ["Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"];
hari = date.getDay();
tanggal = date.getDate();
arrbulan = ["Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"];
bulan = date.getMonth();
tahun = date.getFullYear();
document.write(arrhari[hari] + "," + tanggal + "-" + arrbulan[bulan] + "-" + tahun + ". " + jam + " : " + menit + " : " + detik);