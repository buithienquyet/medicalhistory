<!DOCTYPE html>
<html>
    <%@include file="./partial/header.jsp"%>

    <body class="hold-transition skin-blue sidebar-mini">
        <div class="wrapper">
            <%@include file="./partial/userinfo.jsp"%>
            <!-- Left side column. contains the logo and sidebar -->
            <aside class="main-sidebar">
                <!-- sidebar: style can be found in sidebar.less -->
                <section class="sidebar" style="height: auto;">
                    <ul class="sidebar-menu tree" data-widget="tree">
                        <li>
                            <a href="./pages/lich-su-benh-an.html">
                                <span>Yêu cầu khám bệnh</span>
                            </a>
                        </li>
                        <li>
                            <a href="#" data-toggle="modal">
                                <span>Danh sách bệnh án</span>
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
                            <div class="row">
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

                            </div>

                        </div>
                        <!-- /.box-header -->
                        <div class="box-body registration-list">                           

                        </div>
                        <!-- /.box-body -->
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
        <!-- InputMask -->
        <script src="plugins/input-mask/jquery.inputmask.js"></script>
        <script src="plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
        <script src="plugins/input-mask/jquery.inputmask.extensions.js"></script>
        <!-- date-range-picker -->
        <script src="bower_components/moment/min/moment.min.js"></script>
        <script src="bower_components/bootstrap-daterangepicker/daterangepicker.js"></script>
        <!-- bootstrap datepicker -->
        <script src="bower_components/bootstrap-datepicker/dist/js/bootstrap-datepicker.min.js"></script>
        <!-- bootstrap color picker -->
        <script src="bower_components/bootstrap-colorpicker/dist/js/bootstrap-colorpicker.min.js"></script>
        <!-- bootstrap time picker -->
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
                                <p>`+item.registationReason+
                                `</p>
                                <footer>
                                    <a href="./cap-nhat-benh-an.html"> <button class="btn btn-default ">  Xử lý</button> </a>
                                    <button class="btn btn-default  pull-right ">Lỡ hẹn</button>
                                </footer>
                            </div>`;
                }
                $('.registration-list').html(str);
            }
            
            
            $.ajax({
                type: "GET",
                url: "/registrations",
                dataType: 'json',
                data: {},
                success: function (data) {
                    showList(data);
                   
                },
                error: function (error) {
                    alert("khong thanh cong");
                },
            });
        </script>

    </body>

</html>