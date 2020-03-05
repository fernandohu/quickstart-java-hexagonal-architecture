package com.example.demo.core.togglefeature;

public interface ToggleCommand<A, B> {
    public boolean canExecute();

    public B execute(A in);
}
