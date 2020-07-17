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
		todos.push(text+" x ")
		document.getElementById("InputBox").value="";
		var btn = document.createElement("BUTTON"); 
        btn.className = "close";    
         btn.innerHTML = " x ";
         
    
    btn.onclick = function(){
      deleteElement(this.parentElement);     
    };

    li.appendChild(btn);  
		alert(todos);
	}
	
}

function deleteElement(li){

	var text = li.textContent;
	li.remove();
	for(var i =0;i<todos.length;i++){
		
	
		if(todos[i]===text){
			todos.splice(i,1);
			
			
		}
	}
   
}
