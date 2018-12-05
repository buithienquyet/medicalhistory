<%@page import="com.eighteengroup.medicalhistory.models.Doctor"%>
<!DOCTYPE html>
<html>
    <%@include file="./partial/header.jsp"%>

    <%
        Doctor doctor = (Doctor) session.getAttribute("loginedUser");
    %>

    <body class="hold-transition skin-blue sidebar-mini">
        <input type = "hidden" value ="<%=doctor.getRoomId()%> " id ="txtRoomId">

        <%@include file="./partial/medical-report-update.jsp"%>

        <div class="wrapper">
            <%@include file="./partial/userinfo.jsp"%>
            <!-- Left side column. contains the logo and sidebar -->
            <aside class="main-sidebar">
                <!-- sidebar: style can be found in sidebar.less -->
                <section class="sidebar" style="height: auto;">
                    <ul class="sidebar-menu tree" data-widget="tree">
                        <li>
                            <a href="/doctor-registration-list.jsp">
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
                                        <input type="text" class="form-control pull-right" id="txtDate">
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
                                        <button id ="btnSearch" class="btn btn-default form-control">Tìm kiếm</button>
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

            $('#txtDate').datepicker({format: 'yyyy/mm/dd',
                autoclose: true
            });

            $('#txtDate').val(moment().format('YYYY/MM/DD'));

            $('.my-date-picker').datepicker({format: 'yyyy/mm/dd',
                autoclose: true
            });


            function newMedicalRecord(__this)
            {
                let modal = $('#modal-medical-report-update');
                let _this = $(__this);
                console.log(_this);
                let regData = _this.parent().parent().data('item-data');

                $('#txtPatientName').val((regData.user.lastName + ' ' + regData.user.firstName).toUpperCase());
                $('#txtPathologicalProcess').val(regData.registationPathologicalprocess);
                $('#txtReason').val(regData.registationReason);
                $('#txtStory').val(regData.registationDiseaseprofile);


                modal.modal('show');
            }

            function showList(data)
            {
                let str = '';
                for (let item of data)
                {
                    //     console.log(item);
                    let element = $(document.createElement('div'));
                    element.addClass('callout').addClass('callout-info');
                    element.css("padding", "10px !important").css('border', 'none').css('background-color', '#3C8DBC!important');
                    let str =
                            `<h4>` + (item.user.lastName + ' ' + item.user.firstName).toUpperCase() + `</h4>
                                <h5>` + item.user.birthday + `</h5>
                                <p>` + item.registationReason +
                            `</p>
                                <footer>
                                    <button onclick="newMedicalRecord(this)" class="btn btn-default">  Xử lý</button>
                                    <button onclick="" class="btn btn-default  pull-right ">Lỡ hẹn</button>
                                </footer>`;
                    element.data('item-data', item);
                    element.html(str);
                    $('.registration-list').append(element);
                }
            }

            function getList(date)
            {
                $.ajax({
                    type: "GET",
                    url: "/registrations",
                    dataType: 'json',
                    data: {date: date},
                    success: function (data) {
                        showList(data);
                    },
                    error: function (error) {
                        alert("Có lỗi trong quá trình lấy danh sách");
                    },
                });
            }

            getList($('#txtDate').val());


            $('#btnSearch').click(function () {
                getList($('#txtDate').val());
            });

            //   $('.select2').select2();

            $.ajax({
                url: '/provinces',
                dataType: 'json',
                success: function (data) {

                    for (let item of data)
                    {
                        let option = $(document.createElement('option'));
                        option.val(item.ProvinceId);
                        option.html(item.ProvinceName);
                        $('#selectProvince').append(option);
                    }

                }
            });

            function getDistrictList(provinceId, selected)
            {
                $.ajax({
                    url: '/districts',
                    method: 'GET',
                    dataType: 'json',
                    data : {
                        provinceId: provinceId
                    },
                    success: function (data) {                        
                        $('#selectDistrict').empty();

                        for (let item of data)
                        {
                            let option = $(document.createElement('option'));
                            option.val(item.DistrictId);
                            option.html(item.DistrictName);
                            $('#selectDistrict').append(option);
                        }
                    }
                });
            }
                        
            function getVillageList(districtId, selected)
            {
                $.ajax({
                    url: '/villages',
                    method: 'GET',
                    dataType: 'json',
                    data : {
                        districtId:  districtId
                    },
                    success: function (data) {                        
                        $('#selectVillage').empty();

                        for (let item of data)
                        {
                            let option = $(document.createElement('option'));
                            option.val(item.villageId);
                            option.html(item.villageName);
                            $('#selectVillage').append(option);
                        }
                    }
                });
            }

            $('#selectProvince').on('change', function () {
                let val = this.value;               
                
                getDistrictList(val, null);

            });
            
            $('#selectDistrict').on('change', function () {
                let val = this.value;               
                
                getVillageList(val, null);

            });


        </script>

    </body>

</html>