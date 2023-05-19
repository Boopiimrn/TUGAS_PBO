/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muhammadrofinugraha_2110010241;

/**
 *
 * @author ACER
 */
import java.util.Date;
public class tbl_debitur {
    
    private String no_ktp;
    private String username_debitur;
    private String password_debitur;
    private String nm_debitur;
    private String almt_debitur;
    private String telp_debitur;
    private String tmpt_lahir;
    private Date tgl_lahir;
    private Integer usia;
    private Integer tbl_userid_user;

    public tbl_debitur() {}

    public void setNoKtp(String no_ktp) {
        this.no_ktp = no_ktp;
    }

    public String getNoKtp() {
        return no_ktp;
    }

    public void setUsernameDebitur(String username_debitur) {
        this.username_debitur = username_debitur;
    }

    public String getUsernameDebitur() {
        return username_debitur;
    }

    public void setPasswordDebitur(String password_debitur) {
        this.password_debitur = password_debitur;
    }

    public String getPasswordDebitur() {
        return password_debitur;
    }

    public void setNmDebitur(String nm_debitur) {
        this.nm_debitur = nm_debitur;
    }

    public String getNmDebitur() {
        return nm_debitur;
    }

    public void setAlmtDebitur(String almt_debitur) {
        this.almt_debitur = almt_debitur;
    }

    public String getAlmtDebitur() {
        return almt_debitur;
    }

    public void setTelpDebitur(String telp_debitur) {
        this.telp_debitur = telp_debitur;
    }

    public String getTelpDebitur() {
        return telp_debitur;
    }

    public void setTmptLahir(String tmpt_lahir) {
        this.tmpt_lahir = tmpt_lahir;
    }

    public String getTmptLahir() {
        return tmpt_lahir;
    }

    public void setTglLahir(Date tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    public Date getTglLahir() {
        return tgl_lahir;
    }

    public void setUsia(Integer usia) {
        this.usia = usia;
    }

    public Integer getUsia() {
        return usia;
    }

    public void setTblUseridUser(Integer tbl_userid_user) {
        this.tbl_userid_user = tbl_userid_user;
    }

    public Integer getTblUseridUser() {
        return tbl_userid_user;
    }
}

