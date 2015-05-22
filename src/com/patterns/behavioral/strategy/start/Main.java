package com.patterns.behavioral.strategy.start;

/**
 * @author Aleksandr Konstantinovitch
 * @version 1.0
 * @date 12/07/2014
 */
import com.patterns.behavioral.strategy.auth.UserChecker;
import com.patterns.behavioral.strategy.strategy.DBAuth;
import com.patterns.behavioral.strategy.strategy.FileAuth;

import java.io.File;


public class Main {

    public static void main(String[] args) {
        UserChecker userChecker = new UserChecker();
        
        userChecker.check(new DBAuth("jdbc://etc"));
        
        userChecker.check(new FileAuth(new File("c:\\file.txt")));
        
    }
}
