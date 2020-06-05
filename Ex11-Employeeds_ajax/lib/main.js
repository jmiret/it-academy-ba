function allEmployeeds() {

    //alert('Getting data...');

    $.ajax({

        type: 'GET',
        url: "http://localhost:8080/employees",
        
        success: function(employees) {
            console.log(employees);
            $('#showData').html("");
            $.each(employees, function(i, employee) {
                $('#showData').append("<strong>ID:</strong> " + employee.id + "<br>");
                $('#showData').append("Name: " + employee.name + "<br>");
                $('#showData').append("Role: " + employee.role + "<br>");
                $('#showData').append("Salary: " + employee.salaryPerMonth + "€ <br><br>");
            });
        },

        error: function(error) {
            console.log("_ERROR: ", error);
        }

    });

}

function readerEmployee() {

    //alert('Getting data...');
   
    let employeeID = $('#employeeID').val();

    $.ajax({

        type: 'GET',
        url: "http://localhost:8080/employees/" + employeeID,
        //data: $("#registerSubmit").serialize(),

        success: function(employee) {
            console.log(employee);
            $('#showData').html("");

            $('#showData').append("<strong>ID:</strong> " + employee.id + "<br>");
            $('#showData').append("Name: " + employee.name + "<br>");
            $('#showData').append("Role: " + employee.role + "<br>");
            $('#showData').append("Salary: " + employee.salaryPerMonth + "€ <br><br>");
           
        },

        error: function(error) {
            console.log("_ERROR: ", error);
        }

    });

}

function createEmployee() {

    //alert('Adding data...');
   
    let data = {};

	//data["id"] = $("#employeeID").val();
    data["name"] = $("#name").val() + " " + $("#surname").val();
    data["role"] = $("#role").val();

    $.ajax({

        type: 'POST',
        //contentType: "application/x-www-form-urlencoded; charset=UTF-8", // this is the default value, so it's optional       
        contentType : 'application/json; charset=UTF-8',        
        url: "http://localhost:8080/employees",
        dataType: 'json',       
        data: JSON.stringify(data),

        success: function(data, status, jqxhr) {

        },

        error: function(error) {
            console.log("_ERROR: ", error);
        }

    });

}

function updateEmployee() {

    //alert('Updating data...');
   
    let employeeID = $("#employeeID").val();
    let data = {};

	data["name"] = $("#name").val() + " " + $("#surname").val();
    data["role"] = $("#role").val();

    $.ajax({

        type: 'PUT',        
        contentType : 'application/json; charset=UTF-8',        
        url: "http://localhost:8080/employees/" + employeeID,
        dataType: 'json',       
        data: JSON.stringify(data),

        success: function(data, status, jqxhr) {

        },

        //error: function(jqxhr, status, error) {
        error: function(error) {
            //console.log(status, error);
            console.log("_ERROR: ", error);
        }

    });

}

function deleteEmployee() {

    //alert('Deleting data...');
   
    let employeeID = $("#employeeID").val();
    
    $.ajax({

        type: 'DELETE',        
        contentType : 'application/json; charset=UTF-8',        
        url: "http://localhost:8080/employees/" + employeeID,
       
        success: function(data, status, jqxhr) {

        },

        error: function(error) {
            console.log("_ERROR: ", error);
        }

    });

}

function employeedsByRole() {

    //alert('Getting data...');

    let employeeRole = $('#role').val();

    $.ajax({

        type: 'GET',
        url: "http://localhost:8080/employeesByRole/" + employeeRole,
        
        success: function(employees) {
            console.log(employees);
            $('#showData').html("");
            $.each(employees, function(i, employee) {
                $('#showData').append("<strong>ID:</strong> " + employee.id + "<br>");
                $('#showData').append("Name: " + employee.name + "<br>");
                $('#showData').append("Role: " + employee.role + "<br>");
                $('#showData').append("Salary: " + employee.salaryPerMonth + "€ <br><br>");
            });
        },

        error: function(error) {
            console.log("_ERROR: ", error);
        }

    });

}