var todos = [];

function addElement(){
	
	
	
		var li = document.createElement("li");
		var text = document.getElementById("InputBox").value;
		var t = document.createTextNode(text);
		li.appendChild(t);
		if(text === ''){
			alert("You must type something")
		}
		else{
		document.getElementById("myUL").appendChild(li);
		todos.push(text);
		document.getElementById("InputBox").value="";
		 var btn = document.createElement("BUTTON"); 
    btn.className = "close";  
    btn.innerHTML = " x ";
    
    btn.onclick = function(){
      var li = this.parentElement;
      
      
      
     
      li.remove();
      deleteElement(this);
     
      
    };
    li.appendChild(btn);  
		alert(todos);
	}
	
}

function deleteElement(todos){
delete.todos(todos);
}
