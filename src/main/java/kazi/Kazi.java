package kazi;
/*
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author abdullah
 */
/*
@Entity
@Table(name = "Kazi")
public class Kazi implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "kazi_id")
    Long id;
    @Basic(optional = false)
    @Column(name = "kazi_name")
     String name;
    @Basic(optional = false)
    @Column(name = "kazi_office_name")
     String office_name;
    @Basic(optional = false)
    @Column(name = "kazi_address")
     String address;
    @Basic(optional = false)
    @Column(name = "kazi_nationality")
     String nationality;
    @Column(name = "kazi_dob")
     String dob;

    public Kazi(){

    }
    public Kazi(String name, String office_name, String address, String nationality, String dob) {
        this.name = name;
        this.office_name = office_name;
        this.address = address;
        this.nationality = nationality;
        this.dob = dob;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOffice_name() {
        return office_name;
    }

    public void setOffice_name(String office_name) {
        this.office_name = office_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}

*/





/*
import javax.persistence.*;



@Entity
public class Kazi {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="kazi_id")
    Long id;


    String name;
    String office_name;
    String address;
    String date_of_birth;
    String nationality;

    public Kazi() {

    }

    public Kazi(Long id, String name, String office_name, String address, String date_of_birth, String nationality) {
        this.id = id;
        this.name = name;
        this.office_name = office_name;
        this.address = address;
        this.date_of_birth = date_of_birth;
        this.nationality = nationality;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOffice_name() {
        return office_name;
    }

    public void setOffice_name(String office_name) {
        this.office_name = office_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
*/

import javax.persistence.*;



@Entity
public class Kazi {

    @Id
    @Column(name="kaziLicenceNumber")
    Long kaziLicenceNumber;


    String kaziUserName;
    String kaziEmail;
    String kaziPassword;

    public Kazi() {

    }
    public Kazi(String kaziUserName, String kaziEmail, String kaziPassword) {
        this.kaziUserName = kaziUserName;
        this.kaziEmail = kaziEmail;
        this.kaziPassword = kaziPassword;
    }

    public Long getKaziLicenceNumber() {
        return kaziLicenceNumber;
    }

    public void setKaziLicenceNumber(Long kaziLicenceNumber) {
        this.kaziLicenceNumber = kaziLicenceNumber;
    }

    public String getKaziUserName() {
        return kaziUserName;
    }

    public void setKaziUserName(String kaziUserName) {
        this.kaziUserName = kaziUserName;
    }

    public String getKaziEmail() {
        return kaziEmail;
    }

    public void setKaziEmail(String kaziEmail) {
        this.kaziEmail = kaziEmail;
    }

    public String getKaziPassword() {
        return kaziPassword;
    }

    public void setKaziPassword(String kaziPassword) {
        this.kaziPassword = kaziPassword;
    }
}

