package com.example.demo.core.togglefeature;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ToggleExecutor<A, B> {

    ArrayList<ToggleCommand<A, B>> services = new ArrayList<>();

    public ToggleExecutor add(ToggleCommand<A, B> service) {
        services.add(service);
        return this;
    }

    public B executeOne(A in) {
        B result = null;

        for (int i = 0; i < services.size(); i++) {
            if (services.get(i).canExecute()) {
                return services.get(i).execute(in);
            }
        }

        return null;
    }

    public Map<Class, B> executeAll(A in) {
        Map<Class, B> responseObjects = new HashMap<>();

        for (int i = 0; i < services.size(); i++) {
            if (services.get(i).canExecute()) {
                responseObjects.put(services.getClass(), services.get(i).execute(in));
            }
        }
        return responseObjects;
    }
}
