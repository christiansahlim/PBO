/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnumConstants;

/**
 *
 * @author hanschristian
 */
public class User implements ConstantInterface {
    private String name;
    private String phone;
    String type;
        UserStatusEnum status;
    // User dibagi menjadi 3 kelompok : Unverified, Verified Basic, dan Verified Premium
    
    public User(String name, String phone, String type) {
        this.name = name;
        this.phone = phone;
        this.type = type;
    }

    public User(String name, String phone, UserStatusEnum status) {
        this.name = name;
        this.phone = phone;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public UserStatusEnum getStatus() {
        return status;
    }

    public void setStatus(UserStatusEnum status) {
        this.status = status;
    }
    
    void calculateXFromConstants() {
        double totalFromInterface = PHI * 5;
        double totalFromStaticConstants = Constants.PHI * 5;
    }
}
