package com.vpu.jmd.jedis.data;

import java.util.List;

public interface DataHelperInterface<T> {

    Integer TIME_OUT = 60*60*24*15;

    List<T> get(List<Integer> ids);


    void update(T t);


    void update(List<Integer> id);

    void batchUpdate(List<T> values);

    void delete(Integer id);

    default void delete(List<Integer> ids){
        for (Integer id : ids) {
            delete(id);
        }
    }

    String getKey();

}
