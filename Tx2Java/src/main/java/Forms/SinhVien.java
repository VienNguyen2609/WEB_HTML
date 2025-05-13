
package Forms;

public class SinhVien {
    
    private int idSV; 
    private String tenSV; 
    private String gioiTinhSV; 
    private String danTocSV; 
    private String ngoaiNguSV; 

    public SinhVien(int idSV, String tenSV, String gioiTinhSV, String danTocSV, String ngoaiNguSV) {
        this.idSV = idSV;
        this.tenSV = tenSV;
        this.gioiTinhSV = gioiTinhSV;
        this.danTocSV = danTocSV;
        this.ngoaiNguSV = ngoaiNguSV;
    }

    public SinhVien() {
    }

    public int getIdSV() {
        return idSV;
    }

    public void setIdSV(int idSV) {
        this.idSV = idSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getGioiTinhSV() {
        return gioiTinhSV;
    }

    public void setGioiTinhSV(String gioiTinhSV) {
        this.gioiTinhSV = gioiTinhSV;
    }

    public String getDanTocSV() {
        return danTocSV;
    }

    public void setDanTocSV(String danTocSV) {
        this.danTocSV = danTocSV;
    }

    public String getNgoaiNguSV() {
        return ngoaiNguSV;
    }

    public void setNgoaiNguSV(String ngoaiNguSV) {
        this.ngoaiNguSV = ngoaiNguSV;
    }
    
    
    
    
}
