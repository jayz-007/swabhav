

	function addElement() {
  var li = document.createElement("li");
  var inputValue = document.getElementById("InputBox").value;
  var t = document.createTextNode(inputValue);
  li.appendChild(t);
  if (inputValue === '') {
    alert("You must write something!");
  } else {
    document.getElementById("myUL").appendChild(li);
    document.getElementById("InputBox").value = "";
    var btn = document.createElement("BUTTON"); 
    btn.className = "close";  
    btn.innerHTML = " x ";
    
    btn.onclick = function(){
      var li = this.parentElement;
      li.remove();
    };
    li.appendChild(btn);  
    todoList.push(li);  

  
 }
}


function deleteElement(){
 var li = this.parentElement;
 li.remove();
    
}



