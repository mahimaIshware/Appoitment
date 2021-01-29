
var baseAdminurl = "http://localhost:8080/admin";

function initAddUpdateData()
{                 
var Name= $("#Name").val();
var Age= $("#Age").val();
var DOB = $("#DOB").val();

var BloodGroup= $("#BloodGroup").val();
var Address = $("#Address").val();

var mobile_Number= $("#mobile_Number").val();
var email = $("#email").val();

var dateAppointment= $("#dateAppointment").val();
var customFile = $("#customFile").val();

            

	
	if(mobile_Number=="")
	{

   $("#mobile_Number").focus();
              $("#err_mobile_Number").show();
              $("#err_mobile_Number").html("<strong>Please enter mobile Number.");
              return false;
	}
	if(email=="")
	{
	    $("#email").focus();
				$("#err_email").show();
        $("#err_email").html("<strong>Please enter email</strong>");
        return false;
		
	}   
	  try{
	    xmlhttp = new XMLHttpRequest();
	  }catch(e)
	  {
	    try{
	      xmlhttp = new ActiveXObject("Msxml2.XMLHTTP");
	    }catch(e)
	    {
	      try {
	        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP")
	      } catch (e) {
	        alert("BROWSER BROKE");
	        return false;
	      }
	    }
	  }
  xmlhttp.open("POST",baseAdminurl+"/addData", true);
	xmlhttp.setRequestHeader('Content-type', 'application/json;charset=UTF-8');
  xmlhttp.setRequestHeader("Authorization", "Bearer" + localStorage.getItem("token"))
xmlhttp.onreadystatechange=function()
                {
                    if(xmlhttp.status == 0)
                    {
                        var message="request not initialized";
                        console.log("request not initialized");
                        alert("request not initialized");
                    }
                    else if(xmlhttp.status==200 && this.readyState == 4)
                    {
                        var meassgae="appointment is fixed";
                        //alert(meassgae);
                        console.log(meassgae);
                        
                         return true;
                    }
                    else{
                        console.log("Test!!");
                    }
                };
        
     
xmlhttp.send(JSON.stringify({"Name":Name,"Age":Age,"DOB":DOB,"BloodGroup":BloodGroup,"Address":Address,
"mobile_Number":mobile_Number,"email":email,"dateAppointment":dateAppointment,"customFile":customFile}));    
}
