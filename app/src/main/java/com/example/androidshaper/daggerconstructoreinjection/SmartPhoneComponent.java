package com.example.androidshaper.daggerconstructoreinjection;

import dagger.Component;

@Component
public interface SmartPhoneComponent {
    SmartPhone getComponent();
}
