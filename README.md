# WWW_Spring-MVC_Spring-Boot_Spring-Data
Ứng Dụng Web Quản Lý Bài Đăng
# Mô Tả
Ứng dụng Web này được xây dựng sử dụng các công nghệ Spring MVC, Spring Boot, Spring Data, kết hợp với cơ sở dữ liệu MariaDB (hoặc một hệ quản trị cơ sở dữ liệu khác như H2, SQL). Ứng dụng cho phép người dùng quản lý các bài đăng, bao gồm các chức năng thêm mới, xóa, chỉnh sửa và tìm kiếm bài đăng.

# Cơ Sở Dữ Liệu
Cơ sở dữ liệu được tạo và có bảng Post với các trường:

ID: Mã bài đăng (Primary Key)
Title: Tiêu đề bài đăng
Content: Nội dung bài đăng
Comment: Bình luận của người đọc
Author: Tác giả của bài đăng
Sinh viên sẽ tự tạo 6 bản ghi để kiểm tra ứng dụng.

# Yêu Cầu
Cấu trúc project sử dụng Maven.
Tạo các lớp trong các package tương ứng:
com.ktth.entity: Tạo lớp Post.java với các trường như đã mô tả.
com.ktth.dao: Tạo các phương thức để tương tác với cơ sở dữ liệu, bao gồm các truy vấn để thêm, xóa, chỉnh sửa, tìm kiếm bài đăng.
com.ktth.service và com.ktth.impl: Định nghĩa interface và lớp thực thi các phương thức từ com.ktth.dao.
com.ktth.controller: Tạo các phương thức gọi từ lớp com.ktth.impl và điều hướng tới các view tương ứng.
Chức Năng
Trang mặc định:

Hiển thị danh sách tất cả các bài đăng trong cơ sở dữ liệu.
Cung cấp liên kết điều hướng đến trang thêm mới bài đăng.
Cho phép tìm kiếm bài đăng theo ID.
Chỉnh sửa bài đăng:

Trang chỉnh sửa hiển thị thông tin của bài đăng cần chỉnh sửa.
Sau khi chỉnh sửa thành công, hiển thị lại danh sách bài đăng đã cập nhật.
Xóa bài đăng:

Cho phép xóa bài đăng đang chọn.
Sau khi xóa thành công, hiển thị lại danh sách bài đăng sau khi xóa.
Xem chi tiết bài đăng:

Cho phép xem chi tiết bài đăng, bao gồm Title, Content, Comment, và Author.
Thêm bài đăng mới:

Cung cấp form để người dùng nhập thông tin bài đăng mới.
Sau khi thêm thành công, hiển thị lại danh sách bài đăng bao gồm bài đăng mới.
Các Yêu Cầu Khác
Validation: Áp dụng các phương thức kiểm tra đầu vào hợp lệ cho các trường dữ liệu (ví dụ: Tiêu đề bài đăng không được để trống, độ dài của nội dung bài đăng phải hợp lý, v.v.).
Hướng Dẫn Cài Đặt và Chạy Ứng Dụng
Cài đặt MariaDB (hoặc H2):

Cài đặt và cấu hình MariaDB trên hệ thống của bạn (hoặc sử dụng H2 nếu cần).
Tạo cơ sở dữ liệu HoTenSVDB và bảng Post.
Cấu hình ứng dụng Spring Boot:

Tải project từ GitHub.
Cấu hình application.properties với thông tin kết nối cơ sở dữ liệu (URL, username, password).
Chạy ứng dụng:

Sử dụng Maven để biên dịch và chạy ứng dụng Spring Boot.
Truy cập ứng dụng qua trình duyệt tại http://localhost:8080.
Kết Luận
Ứng dụng giúp người dùng quản lý các bài đăng với các chức năng cơ bản như thêm, sửa, xóa và tìm kiếm bài đăng, đồng thời áp dụng các nguyên lý thiết kế trong Spring MVC và Spring Boot để đảm bảo tính mở rộng và dễ bảo trì cho ứng dụng.
