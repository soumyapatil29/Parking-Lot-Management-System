$( document ).ready(function() {
var listCustomers = [];
	ajaxGet();
	// GET REQUEST
	$("#getAllCustomersBtnId").click(function(event){
		
		
	});
	
	// DO GET
	function ajaxGet(){
		$.ajax({
			type : "GET",
        	url: "data",
			success: function(result){
					var custList = "";
					$.each(result, function(i, statusDto){
						var customer = "Lot Number: " + statusDto.lotNumber + 
						",  Registration Plate: " + statusDto.registrationPlate +
						",  Colour: " + statusDto.color +
						",  Arrival Time: "+statusDto.arrivalTime;
						
						listCustomers.push(custList);
						$('#resultGetAllCustomerDiv .list-group').append("<li>" + customer + "</li>");
						});
					
					// just re-css for result-div
					$('#resultGetAllCustomerDiv').css({'background-color':'#D16953', 'color':'black', 'padding':'20px 20px 5px 30px'});
			}
		});
	}
})