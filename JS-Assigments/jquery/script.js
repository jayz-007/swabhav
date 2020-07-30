$("h1").css("color","red");
$("h1").css("background-color","black");
$("h1").css("text-align","center");
$("img").attr("border","5px solid black");

$(document).ready(function(){
    $("#btn").click(function(){
        alert("Value : "+$("#input").val());
    });
});