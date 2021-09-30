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
public class LatihanEnum {

    public static void main(String[] args) {
        // Contoh menggunakan Constants
//        User user1 = new User("Budi", "0821233", Constants.ADMIN);
//        User user2 = new User("Heru", "0821233", Constants.ADMIN);
//        User user3 = new User("Dudi", "0821233", Constants.BASIC);
//        
//        if (user1.type.equals(Constants.ADMIN)) {
//            // tampilkan halaman admin
//        } else if (user1.type.equals(Constants.BASIC)) {
//            // tampilkan halaman user basic
//        }
        
        // Contoh menggunakan Enum
        User user1 = new User("Budi", "0821233", UserStatusEnum.VERIFIED_BASIC_BANGET);
        User user2 = new User("Andi", "0821233", UserStatusEnum.VERIFIED_PREMIUM);
        
        if(user1.status == UserStatusEnum.UNVERIFIED) {
            // do something
        } else {
            System.out.println(Constants.ERROR_WRONG_INPUT);
        }
        System.out.println(user1.getStatus());
        user1.status = UserStatusEnum.values()[0];
        System.out.println(user1.getStatus());
    }
}
