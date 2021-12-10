// CarolWidgetManager.java

package com.reactlibrary;

import android.view.View;
import android.content.Intent;

import androidx.appcompat.widget.AppCompatCheckBox;
import com.card91.samplecalculator.*;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

public class CarolWidgetManager extends SimpleViewManager<View> {

    public static final String REACT_CLASS = "CarolWidget";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public View createViewInstance(ThemedReactContext c) {
        // TODO: Implement some actually useful functionality
//        SimpleTesting st = new ActivityStarterModule();
        AppCompatCheckBox cb = new AppCompatCheckBox(c);
            Intent intent = new Intent(c, CalculatorActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
             c.startActivity(intent);
        cb.setChecked(true);
        return cb;
    }
}
