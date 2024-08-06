Phát triển ứng dụng học tiếng Anh bằng Java
Ghi chú: Trong quá trình thực hành, chương trình được phép bổ sung thêm lớp và hàm cần thiết, dữ liệu đầu vào và đầu ra của mỗi hàm. Sinh viên được phép cài đặt cấu trúc tuỳ ý, không nhất thiết tuân theo cấu trúc chương trình trong hướng dẫn. Chương trình có thể sử dụng thêm các thư viện Java bên ngoài nếu cần.
Các phiên bản cần cài đặt
1. Phiên bản command line sơ khai:	1
Cải tiến	2
2. Phiên bản giao diện đồ họa	3
Cải tiến	4
Chấm điểm	5

1. Phiên bản command line sơ khai:
Ứng dụng học Tiếng Anh có tính năng học từ vựng. Tính năng học từ vựng tương tự như một chiếc từ điển Anh – Việt với các yêu cầu sau:
Tạo class Word có thuộc tính word_target (từ vựng tiếng Anh) và word_explain (giải nghĩa tiếng Việt).
Tạo class Dictionary lưu trữ mảng Word.
Xây dựng class DictionaryManagement có hàm insertFromCommandline(). Trong đó, hàm insertFromCommandline() có chức năng nhập liệu:
●	Nhập vào bàn phím số lượng từ vựng (Word).
●	Định dạng nhập dữ liệu từ điển Anh – Việt:
○	Dòng 1: Nhập từ tiếng Anh.
○	Dòng 2: Nhập giải thích bằng tiếng Việt.
Xây dựng class DictionaryCommandline có hàm showAllWords(). Hàm showAllWords() có chức năng hiển thị kết quả danh sách dữ liệu từ vựng trên màn hình theo thứ tự alphabet. Ví dụ như sau:
No	| English	| Vietnamese
1	| Hello	| Xin chao
2 	| House	| Ngoi nha
3 	| Love	| Yeu thuong
...
Xây dựng class DictionaryCommandLine có hàm dictionaryBasic(). Hàm dictionaryBasic() có chức năng gọi hàm insertFromCommandline() và showAllWords().
Cải tiến
Tiếp tục phát triển tính năng học từ vựng trong ứng dụng học tiếng Anh.
Tong class DictionaryManagement bổ sung hàm insertFromFile() nhập dữ liệu từ điển từ tệp dictionaries.txt.
●	Quy định tệp dictionaries.txt: Mỗi dòng chứa từ tiếng anh và giải thích tiếng việt (ngăn cách nhau bằng dấu tab).
Trong class DictionaryManagement bổ sung hàm dictionaryLookup() có chức năng tra cứu từ điển bằng dòng lệnh.
Trong class DictionaryManagement phát triển thêm các hàm có chức năng thêm, sửa và xóa dữ liệu từ vựng bằng dòng lệnh.
Trong class DictionaryCommandLine bổ sung hàm dictionarySearcher() có chức năng tìm kiếm các từ.
●	Ví dụ nhập: tra
Kết quả trả về: danh sách các từ vựng bắt đầu bằng “tra”: transport, translate, transform, transit, ...
Trong class DictionaryManagement bổ sung hàm dictionaryExportToFile() có chức năng xuất dữ liệu từ điển hiện tại ra tệp.
Trong class DictionaryCommandLine bổ sung hàm dictionaryAdvanced() chạy ứng dụng với yêu cầu:
●	Xây dựng giao diện menu dòng lệnh của ứng dụng như ví dụ sau:
Welcome to My Application!
[0] Exit
[1] Add
[2] Remove
[3] Update
[4] Display
[5] Lookup
[6] Search 
[7] Import from file
[8] Export to file
Your action: 
●	Người dùng có thể điền các con số tương ứng với STT của thao tác: 0 - thoát ứng dụng, 1 - thêm từ, 2 - xóa từ, 3 - sửa từ, 4 - hiển thị danh sách các từ, 5 - tra cứu, 6 - tìm kiếm, 7 - nhập danh sách từ vựng từ tệp và 8 - xuất dữ liệu danh sách từ vựng ra tệp.
●	Nếu người dùng nhập một con số không thuộc [0-8] hoặc ký tự không hợp lệ thì in ra màn hình “Action not supported”.
2. Phiên bản giao diện đồ họa
Tiếp tục phát triển ứng dụng học tiếng Anh. Với giao diện đồ hoạ, ví dụ trên hình sau:
 
Xây dựng class DictionaryApplication có hàm runApplication(). Trong đó, hàm runApplication() có chức năng hiển thị giao diện đồ họa.
Yêu cầu của giao diện đồ họa (có thể tái cấu trúc):
●	Khi khởi động chương trình, chương trình sẽ nạp dữ liệu từ tệp dictionaries.txt.
●	Giao diện hiển thị 2 phần: phần 1 là danh sách từ, phần 2 là giải thích nghĩa của từ vựng tiếng Anh đó.
●	Thêm các hàm và lớp hỗ trợ để hiển thị phần giải thích từ vựng.
●	Thêm các chức năng nhập thêm từ mới, sửa và xóa từ vựng.
●	Tích hợp chức năng tra từ trong hàm dictionarySearcher.
●	Tích hợp chức năng phát âm tiếng Anh.
Cải tiến
Yêu cầu không bằng buộc, bài tập khuyến khích sáng tạo.
●	Tối ưu thuật toán tra từ.
●	Sử dụng dữ liệu từ điển Anh – Việt trên mạng bằng mysql, sqlite,... thay vì nạp từ tệp dictionaries.txt (dữ liệu từ điển có thể bao gồm: giải thích bằng tiếng Việt, từ đồng nghĩa, trái nghĩa, ví dụ, phát âm Anh-Mỹ và Anh-Anh,...).
●	Tích hợp kết quả tra từ, đoạn văn bằng API google translate.
●	Cải tiến giao diện chương trình thân thiện đẹp mắt hơn.  
Chấm điểm
Các nhóm chỉ cần nộp một trong hai phiên bản Command line hoặc phiên bản đồ họa hoàn thiện cuối cùng. Điểm sẽ được cộng nếu có bổ sung các tính năng sáng tạo và lập trình tốt.
Yêu cầu cung cấp mã nguồn trên git và file chạy.
Tính năng 	Điểm 	Mức 
Thiết kế cây thừa kế cho các đối tượng 	1 - 2.5	Bắt buộc 
Cài đặt được chức năng thêm sửa xóa từ mới 	0.5	Bắt buộc 
Đọc được dữ liệu từ file hoặc CSDL	0.5	Bắt buộc
Chức năng tra từ 	0.5	Bắt buộc 
Phát âm tiếng anh 	1	Bắt buộc 
Giao diện dòng lệnh command line	1	Bắt buộc 
Giao diện đồ họa cơ bản 	1.5 	Bắt buộc 
Giao diện đồ họa dễ dùng và thân thiện 	0.5	Khuyến khích 
Tối ưu thuật toán tìm kiếm 	1	Khuyến khích 
Dùng API dịch (Ví dụ Google/Bing translate) 	0.5	Nâng cao 
Tích hợp cơ sở dữ liệu phong phú 	0.5	Nâng cao 

