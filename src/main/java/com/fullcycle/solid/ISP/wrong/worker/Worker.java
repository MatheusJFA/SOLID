package com.fullcycle.solid.ISP.wrong.worker;

// This interface should be split into at least two interfaces
// Because the chief doesn't drive and the driver doesn't cook, so each class should implement only the methods that are related to it
// Remember this principle doesn't mean that you should create a lot of interfaces, or create one interface per function,but you should create the right amount of interfaces
// So, in this case, we should have an interface for the cook and another interface for the driver
public interface Worker {
    void cook();
    void drive();
    void work();
}
