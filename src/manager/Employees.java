/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manager;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author kshitijkumartiwari
 */
public class Employees {
    
    private String name;
    private int eid;
    private int age;
    private String gender;
    private String strtdate;
    private String lvl;
    private String teaminf;
    private String postitle;
    private String cntctno ;
    private String email;
    private ImageIcon empimg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStrtdate() {
        return strtdate;
    }

    public void setStrtdate(String strtdate) {
        this.strtdate = strtdate;
    }

    public String getLvl() {
        return lvl;
    }

    public void setLvl(String lvl) {
        this.lvl = lvl;
    }

    public String getTeaminf() {
        return teaminf;
    }

    public void setTeaminf(String teaminf) {
        this.teaminf = teaminf;
    }

    public String getPostitle() {
        return postitle;
    }

    public void setPostitle(String postitle) {
        this.postitle = postitle;
    }

    public String getCntctno() {
        return cntctno;
    }

    public void setCntctno(String cntctno) {
        this.cntctno = cntctno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ImageIcon getEmpimg() {
        return empimg;
    }

    public void setEmpimg(Icon empimg) {
        this.empimg = (ImageIcon) empimg;
    }
    




    @Override
    public String toString(){
        return name;
    }
    
 
}

