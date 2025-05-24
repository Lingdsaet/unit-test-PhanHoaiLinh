# Java Student Analyzer 📊

## Mô tả chức năng

Chương trình Java này cung cấp một lớp `StudentAnalyzer` có 2 phương thức chính để phân tích danh sách điểm của học sinh:

### 1. `countExcellentStudents(List<Double> scores)`

- Trả về số lượng học sinh **đạt loại Giỏi**, với điểm từ **8.0 trở lên**.
- Bỏ qua các điểm **không hợp lệ** (nhỏ hơn 0 hoặc lớn hơn 10).
- Nếu danh sách trống, trả về **0**.

### 2. `calculateValidAverage(List<Double> scores)`

- Tính **trung bình cộng của các điểm hợp lệ** (từ 0 đến 10).
- Bỏ qua điểm không hợp lệ.
- Nếu danh sách trống hoặc không có điểm hợp lệ nào, trả về **0**.

---

## Yêu cầu kỹ thuật

- **Điều kiện lọc dữ liệu:**
  - Chỉ chấp nhận điểm hợp lệ từ `0` đến `10`.
- **Xử lý danh sách trống:** Trả về `0`.
- **Xử lý trong phương thức:**
  - Dùng vòng lặp để duyệt danh sách điểm và xử lý theo yêu cầu.
  - Không sử dụng thư viện ngoài trừ chuẩn của Java.

---

## Yêu cầu kiểm thử với JUnit ✅

Sinh viên cần viết các test case sử dụng **JUnit 5** để kiểm thử đầy đủ các trường hợp sau:

### Trường hợp bình thường:
- Danh sách có cả điểm hợp lệ và không hợp lệ.
- Danh sách toàn bộ là điểm hợp lệ.

### Trường hợp biên:
- Danh sách trống.
- Danh sách chỉ chứa điểm 0 hoặc 10.

### Trường hợp ngoại lệ:
- Danh sách có điểm nhỏ hơn 0 hoặc lớn hơn 10.

---

