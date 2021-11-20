function checkUsername() {
    var usename = al.varlue;
    if (usename.length < 5) {
        elMsg.className ='warning';
        elMsg.texContent = 'Not long enough, yet...';
    } else {
        elMsg.texContent ='';
    }
}
 function tipUsername() {
     elMsg.className = 'tip'
     elMsg.innerHTML = 'Usename must be at least 5 characters';
 }
  
var el = document.getElementById('username');
var elMsg = document.getElementById('feedback');

el.addEventListener('focus', tipUsername, false);
el.addEventListener('blur', checkUsername, false);