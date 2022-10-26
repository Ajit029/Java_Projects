package com.ajit.javatestfiles;

public class MemoryAndRuntime {

    public void getRuntimeAndMemoryConsumption(){
        long startTime = System.currentTimeMillis();

        /*
        <.....code here.....>
         */

        MemoryConsumption memory = new MemoryConsumption();
        long stopTime = System.currentTimeMillis();
        float elapsedTime = (stopTime - startTime) / 1000F;
        System.out.println(elapsedTime + " seconds");

        memory.computeMemory();
    }
}
