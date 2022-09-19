package com.sudhirtheindian.draganddrop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.jmedeisis.draglinearlayout.DragLinearLayout;

public class MainActivity extends AppCompatActivity {
    DragLinearLayout dragLinearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // below lines is to initialize our Drag linear layout
         dragLinearLayout=findViewById(R.id.container);

        // we are creating for loop for dragging
        // and dropping of child items.

         for(int i =0;i<dragLinearLayout.getChildCount(); i++){

             // below is the child inside dragger layout
             View view = dragLinearLayout.getChildAt(i);

             // below line will set all children draggable
             // except the header layout.
             // the child is its own drag handle.
             dragLinearLayout.setViewDraggable(view, view);
        }
    }
}