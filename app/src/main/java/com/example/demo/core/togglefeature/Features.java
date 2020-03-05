package com.example.demo.core.togglefeature;

import org.togglz.core.Feature;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

public enum Features implements Feature {

    @Label("Usar o Mussum Ipsum Generator")
    MUSSUM_IPSUM,

    @Label("Usar o novo cálculo de impostos")
    NEW_TAX;

    public boolean isActive() {
        return FeatureContext.getFeatureManager().isActive(this);
    }
}

