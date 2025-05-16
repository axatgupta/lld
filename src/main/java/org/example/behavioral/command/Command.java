package org.example.behavioral.command;

import org.example.structural.decorator.Product;

public interface Command {
    void execute(Product product);
    void undo(Product product);
}
