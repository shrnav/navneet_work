package com.nav.java8;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class TestSearchString extends TestCase {
    private List<String> list = new ArrayList<>();
    public TestSearchString() {
        list.add("Mark Zuckerberg");
        list.add("Will Smith");
        list.add("William Gates");
        list.add("Warren Buffet");
    }
    public void testGetStartsWith_w(){
        assertEquals("Length",3, SearchString.getStartsWithName("w",list).size());
        assertEquals("Strings Starts with w","Will Smith", SearchString.getStartsWithName("w",list).get(0));
        assertEquals("Strings Starts with w","William Gates", SearchString.getStartsWithName("w",list).get(1));
        assertEquals("Strings Starts with w","Warren Buffet", SearchString.getStartsWithName("w",list).get(2));
    }
    public void testGetStartsWith_wi(){
        assertEquals("Length",2, SearchString.getStartsWithName("wi",list).size());
        assertEquals("Strings Starts with wi","Will Smith", SearchString.getStartsWithName("wi",list).get(0));
        assertEquals("Strings Starts with wi","William Gates", SearchString.getStartsWithName("wi",list).get(1));
    }
    public void testGetStartsWith_wil(){
        assertEquals("Length",2, SearchString.getStartsWithName("wil",list).size());
        assertEquals("Strings Starts with wil","Will Smith", SearchString.getStartsWithName("wil",list).get(0));
        assertEquals("Strings Starts with wil","William Gates", SearchString.getStartsWithName("w",list).get(1));
    }
    public void testGetStartsWith_will(){
        assertEquals("Length",2, SearchString.getStartsWithName("will",list).size());
        assertEquals("Strings Starts with will","Will Smith", SearchString.getStartsWithName("will",list).get(0));
        assertEquals("Strings Starts with will","William Gates", SearchString.getStartsWithName("will",list).get(1));
    }
    public void testGetStartsWith_willi(){
        assertEquals("Length",1, SearchString.getStartsWithName("willi",list).size());
        assertEquals("Strings Starts with willi","William Gates", SearchString.getStartsWithName("willi",list).get(0));
    }
}
