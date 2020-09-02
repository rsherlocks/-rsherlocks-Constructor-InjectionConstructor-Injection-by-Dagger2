package com.example.androidshaper.daggerconstructoreinjection;

import javax.inject.Inject;

public class SimCard {

    public ServiceProvider serviceProvider;

    @Inject
    public SimCard(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }
}
