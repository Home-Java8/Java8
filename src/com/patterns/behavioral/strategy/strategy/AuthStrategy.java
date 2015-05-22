package com.patterns.behavioral.strategy.strategy;

public interface AuthStrategy {
    boolean checkLogin(String name, String password);
}
