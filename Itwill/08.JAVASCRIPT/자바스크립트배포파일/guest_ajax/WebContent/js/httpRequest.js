var xhr = null;
function getXMLHttpRequest() {
	
	if (window.XMLHttpRequest) {
		return new XMLHttpRequest();
	} else {
		return null;
	}
}
function sendRequest(url, params, callback, method,event) {
	xhr = getXMLHttpRequest();
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
	//xhr.withCredentials = true;
	//xhr.setRequestHeader("Content-Type", "text/plain;charset=UTF-8");
	xhr.setRequestHeader(
		'Content-Type', 'application/x-www-form-urlencoded');
	
	xhr.onreadystatechange = function(){
		callback(event);
	};
	xhr.send(httpMethod == 'POST' ? httpParams : null);
}
