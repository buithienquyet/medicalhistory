/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function getFaculties()
{
    $.ajax({
        type: "GET",
        url: "/faculties",
        dataType: 'json',
        data: {},
        success: function (data) {
            let list = '';
            
            if (data && data.length)
            {
                for (let item of data)
                {
                    list += `<option value = "${item.id}"> ${item.name} </option>`;
                }
            }
            
            $('#txtFaculty').html(list);

        },
        error: function (error) {
            
        },
    });
}

getFaculties();


$('#txtFaculty').on('change', function() {
    let facultyId = this.value;
    
     $.ajax({
        type: "GET",
        url: "/rooms",
        dataType: 'json',
        data: {
            faculty_id : facultyId,
            type: 'diagnose'
        },
        success: function (data) {
            let list = '';
            
            if (data && data.length)
            {
                for (let item of data)
                {
                    list += `<option value = "${item.roomId}"> ${item.name} </option>`;
                }
            }
            
            $('#txtRoom').html(list);

        },
        error: function (error) {
            $('#txtRoom').html('');
        },
    });
    
});

$("#btnRegistry").click(function () {
    let faculty = $("#txtFaculty").val();
 //   console.log(faculty);
    let reason = $("#txtReason").val();
 //   console.log(reason);
    let date = $("#txtDate").val();
 //   console.log(date);
    let pathologicalProcess = $("#txtPathologicalProcess").val();
 //   console.log(pathologicalProcess);
    let story = $("#txtStory").val();
    let roomId = $("#txtRoom").val();
 //   console.log(story);
    
    $.ajax({
        type: "POST",
        url: "/registrations",

        data: {faculty: faculty, reason: reason, date: date, pathologicalProcess: pathologicalProcess, story: story, roomId: roomId},
        success: function (msg) {

            if (msg == "ok") {
                alert("Đăng ký thành công");
                $('#modal-dat-lich-kham').modal('hide');
                
            } else {
                alert("Đăng ký không thành công");
            }
        },
        error: function (error) {
            alert("Đăng ký không thành công");
        },
    });

});
