// Generated by view binder compiler. Do not edit!
package com.example.mad.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mad.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ListBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageV5;

  @NonNull
  public final LinearLayout linearLayout2;

  @NonNull
  public final RelativeLayout r1;

  @NonNull
  public final TextView topText2;

  @NonNull
  public final View topView;

  private ListBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView imageV5,
      @NonNull LinearLayout linearLayout2, @NonNull RelativeLayout r1, @NonNull TextView topText2,
      @NonNull View topView) {
    this.rootView = rootView;
    this.imageV5 = imageV5;
    this.linearLayout2 = linearLayout2;
    this.r1 = r1;
    this.topText2 = topText2;
    this.topView = topView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageV5;
      ImageView imageV5 = ViewBindings.findChildViewById(rootView, id);
      if (imageV5 == null) {
        break missingId;
      }

      id = R.id.linearLayout2;
      LinearLayout linearLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout2 == null) {
        break missingId;
      }

      id = R.id.r1;
      RelativeLayout r1 = ViewBindings.findChildViewById(rootView, id);
      if (r1 == null) {
        break missingId;
      }

      id = R.id.topText2;
      TextView topText2 = ViewBindings.findChildViewById(rootView, id);
      if (topText2 == null) {
        break missingId;
      }

      id = R.id.topView;
      View topView = ViewBindings.findChildViewById(rootView, id);
      if (topView == null) {
        break missingId;
      }

      return new ListBinding((ConstraintLayout) rootView, imageV5, linearLayout2, r1, topText2,
          topView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
