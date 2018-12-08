package org.upgrad.services;

import org.springframework.stereotype.Service;
import org.upgrad.models.User;
import org.upgrad.repositories.UserRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String findUserPassword(String contactNumber) {
        return userRepository.findUserPassword(contactNumber);
    }

    @Override
    public User findUser(String contactNumber) {
        return userRepository.findUser(contactNumber);
    }

    @Override
    public void addUser(User newuser) {

        userRepository.save(newuser);
    }

    @Override
    public User updateUserDetails(String firstname, String lastname, long userid) {
        System.out.println("name: "+firstname+" "+lastname+" "+userid);

        userRepository.updateddetails(firstname,lastname,userid);
        return userRepository.findUserbyID(userid);
    }

    @Override
    public Integer updateUserPassword(String password, Integer id) {
        return userRepository.updatePassword(password,id);
    }

    @Override
    public User getUserById(Integer id) {
        return userRepository.findPasswordById(id);
    }


}
