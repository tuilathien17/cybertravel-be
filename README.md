# cybertravel-be
###########################
## CyberTravel app's REST API##
###########################

# Điều kiện tiên quyết

Trước khi chạy project, hãy đảm bảo rằng máy tính đã đảm bảo những điều kiện sao đây:
* Đã tải xuống và cài đặt Java Development Kit (JDK).
* Đã tải xuống và cài đặt một IDE cho Java bất kỳ (IntelliJ, Eclipse hoặc NetBeans,...)

# Cách setup để chạy project
* Mở project trong ứng dụng IDE có sẵn trong máy.
* Sử dụng lệnh install của build tool Maven để cài các dependencies trong file pom.xml về project.
* Sau khi install xong Run project (hàm main) và mở localhost:8080 trên trình duyệt để xem kết quả.

# Các controller hiện có

GET /

POST /auth/signup
POST /auth/signin

GET /place
GET /place/{id}
POST /place
PUT /place
DELETE /place/{id}

GET /user
GET /user/{id}
POST /user
PUT /user
DELETE /user/{id}

GET /hotel
GET /hotel/{id}
POST /hotel
PUT /hotel
DELETE /hotel/{id}

GET /tour
GET /tour/{id}
POST /tour
PUT /tour
DELETE /tour/{id}

#Connection string đến MongoDB Cloud chứa Database

mongodb+srv://cybergang:<password>@cybertravel.voesf.mongodb.net/cybertravel_db?retryWrites=true&w=majority

p/s: vì để đảm bảo tính bảo mật nên mình xin giấu <password> đi, liên hệ tôi để lấy password.

# Thông tin liên hệ
Nguyễn Thế Thiện - SDT: 0764204982


