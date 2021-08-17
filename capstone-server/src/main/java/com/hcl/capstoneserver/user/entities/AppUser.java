package com.hcl.capstoneserver.user.entities;

import com.hcl.capstoneserver.user.UserType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class AppUser {
    @Id
    private String userId;

    private String password;

    @Enumerated(value = EnumType.STRING)
    private UserType userType;

    private Integer OTP;
    private Date otpExpiredDate;

    public AppUser() {
    }

    public AppUser(String userId) {
        this.userId = userId;
    }

    public AppUser(String userId, String password, UserType userType) {
        this.userId = userId;
        this.password = password;
        this.userType = userType;
    }

    public AppUser(String userId, String password, UserType userType, Integer OTP, Date otpExpiredDate) {
        this.userId = userId;
        this.password = password;
        this.userType = userType;
        this.OTP = OTP;
        this.otpExpiredDate = otpExpiredDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getUserType() {
        if (userType != null)
            return userType;
        else
            return null;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public Integer getOTP() {
        return OTP;
    }

    public void setOTP(Integer OTP) {
        this.OTP = OTP;
    }

    public Date getOtpExpiredDate() {
        return otpExpiredDate;
    }

    public void setOtpExpiredDate(Date otpExpiredDate) {
        this.otpExpiredDate = otpExpiredDate;
    }
}
