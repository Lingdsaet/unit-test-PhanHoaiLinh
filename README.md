
# Java Student Analyzer 

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

## Yêu cầu kiểm thử với JUnit 

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
##  Kiểm thử đơn vị & đo độ bao phủ

###  Công cụ sử dụng:

* **JUnit 5** để viết test.
* **JaCoCo** để đo độ bao phủ mã nguồn.

---

### ⚙️ Cài đặt JaCoCo trong Maven (`pom.xml`)

```xml
<build>
  <plugins>
    <plugin>
      <groupId>org.jacoco</groupId>
      <artifactId>jacoco-maven-plugin</artifactId>
      <version>0.8.8</version>
      <executions>
        <execution>
          <goals><goal>prepare-agent</goal></goals>
        </execution>
        <execution>
          <id>report</id>
          <phase>verify</phase>
          <goals><goal>report</goal></goals>
        </execution>
      </executions>
    </plugin>
  </plugins>
</build>
```

---

###  Các bước thực hiện đo bao phủ

1. **Chạy kiểm thử:**

```bash
mvn clean test
```

2. **Sinh báo cáo:**

```bash
mvn verify
```

3. **Mở kết quả tại:**

```
target/site/jacoco/index.html
```

---

###  Kết quả đo bao phủ kiểm thử

![image](https://github.com/user-attachments/assets/689d71bc-066c-4ead-b288-858c32203e3a)

Tất cả các dòng mã và điều kiện rẽ nhánh trong `StudentAnalyzer` đã được kiểm thử đầy đủ với các test case, bao gồm:

* Danh sách rỗng
* Danh sách chứa giá trị `null`
* Điểm hợp lệ và không hợp lệ
* Trường hợp biên (0 và 10)

---




