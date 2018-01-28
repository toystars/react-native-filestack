
package com.bmustapha.RNFileStack;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNFileStackModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNFileStackModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNFileStack";
  }
}