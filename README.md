# Repo mẫu Buổi 4: Git

Repo này được dựng sẵn để minh họa cho buổi học. Nó trông giống repo `hello-git` mà cả lớp cùng xây, ở trạng thái cuối buổi.

## Xem gì ở đâu

| Muốn xem | Bấm vào |
|---|---|
| Lịch sử commit | Dòng "commits" phía trên danh sách file |
| Các nhánh | Ô chọn nhánh (đang ghi `main`) |
| Hình vẽ nhánh tách ra và gộp lại | **Insights**, rồi **Network** |
| Pull request đã merge, có lời review | Tab **Pull requests**, mục **Closed** |
| Pull request đang mở | Tab **Pull requests**, mục **Open** |
| Pull request đang báo conflict | PR có tiêu đề ghi "đang conflict" |
| File bị Git bỏ qua | File `.gitignore` |

## Mô hình nhánh

- `main`: code đã được duyệt.
- `develop`: nơi gom các tính năng.
- `feature/...`: mỗi tính năng một nhánh, xong thì tạo pull request vào `develop`.
