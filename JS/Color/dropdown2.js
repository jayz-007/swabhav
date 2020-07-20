var colors = ["Red","Green","Black"];
		for(var i = 0;i<colors.length;i++){
			var element = document.createElement("a");
		element.innerHTML = colors[i];
	    element.id = colors[i];
		element.addEventListener("click",ChangeColor,false);
		var menu = document.getElementById("dropdown-content");
		menu.appendChild(element);
		}
		function ChangeColor() {
			var id = this.id;
			var body = document.querySelector("body");
			if(id===colors[0])
				body.style.backgroundColor = "#db3d3d";
	        if (id===colors[1]) 
		      body.style.backgroundColor = "#00FF00";
		   if (id===colors[2]) 
		      body.style.backgroundColor = "Black";
		}