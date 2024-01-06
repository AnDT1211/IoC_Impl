## Overview
project này implement lại cách mà Spring IoC tìm kiếm, khởi tạo bean thông qua file cofig

`ApplicationContext` bên spring tương ứng với class `AppIoC`

## Compile and Run

biên dịch ta dùng lệnh sau

```
javac -d out *.java
```

để chạy chương trình ta dùng lệnh sau

```
java -cp out:. App
```

## Technology note

- trong file properties phải có key `className` (tương ứng với attribute `class` trong element `<bean/>` khi config spring configuration XML
- value của `className` là full qualified class name và là concrete class
- sau khi biên dịch xong, ta chỉ cần sửa lại value trong file config thành `A1` hoặc `A2` hoặc `A3` mà không cần biên dịch lại
