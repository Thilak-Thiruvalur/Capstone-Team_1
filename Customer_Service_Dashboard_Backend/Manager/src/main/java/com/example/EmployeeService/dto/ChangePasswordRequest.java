package com.example.EmployeeService.dto;

public class ChangePasswordRequest {
	private String currentPassword;
    private String newPassword;
 
    public ChangePasswordRequest() {
    }
 
    public String getCurrentPassword() {
        return currentPassword;
    }
 
    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }
 
    public String getNewPassword() {
        return newPassword;
    }
 
    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

}
