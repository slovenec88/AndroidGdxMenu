package edu.gricar.RVMenu;

import com.badlogic.gdx.backends.android.AndroidApplication;
import android.os.Bundle;

public class AndroidMain3D extends AndroidApplication {
    ActionResolved actionResolver;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        actionResolver = new ActionResolved(this);
        
        // starts libGDX render thread
        initialize(new AndroidGdxMenuActivity(actionResolver), false);
    }
}