<!DOCTYPE html>
<html>

    <%@include file="./partial/header.jsp"%>        

    <body class="hold-transition skin-blue sidebar-mini">
        <link rel="stylesheet" href="bower_components/datatables.net-bs/css/dataTables.bootstrap.min.css">

        <div class="wrapper">
            <%@include file="./partial/userinfo.jsp"%>
            <!-- Left side column. contains the logo and sidebar -->
            <aside class="main-sidebar">
                <!-- sidebar: style can be found in sidebar.less -->
                <section class="sidebar" style="height: auto;">
                    <ul class="sidebar-menu tree" data-widget="tree">
                        <li>
                            <a href="/admin-user-list.jsp">
                                <span>Danh sách tài khoản</span>
                            </a>
                        </li>                    
                    </ul>
                </section>
                <!-- /.sidebar -->
            </aside>

            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">


                <section class="content">
                    <div class="box box-default">
                        <div class="box-header with-border" style="padding-bottom: 0px;">
                            <!--                            <div class="row">
                                                            <div class="col-md-3">
                                                                <div class="form-group">
                                                                    <label>Ngày</label>
                                                                    <span class="desc"> </span>
                                                                    <input type="text" class="form-control pull-right" id="datepicker">
                                                                </div>
                                                            </div>
                                                            <div class="col-md-3">
                                                                <div class="form-group">
                                                                    <label>Trạng thái</label>
                                                                    <span class="desc"> </span>
                                                                    <select class="form-control">
                                                                        <option>Đang đợi</option>
                                                                        <option>Lỡ hẹn</option>
                                                                    </select>
                                                                </div>
                                                            </div>
                                                            <div class="col-md-3">
                                                                <div class="form-group">
                                                                    <label>Sắp xếp</label>
                                                                    <span class="desc"> </span>
                                                                    <select class="form-control">
                                                                        <option>Tên bệnh nhân</option>
                                                                        <option>Thời gian</option>
                                                                    </select>
                                                                </div>
                                                            </div>
                                                            <div class="col-md-3">
                                                                <div class="form-group">
                                                                    <label>&nbsp;</label>
                                                                    <span class="desc"> </span>
                                                                    <button class="btn btn-default form-control">Tìm kiếm</button>
                                                                </div>
                                                            </div>
                            
                                                        </div>-->
                            <div class="col-md-3">
                                <div class="form-group">
                                    <label>&nbsp;</label>
                                    <span class="desc"> </span>
                                    <button id="btnAdd" class="btn btn-default form-control">Thêm tài khoản</button>
                                </div>
                            </div>

                        </div>
                        <!-- /.box-header -->
                        <div class="box-body">                           
                            <table id ="tblUserList" class = "table table-bordered table-hover">
                                <thead>
                                    <tr>
                                        <th>Tài khoản</th>
                                        <th>Họ</th>
                                        <th>Tên</th>
                                        <th>Địa chỉ</th>
                                        <th>Số điện thoại</th>                                       
                                    </tr>
                                </thead>
                                <tbody>

                                </tbody>
                            </table>
                        </div>
                        <!-- /.box-body -->
                    </div>

                    <div class="modal" id="modalAdd" tabindex="-1" role="dialog">
                        <div class="modal-dialog" role="document">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                    <h3 class="modal-title">Thêm tài khoản</h3>
                                </div>
                                <div class="modal-body">
                                    <div class="row">
                                        <div class="col-md-12">
                                            <div class="form-group">
                                                <label>1.  Tài khoản</label>
                                                <input class="form-control" type="text" id="txtUserName" name="" placeholder="">
                                            </div>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label>2.  Họ</label>
                                                <input class="form-control" type="text" id="txtLastName" name="" placeholder="">
                                            </div>
                                            <!-- /.form-group -->
                                        </div>
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label>3.  Tên</label>
                                                <input class="form-control" type="text" id="txtFirstName" name="" placeholder="">
                                            </div>
                                            <!-- /.form-group -->
                                        </div>

                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label>4.  Địa chỉ</label>
                                                <input class="form-control" type="text" id="txtAddress" name="" placeholder="">
                                            </div>
                                            <!-- /.form-group -->
                                        </div>

                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label>5.  Số điện thoại</label>
                                                <input class="form-control" type="text" id="txtPhoneNumber" name="" placeholder="">
                                            </div>                                 
                                        </div>
                                        <!-- /.col -->
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label>6. Vai trò</label>
                                                <select class="form-control" id="txtRole" name="">
                                                    <option value = "DOCTOR">Bác sĩ</option>
                                                    <option value=\"PATIENT">Bệnh nhân</option>
                                                    <option value="ADMIN">Quản trị</option>                                                   
                                                </select>
                                            </div>
                                        </div>
                                         <div class="col-md-6">
                                            <div class="form-group">
                                                <label>7. Mật khẩu</label>
                                                 <input class="form-control" type="password" id="txtPassword" name="" placeholder="" required>
                                            </div>
                                        </div>
                                        <!-- /.col -->
                                    </div>                              

                                </div>
                                <div class="modal-footer">
                                    <button type="button" id="btnAddUser" class="btn btn-primary">Thêm</button>
                                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Đóng</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
            </div>
            <!-- /.content-wrapper -->
            <%@include file="./partial/footer.jsp"%>


        </div>
        <!-- ./wrapper -->

        <!-- jQuery 3 -->
        <script src="bower_components/jquery/dist/jquery.min.js"></script>
        <!-- Bootstrap 3.3.7 -->
        <script src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
        <!-- Select2 -->
        <script src="bower_components/select2/dist/js/select2.full.min.js"></script>

        <!-- date-range-picker -->
        <script src="bower_components/moment/min/moment.min.js"></script>
        <script src="bower_components/bootstrap-daterangepicker/daterangepicker.js"></script>
        <!-- bootstrap datepicker -->
        <script src="bower_components/bootstrap-datepicker/dist/js/bootstrap-datepicker.min.js"></script>
        <!-- bootstrap color picker -->       
        <script src="plugins/timepicker/bootstrap-timepicker.min.js"></script>
        <!-- SlimScroll -->
        <script src="bower_components/jquery-slimscroll/jquery.slimscroll.min.js"></script>
        <!-- iCheck 1.0.1 -->
        <script src="plugins/iCheck/icheck.min.js"></script>
        <!-- FastClick -->
        <script src="bower_components/fastclick/lib/fastclick.js"></script>
        <!-- AdminLTE App -->
        <script src="dist/js/adminlte.min.js"></script>
        <!-- AdminLTE for demo purposes -->
        <script src="dist/js/demo.js"></script>
        <!-- Page script -->
        <script src="bower_components/datatables.net/js/jquery.dataTables.min.js"></script>
        <script src="bower_components/datatables.net-bs/js/dataTables.bootstrap.min.js"></script>

        <script>

            function showList(data)
            {
                let str = '';
                for (let item of data)
                {
                    console.log(item);
                    str += ` <div class="callout callout-info" style="padding: 10px !important; border: none; background-color: #3C8DBC!important">
                                <h4>HOÀNG VĂN TRƯỜNG</h4>
                                <h5>25</h5>
                                <p>` + item.registationReason +
                            `</p>
                                <footer>
                                    <a href="./cap-nhat-benh-an.html"> <button class="btn btn-default ">  Xử lý</button> </a>
                                    <button class="btn btn-default  pull-right ">Lỡ hẹn</button>
                                </footer>
                            </div>`;
                }
                $('.registration-list').html(str);
            }

            $('#tblUserList').DataTable({ajax: {
                    type: 'GET',
                    url: '/users',
                    data: function (d)
                    {

                    },
                    dataSrc: function (json) {
                        return json;
                    },
                },
                columns: [
                    {data: 'userName'},
                    {data: 'lastName'},
                    {data: 'firstName'},
                    {data: 'address'},
                    {data: 'phoneNumber'},
                ], language: {
                    "sProcessing": "Đang xử lý...",
                    "sLengthMenu": "Chọn số bản ghi hiển thị trên một trang _MENU_",
                    "sZeroRecords": "Không có dữ liệu để hiển thị.",
                    "sInfo": "Hiển thị từ _START_ đến _END_ trong tổng số _TOTAL_ bản ghi",
                    "sInfoEmpty": "Hiển thị từ 0 đến 0 trong tổng số 0 mục",
                    "sInfoFiltered": "(được lọc từ _MAX_ bản ghi)",
                    "sInfoPostFix": "",
                    "sSearch": "Tìm kiếm:",
                    "sUrl": "",
                    "oPaginate": {
                        "sFirst": "Đầu",
                        "sPrevious": "Trước",
                        "sNext": "Tiếp",
                        "sLast": "Cuối"
                    }}});

            $('#btnAdd').click(function () {
                $('#modalAdd').modal('show');
            });

            $('#btnAddUser').click(function () {             
                $.ajax({
                    type: "POST",
                    url: "/users",
                    data: {userName: $('txtUserName').val(), firstName: $('txtFirstName').val(), lastName:  $('txtLastName').val(), address: $('txtAddress').val(), password: $('txtPassword').val(), phoneNumber : $('txtPhoneNumber').val() , role: $('#role').val()},
                    success: function (msg) {

                        if (msg == "ok") {
                           alert('Thành công');
                        }
                    },
                    error: function (error) {
                        alert("Có lỗi");
                    },
                });
            });

//            $.ajax({
//                type: "GET",
//                url: "/registrations",
//                dataType: 'json',
//                data: {},
//                success: function (data) {
//                    showList(data);
//
//                },
//                error: function (error) {
//                    alert("khong thanh cong");
//                },
//            });
        </script>

    </body>

</html>