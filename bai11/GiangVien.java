package bai11;

public abstract class GiangVien {
    protected String hoTen;
    protected String diaChi;
    protected String loaiGiangVien;
    public GiangVien(String hoTen, String diaChi, String loaiGiangVien) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiGiangVien = loaiGiangVien;
    }
    public abstract void nhapThongTin();
    public abstract double tinhLuong();
    public void inThongTin() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Loại giảng viên: " + loaiGiangVien);
        System.out.println("Lương tháng: " + tinhLuong());
    }
}
