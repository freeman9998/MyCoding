
var xhr = null;

function getXMLHttpRequest() {
	if(window.XMLHttpRequest){
		return new XMLHttpRequest();
	}else{
		return null;
	}
	return null;
}


function sendRequest(url, params, callback, method) {
	xhr = window.getXMLHttpRequest();
	var httpMethod = method ? method : 'GET';
	if (httpMethod != 'GET' && httpMethod != 'POST') {
		httpMethod = 'GET';
	}
	var httpParams = (params == null || params == '') ? null : params;
	var httpUrl = url;
	if (httpMethod == 'GET' && httpParams != null) {
		httpUrl = httpUrl + "?" + httpParams;
	}
	xhr.open(httpMethod, httpUrl, true);
	xhr.setRequestHeader(
		'Content-Type', 'application/x-www-form-urlencoded');
	xhr.onreadystatechange = callback;
	xhr.send(httpMethod == 'POST' ? httpParams : null);
}
