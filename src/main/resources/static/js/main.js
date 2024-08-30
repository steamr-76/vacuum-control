$(function() {
	var ldr = 0;
	
	loadState();
	$("#powerbutton").click(toggleState);
	

	function toggleState() {
		enableLoader();
		changeState(function(state) {
			setButtonColorOnState(state);
			disableLoader();
		});
	}
	

	function loadState() {
		enableLoader();
		requestState(function(state) {
			setButtonColorOnState(state);
			disableLoader();
		});
	}
	

	function setButtonColorOnState(state) {
		if(state) {
			$("#bigButton").addClass("round-button-circle-on");
			$("#bigButton").removeClass("round-button-circle-off");
			$("#powerbutton").text("turn Off");
		} else {
			$("#bigButton").addClass("round-button-circle-off");
			$("#bigButton").removeClass("round-button-circle-on");
			$("#powerbutton").text("turn On");
		}
	}
		
	function changeState(fnc) {
		sendAjaxCall("POST", "/vacuum/state", function(data) {
			fnc(data.on);
		});
	}

	function requestState(fnc) {
		sendAjaxCall("GET", "/vacuum/state", function(data) {
			fnc(data.on);
		});
	}

	function sendAjaxCall(method, url, okFn) {
		enableLoader();
		$.ajax({
			method: method,
	  		url: url
		}).done(function(data) {
			disableLoader();
			okFn(data);
		}).fail(function(data) {
			showError();
		});
	}

	
	function showError() {
		ldr = 0;

		$("#error").show();
		$("#document").hide();
		$("#loader").hide();
	}
	
	function enableLoader() {
		ldr ++;
		
		$("#loader").show();
		$("#document").hide();
	}
	
	function disableLoader() {
		ldr --;
		
		if(ldr==0) {
			$("#loader").hide();
			$("#document").show();
		}
	}
});
