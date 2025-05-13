
package model;

public class Account {
    
    private String name ; 
    private String pass ; 
    private String gioiTinh; 
    private String daToc ; 
    private String ngoaiNgu; 

    public Account(String name, String pass, String gioiTinh, String daToc, String ngoaiNgu) {
        this.name = name;
        this.pass = pass;
        this.gioiTinh = gioiTinh;
        this.daToc = daToc;
        this.ngoaiNgu = ngoaiNgu;
    }

    public Account() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDaToc() {
        return daToc;
    }

    public void setDaToc(String daToc) {
        this.daToc = daToc;
    }

    public String getNgoaiNgu() {
        return ngoaiNgu;
    }

    public void setNgoaiNgu(String ngoaiNgu) {
        this.ngoaiNgu = ngoaiNgu;
    }

    @Override
    public String toString() {
        return "Account{" + "name=" + name + ", pass=" + pass + ", gioiTinh=" + gioiTinh + ", daToc=" + daToc + ", ngoaiNgu=" + ngoaiNgu + '}';
    }
    
    
}
