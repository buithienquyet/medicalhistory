/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$("#btnRegistry").click(function () {
    let faculty = $("#txtFaculty").val();
    console.log(faculty);
    let reason = $("#txtReason").val();
    console.log(reason);
    let date = $("#txtDate").val();
    console.log(date);
    let pathologicalProcess = $("#txtPathologicalProcess").val();
    console.log(pathologicalProcess);
    let story = $("#txtStory").val();
    console.log(story);
    $.ajax({
        type: "POST",
        url: "/registrations",

        data: {faculty: faculty, reason: reason, date: date, pathologicalProcess: pathologicalProcess, story: story},
        success: function (msg) {

            if (msg == "ok") {
                alert("ok");
            } else {
                alert("khong thanh cong");
            }
        },
        error: function (error) {
            alert("khong thanh cong");
        },
    });

});
