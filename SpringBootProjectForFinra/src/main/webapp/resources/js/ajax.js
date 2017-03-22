
function categorySubmit() {
	var dataToSend = $('#department').val();

	$.ajax({

				type : 'GET',
				url : '/showStudentDetails/' + dataToSend,
				dataType : "json",
				contentType : 'application/json', 
				success : function(data) {
					$("#result").empty();
					var t = $("<br><table style='border: 1px solid black;'></table>");
					t
							.append("<tr  style='border: 1px solid black;'><th>Name</th><th>Department</th><th>Average</th></tr>");

					for (var i = 0; i < data.length; i++) {
						var a = $("<tr  style='border: 1px double black; padding: 2px; '></tr>")
						a.append("<td>" + data[i].name + "</td>");
						a.append("<td>" + data[i].department + "</td>");
						a.append("<td>" + data[i].average + "</td>");
						t.append(a);
					}
					$("#result").append(t);

					$('#result').show();
				},
				error : function(errorObject) {
					alert("No data Found");
				}

			});
}
