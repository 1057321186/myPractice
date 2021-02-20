package com.test;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue<Object> queue = new LinkedList<>();
        queue.add("s");
        Object remove = queue.remove();
        System.out.println(remove);
    }
}
