package com.myorg.upcride.service;

import java.util.List;

public interface CRUDservice<T> {
    boolean insert(T t) throws Exception;
    boolean update(T t) throws Exception;
    boolean delete(T t) throws Exception;
    List<T> list() throws Exception;
    T listById(T t) throws Exception;
}
