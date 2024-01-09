/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bg.smg.services;

import bg.smg.model.User;
import java.sql.SQLException;

/**
 *
 * @author Natalia
 */
public interface UserServiceI {
    public void saveUser(User user);
    public User getUser(int id);
    public User getUserByUsername(String username) throws SQLException;
    public boolean verifyUser(User user) throws SQLException;
    public void updateForgottenPassword(User user);
}
