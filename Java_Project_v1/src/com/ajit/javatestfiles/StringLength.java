package com.ajit.javatestfiles;

public class StringLength {
        public void countLengthOfString(){
            String name = "Ajit";
            StringToIntMapper mapper = String::length;
            int mappedValue = mapper.map(name);
            System.out.println("name=" + name + ", mapped value= " + mappedValue);
        }
        @FunctionalInterface
        interface StringToIntMapper{
            int map(String str);
        }
}

