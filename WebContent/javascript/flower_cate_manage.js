/**
 * 
 */



function addConfirm(){
	var flowerCatetextField=document.getElementById("flowerCateTextField");
	var flowerCate=flowerCatetextField.value;
	if(flowerCate!=""){
		return true;
	}
	return false;
}

function calcPageHeight(doc) {
    var cHeight = Math.max(doc.body.clientHeight, doc.documentElement.clientHeight)
    var sHeight = Math.max(doc.body.scrollHeight, doc.documentElement.scrollHeight)
    var height  = Math.max(cHeight, sHeight)
    return height;
}

var ifr = document.getElementById('ifr')
ifr.onload = function() {
    var iDoc = ifr.contentDocument || ifr.document
    var height = calcPageHeight(iDoc)
    ifr.style.height = height + 'px'
}

