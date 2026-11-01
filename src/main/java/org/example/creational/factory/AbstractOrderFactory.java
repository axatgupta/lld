package org.example.creational.factory;

import java.util.Map;
import java.util.function.Supplier;

public class AbstractOrderFactory {
    Map<String, Supplier<Factory>> abstractFactoryReg;
}
