package com.ajit.javatestfiles;

public class MemoryConsumption {

    public void computeMemory(){
        Runtime runtime = Runtime.getRuntime();
        long memoryMax = runtime.maxMemory();
        long memoryUsed = runtime.totalMemory() - runtime.freeMemory();
        double memoryUsedPercent = (memoryUsed * 100.0) / memoryMax;
        System.out.println("memoryUsedPercent: " + memoryUsedPercent);
        if (memoryUsedPercent > 90.0)
            System.gc();
    }

}
