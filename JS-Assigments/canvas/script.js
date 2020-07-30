var canvasElement = document.querySelector("canvas");
canvasElement.width = window.innerWidth;
canvasElement.height = window.innerHeight;

var item = canvasElement.getContext("2d");
item.fillStyle = "rgba(255,0,0,0.5)";
item.fillRect(100,100,100,100);
item.fillStyle = "rgba(0,255,0,0.5)";
item.fillRect(400,100,100,100);
item.fillStyle = "rgba(0,0,255,0.5)";
item.fillRect(300,300,100,100);

// Line
item.beginPath();
item.moveTo(50,300);
item.lineTo(300,100);
item.lineTo(400,300);
item.strokeStyle = "#fa34a3";
item.stroke();

// Arc / Circle
for(var i=0 ; i<4; i++){
	var x = Math.random() * window.innerWidth;
	var y = Math.random() * window.innerHeight;
	item.beginPath();
	item.arc(x,y,30,0,Math.PI * 2,false);
	item.strokeStyle = "red";
	item.stroke(); 
}