<div class="modal" tabindex="-1" role="dialog" style="margin: 0px; padding-left: 0px !important;" id = "modal-medical-report-update">
    <div class="modal-dialog" role="document" style="   width: 100%;    margin: 0px;    padding: 30px;">
        <div class="modal-content">
            <div class="modal-header">
                 <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title">Hồ sơ bệnh án</h4>              
            </div>
            <div class="modal-body">
                <div class="box box-default">
                    <div class="box-header with-border">
                        <h3 class="box-title">I. HÀNH CHÍNH</h3>
                        <div class="box-tools pull-right">
                            <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
                        </div>
                    </div>
                    <!-- /.box-header -->
                    <div class="box-body">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label>1. Họ và tên</label>
                                    <span class="desc">(In hoa)
                                    </span>
                                    <input class="form-control" id="txtPatientName" type="text" placeholder="BÙI THIỆN QUYẾT">
                                </div>
                                <div class="form-group">
                                    <label>3. Nghề nghiệp</label>
                                    <span class="desc">
                                    </span>
                                    <input class="form-control" type="text" placeholder="Lập trình viên">
                                </div>
                                <div class="form-group">
                                    <label>5. Dân tộc</label>
                                    <select class="form-control select2 " style="width: 100%;" tabindex="-1" aria-hidden="true">
                                        <option >Kinh</option>
                                        <option selected="selected">Ê đê</option>
                                        <option>Mường</option>
                                        <option>Thái</option>
                                        <option>Giao</option>
                                        <option>Tày</option>                                        
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label>7. Số bảo hiểm y tế</label>
                                    <span class="desc">
                                    </span>
                                    <input class="form-control" type="text" placeholder="Cầu Giấy, Hà Nội">
                                </div>
                                <div class="form-group">
                                    <label>9. Địa chỉ</label>
                                    <span class="desc">
                                    </span>
                                    <div style="padding-left: 20px">
                                        <div class="form-group" style="margin-bottom: 5px">
                                            <label></label>
                                            <span class="desc">- Thành phố</span>
                                            <select id="selectProvince" class="form-control select2" style="width: 100%;" tabindex="-1" aria-hidden="true">
                                                                                                                    
                                            </select>
                                        </div>
                                        <div class="form-group" style="margin-bottom: 5px">
                                            <label></label>
                                            <span class="desc">- Huyện</span>
                                            <select id="selectDistrict" class="form-control " style="width: 100%;" tabindex="-1" aria-hidden="true">                                                                                                                       
                                            </select>
                                        </div>
                                        <div class="form-group" style="margin-bottom: 5px">
                                            <label></label>
                                            <span class="desc">- Phường</span>
                                            <select id="selectVillage" class="form-control " style="width: 100%;" tabindex="-1" aria-hidden="true">                                                                                                                       
                                            </select>
                                        </div>
                                        <div class="form-group" style="margin-bottom: 5px">
                                            <label></label>
                                            <span class="desc">- Số nhà</span>
                                            <input class="form-control" type="text" placeholder="Số 1">
                                        </div>
                                    </div>
                                </div>

                                <!-- /.form-group -->
                            </div>
                            <!-- /.col -->
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label>2. Ngày sinh:</label>

                                    <div class="input-group date">
                                        <div class="input-group-addon">
                                            <i class="fa fa-calendar"></i>
                                        </div>
                                        <input type="text" class="form-control pull-right" id="datepicker">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label>4. Số điện thoại</label>
                                    <input class="form-control" type="text" placeholder="0399876304">
                                </div>
                                <div class="form-group">
                                    <label>6. Ngoại kiều</label>
                                    <select class="form-control select2 select2-hidden-accessible" style="width: 100%;" tabindex="-1" aria-hidden="true">
                                        <option selected="selected">Không</option>
                                        <option>Anh</option>
                                        <option>Pháp</option>
                                        <option>Mỹ</option>
                                        <option>Hàn</option>
                                        <option>Trung Quốc</option>                                        
                                    </select><span class="select2 select2-container select2-container--default select2-container--below" dir="ltr" style="width: 100%;"><span class="selection"><span class="select2-selection select2-selection--single" role="combobox" aria-haspopup="true" aria-expanded="false" tabindex="0" aria-labelledby="select2-ko8m-container"><span class="select2-selection__rendered" id="select2-ko8m-container" title="Không">Không</span><span class="select2-selection__arrow" role="presentation"><b role="presentation"></b></span></span></span><span class="dropdown-wrapper" aria-hidden="true"></span></span>
                                </div>
                                <div class="form-group">
                                    <label>8. Nơi làm việc</label>
                                    <span class="desc">
                                    </span>
                                    <input class="form-control" type="text" placeholder="Cầu Giấy, Hà Nội">
                                </div>

                                <div class="form-group">
                                    <label>10. Người cần báo tin</label>
                                    <span class="desc">
                                    </span>
                                    <div style="padding-left: 20px">
                                        <div class="form-group" style="margin-bottom: 5px">
                                            <label></label>
                                            <span class="desc">- Số điện thoại</span>
                                            <input class="form-control" type="text" placeholder="0399876304">
                                        </div>
                                        <div class="form-group" style="margin-bottom: 5px">
                                            <label></label>
                                            <span class="desc">- Địa chỉ</span>
                                            <textarea style="padding-bottom: 4px" class="form-control" rows="3" id="nguoibaotin" type="text" placeholder="Bùi Ngọc Thiện, Cầu Giấy, Hà Nội"></textarea>
                                        </div>

                                    </div>
                                </div>


                            </div>


                        </div>
                        <footer>
                            <button class="center-block btn btn-primary"><i class="fa fa-save"></i> Lưu thay đổi</button>
                        </footer>
                        <!-- /.row -->
                    </div>
                    <!-- /.box-body -->
                </div>
                <div class="box box-default">
                    <div class="box-header with-border">
                        <h3 class="box-title">A. BỆNH ÁN</h3>

                        <div class="box-tools pull-right">
                            <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
                        </div>
                    </div>
                    <!-- /.box-header -->
                    <div class="box-body">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label>1.  Lý do vào viện</label>

                                    <input id="txtReason" class="form-control" type="text" placeholder="Đau lưng">
                                </div>
                                <!-- /.form-group -->
                            </div>
                            <!-- /.col -->
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label>2. Ngày vào viện</label>

                                    <div class="input-group date">
                                        <div class="input-group-addon">
                                            <i class="fa fa-calendar"></i>
                                        </div>
                                        <input id="txtStartDate" type="text" class="my-date-picker form-control pull-right" >
                                    </div>
                                </div>
                            </div>
                            <!-- /.col -->
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label>3. Quá trình bệnh lý</label>
                                    <span>(khởi phát, diễn biến, chẩn đoán, điều trị của tuyến dưới v.v...).</span>
                                    <textarea id="txtPathologicalProcess" class="form-control" rows="3" placeholder="Lâu năm ..."></textarea>
                                </div>
                                <!-- /.form-group -->
                            </div>
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label>4. Tiểu sử bệnh</label>
                                    <textarea id ="txtStory" class="form-control" rows="3" placeholder="Bản thân"></textarea>
                                </div>
                                <!-- /.form-group -->
                            </div>
                        </div>
                        <footer>
                            <button class="center-block btn btn-primary"><i class="fa fa-save"></i> Lưu thay đổi</button>
                        </footer>
                    </div>

                    <!-- /.box-body -->
                </div>
                <div class="box box-default">
                    <div class="box-header with-border">
                        <h3 class="box-title">III. KHÁM BỆNH</h3>

                        <div class="box-tools pull-right">
                            <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
                        </div>
                    </div>
                    <!-- /.box-header -->
                    <div class="box-body">
                        <label>1.  Toàn thân</label>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <input class="form-control" type="text" placeholder="Tinh thần của người bệnh">
                                </div>
                                <div class="form-group">
                                    <input class="form-control" type="text" placeholder="Hình dáng tư thế">
                                </div>
                                <div class="form-group">
                                    <input class="form-control" type="text" placeholder="Da, niêm mạc">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <input class="form-control" type="text" placeholder="Triệu chứng xuất huyết">
                                </div>
                                <div class="form-group">
                                    <input class="form-control" type="text" placeholder="Hệ thống lông, tóc, móng">
                                </div>
                                <div class="form-group">
                                    <input class="form-control" type="text" placeholder="Tuyến giáp">
                                </div>
                            </div>
                        </div>
                        <label>2. Các cơ quan</label>
                        <div class="row">
                            <div class="col-md-4">
                                <h5>- Gan</h5>
                                <div class="form-group">
                                    <input class="form-control" type="text" placeholder=" Vị trí">
                                </div>
                                <div class="form-group">
                                    <input class="form-control" type="text" placeholder=" Kích thước">
                                </div>
                                <div class="form-group">
                                    <input class="form-control" type="text" placeholder="Mật độ">
                                </div>
                                <div class="form-group">
                                    <input class="form-control" type="text" placeholder="Bờ">
                                </div>
                                <div class="form-group">
                                    <input class="form-control" type="text" placeholder="Mặt gan">
                                </div>
                                <div class="form-group">
                                    <input class="form-control" type="text" placeholder="Đau">
                                </div>
                            </div>
                            <div class="col-md-4">
                                <h5>- Lách</h5>
                                <div class="form-group">
                                    <input class="form-control" type="text" placeholder=" Vị trí">
                                </div>
                                <div class="form-group">
                                    <input class="form-control" type="text" placeholder=" Kích thước">
                                </div>
                                <div class="form-group">
                                    <input class="form-control" type="text" placeholder="Mật độ">
                                </div>
                                <div class="form-group">
                                    <input class="form-control" type="text" placeholder="Bờ">
                                </div>
                                <div class="form-group">
                                    <input class="form-control" type="text" placeholder="Mặt gan">
                                </div>
                                <div class="form-group">
                                    <input class="form-control" type="text" placeholder="Đau">
                                </div>
                            </div>
                            <div class="col-md-4">
                                <h5>- Hạch</h5>
                                <div class="form-group">
                                    <input class="form-control" type="text" placeholder=" Vị trí">
                                </div>
                                <div class="form-group">
                                    <input class="form-control" type="text" placeholder=" Kích thước">
                                </div>
                                <div class="form-group">
                                    <input class="form-control" type="text" placeholder="Mật độ">
                                </div>
                                <div class="form-group">
                                    <input class="form-control" type="text" placeholder="Bờ">
                                </div>
                                <div class="form-group">
                                    <input class="form-control" type="text" placeholder="Mặt gan">
                                </div>
                                <div class="form-group">
                                    <input class="form-control" type="text" placeholder="Đau">
                                </div>
                            </div>
                        </div>
                        <label>3. Các xét nghiệm cận lâm sàng</label>
                        <div class="row">
                            <div class="col-sm-12">
                                <table style="vertical-align: middle" id="example2" class="table table-bordered table-hover dataTable" role="grid" aria-describedby="example2_info">
                                    <thead>
                                        <tr role="row">
                                            <th class="sorting_asc" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Rendering engine: activate to sort column descending" aria-sort="ascending">Tên xét nghiệm</th>
                                            <th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Browser: activate to sort column ascending">Máy xét nghiệm</th>
                                            <th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Platform(s): activate to sort column ascending">Kết quả xét nghiệm</th>
                                            <th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Engine version: activate to sort column ascending">Công cụ</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr role="row" class="odd">
                                            <td class="sorting_1">Huyết đồ</td>
                                            <td>22</td>
                                            <td>Bình thường</td>
                                            <td><button class="btn btn-primay btn-sm center-block">Xem chi tiết</button></td>

                                        </tr>
                                        <tr role="row" class="even">
                                            <td class="sorting_1">Tuỷ đồ</td>
                                            <td>20</td>
                                            <td>Bình thường</td>
                                            <td><button class="btn btn-primay btn-sm center-block">Xem chi tiết</button></td>

                                        </tr>
                                        <tr role="row" class="odd">
                                            <td class="sorting_1">Sinh thiết tuỷ</td>
                                            <td>22</td>
                                            <td>Bình thường</td>
                                            <td><button class="btn btn-primay btn-sm center-block">Xem chi tiết</button></td>

                                        </tr>
                                        <tr role="row" class="even">
                                            <td class="sorting_1">Sinh thiết hạch</td>
                                            <td>22</td>
                                            <td>Bình thường</td>
                                            <td><button class="btn btn-primay btn-sm center-block">Xem chi tiết</button></td>

                                        </tr>
                                        <tr role="row" class="odd">
                                            <td class="sorting_1">Đông máu toàn bộ</td>
                                            <td>22</td>
                                            <td>Bình thường</td>
                                            <td><button class="btn btn-primay btn-sm center-block">Xem chi tiết</button></td>

                                        </tr>
                                        <tr role="row" class="even">
                                            <td class="sorting_1">Định lượng yếu tố đông máu</td>
                                            <td>22</td>
                                            <td>Bình thường</td>
                                            <td><button class="btn btn-primay btn-sm center-block">Xem chi tiết</button></td>

                                        </tr>
                                        <tr role="row" class="even">
                                            <td class="sorting_1">Điện di HST</td>
                                            <td>22</td>
                                            <td>Bình thường</td>
                                            <td><button class="btn btn-primay btn-sm center-block">Xem chi tiết</button></td>

                                        </tr>
                                        <tr role="row" class="even">
                                            <td class="sorting_1">Nhiễm sắc thể</td>
                                            <td>22</td>
                                            <td>Bình thường</td>
                                            <td><button class="btn btn-primay btn-sm center-block">Xem chi tiết</button></td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                        <label>4. Tóm tắt bệnh án</label>
                        <div class="row">
                            <div class="col-md-12">
                                <textarea class="form-control" rows="5"></textarea>
                            </div>
                        </div>
                        <footer style="margin-top: 10px">
                            <button class="center-block btn btn-primary"><i class="fa fa-save"></i> Lưu thay đổi</button>
                        </footer>
                    </div>
                </div>

                <div class="box box-default">
                    <div class="box-header with-border">
                        <h3 class="box-title">IV. CHUẨN ĐOÁN KHI VÀO KHOA ĐIỀU TRỊ</h3>
                        <div class="box-tools pull-right">
                            <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
                        </div>
                    </div>
                    <!-- /.box-header -->
                    <div class="box-body">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label>1. Bệnh chính</label>
                                    <!-- <span>(khởi phát, diễn biến, chẩn đoán, điều trị của tuyến dưới v.v...).</span> -->
                                    <textarea class="form-control" rows="3" placeholder=""></textarea>
                                </div>
                            </div>
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label>2. Bệnh kèm theo</label>
                                    <textarea class="form-control" rows="3" placeholder=""></textarea>
                                </div>
                            </div>
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label>3. Phân biệt</label>
                                    <textarea class="form-control" rows="3" placeholder=""></textarea>
                                </div>
                            </div>
                        </div>
                        <footer>
                            <button class="center-block btn btn-primary"><i class="fa fa-save"></i> Lưu thay đổi</button>
                        </footer>
                    </div>
                </div>

                <div class="box box-default">
                    <div class="box-header with-border">
                        <h3 class="box-title">V. TIÊN LƯỢNG</h3>
                        <div class="box-tools pull-right">
                            <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
                        </div>
                    </div>
                    <div class="box-body">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label>Nội dung</label>
                                    <textarea class="form-control" rows="3" placeholder=""></textarea>
                                </div>
                            </div>
                        </div>
                        <footer>
                            <button class="center-block btn btn-primary"><i class="fa fa-save"></i> Lưu thay đổi</button>
                        </footer>
                    </div>
                </div>

                <div class="box box-default">
                    <div class="box-header with-border">
                        <h3 class="box-title">IV. HƯỚNG ĐIỀU TRỊ</h3>
                        <div class="box-tools pull-right">
                            <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
                        </div>
                    </div>
                    <!-- /.box-header -->
                    <div class="box-body">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label>1. Điều trị</label>
                                    <!-- <span>(khởi phát, diễn biến, chẩn đoán, điều trị của tuyến dưới v.v...).</span> -->
                                    <textarea class="form-control" rows="3" placeholder=""></textarea>
                                </div>
                            </div>
                        </div>
                        <label>2. Truyền máu</label>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group" style="padding-left: 20px">
                                    1. Khối hồng cầu
                                    <span>(Số lần)</span>
                                    <input class="pull-right" type="number">
                                </div>
                                <div class="form-group" style="padding-left: 20px">
                                    2. Hồng cầu rửa
                                    <span>(Số lần)</span>
                                    <input class="pull-right" type="number">
                                </div>
                                <div class="form-group" style="padding-left: 20px">
                                    3. Khối tiểu cầu
                                    <span>(Số lần)</span>
                                    <input class="pull-right" type="number">
                                </div>
                                <div class="form-group" style="padding-left: 20px">
                                    4. Khối bạch cầu hạt
                                    <span>(Số lần)</span>
                                    <input class="pull-right" type="number">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group" style="padding-left: 20px">
                                    5. Huyết tương
                                    <span>(Số lần)</span>
                                    <input class="pull-right" type="number">
                                </div>
                                <div class="form-group" style="padding-left: 20px">
                                    6. Huyết tương tươi đông lạnh
                                    <span>(Số lần)</span>
                                    <input class="pull-right" type="number">
                                </div>
                                <div class="form-group" style="padding-left: 20px">
                                    7. Tủa VIII
                                    <span>(Số lần)</span>
                                    <input class="pull-right" type="number">
                                </div>
                                <div class="form-group" style="padding-left: 20px">
                                    8. Truyền máu toàn phần
                                    <span>(Số lần)</span>
                                    <input class="pull-right" type="number">
                                </div>
                            </div>
                        </div>
                        <footer>
                            <button class="center-block btn btn-primary"><i class="fa fa-save"></i> Lưu thay đổi</button>
                        </footer>
                    </div>
                </div>

                <div class="box box-default">
                    <div class="box-header with-border">
                        <h3 class="box-title">B. TỔNG KẾT BỆNH ÁN</h3>
                        <div class="box-tools pull-right">
                            <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
                        </div>
                    </div>
                    <div class="box-body">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label>1. Quá trình bệnh lý và diễn biến lâm sàng</label>
                                    <textarea class="form-control" rows="5" placeholder=""></textarea>
                                </div>
                                <div class="form-group">
                                    <label>2. Tóm tắt kết quả xét nghiệm cận lâm sàng có giá trị chẩn đoán</label>
                                    <textarea class="form-control" rows="4" placeholder=""></textarea>
                                </div>
                                <div class="form-group">
                                    <label>3. Phương pháp điều trị </label>
                                    <textarea class="form-control" rows="4" placeholder=""></textarea>
                                </div>
                                <div class="form-group">
                                    <label>4. Tình trạng người bệnh ra viện </label>
                                    <textarea class="form-control" rows="4" placeholder=""></textarea>
                                </div>
                                <div class="form-group">
                                    <label>3. Hướng điều trị và các chế độ tiếp theo </label>
                                    <textarea class="form-control" rows="4" placeholder=""></textarea>
                                </div>
                            </div>
                        </div>
                        <footer>
                            <button class="center-block btn btn-primary"><i class="fa fa-save"></i> Lưu thay đổi</button>
                        </footer>
                    </div>
                </div>
            </div>           
        </div>
    </div>
</div>


