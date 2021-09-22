// Generated by view binder compiler. Do not edit!
package com.example.mad.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mad.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AddBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatImageView appCompatImageView;

  @NonNull
  public final AppCompatImageView appCompatImageView2;

  @NonNull
  public final AppCompatImageView appCompatImageView3;

  @NonNull
  public final AutoCompleteTextView autoCompleteTextView;

  @NonNull
  public final ImageView imageV5;

  @NonNull
  public final ImageButton imageback;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final LinearLayout linearLayout2;

  @NonNull
  public final ScrollView scrollView2;

  @NonNull
  public final TextInputLayout stockCategory;

  @NonNull
  public final TextInputLayout stockID;

  @NonNull
  public final TextInputLayout stockName;

  @NonNull
  public final TextInputLayout stockQuantity;

  @NonNull
  public final TextInputLayout stockUnitPrice;

  @NonNull
  public final TextInputEditText text10;

  @NonNull
  public final TextInputEditText text2;

  @NonNull
  public final TextInputEditText text4;

  @NonNull
  public final TextInputEditText text8;

  @NonNull
  public final TextView topText2;

  @NonNull
  public final View topView;

  private AddBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatImageView appCompatImageView,
      @NonNull AppCompatImageView appCompatImageView2,
      @NonNull AppCompatImageView appCompatImageView3,
      @NonNull AutoCompleteTextView autoCompleteTextView, @NonNull ImageView imageV5,
      @NonNull ImageButton imageback, @NonNull LinearLayout linearLayout,
      @NonNull LinearLayout linearLayout2, @NonNull ScrollView scrollView2,
      @NonNull TextInputLayout stockCategory, @NonNull TextInputLayout stockID,
      @NonNull TextInputLayout stockName, @NonNull TextInputLayout stockQuantity,
      @NonNull TextInputLayout stockUnitPrice, @NonNull TextInputEditText text10,
      @NonNull TextInputEditText text2, @NonNull TextInputEditText text4,
      @NonNull TextInputEditText text8, @NonNull TextView topText2, @NonNull View topView) {
    this.rootView = rootView;
    this.appCompatImageView = appCompatImageView;
    this.appCompatImageView2 = appCompatImageView2;
    this.appCompatImageView3 = appCompatImageView3;
    this.autoCompleteTextView = autoCompleteTextView;
    this.imageV5 = imageV5;
    this.imageback = imageback;
    this.linearLayout = linearLayout;
    this.linearLayout2 = linearLayout2;
    this.scrollView2 = scrollView2;
    this.stockCategory = stockCategory;
    this.stockID = stockID;
    this.stockName = stockName;
    this.stockQuantity = stockQuantity;
    this.stockUnitPrice = stockUnitPrice;
    this.text10 = text10;
    this.text2 = text2;
    this.text4 = text4;
    this.text8 = text8;
    this.topText2 = topText2;
    this.topView = topView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AddBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AddBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.add, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AddBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appCompatImageView;
      AppCompatImageView appCompatImageView = ViewBindings.findChildViewById(rootView, id);
      if (appCompatImageView == null) {
        break missingId;
      }

      id = R.id.appCompatImageView2;
      AppCompatImageView appCompatImageView2 = ViewBindings.findChildViewById(rootView, id);
      if (appCompatImageView2 == null) {
        break missingId;
      }

      id = R.id.appCompatImageView3;
      AppCompatImageView appCompatImageView3 = ViewBindings.findChildViewById(rootView, id);
      if (appCompatImageView3 == null) {
        break missingId;
      }

      id = R.id.autoCompleteTextView;
      AutoCompleteTextView autoCompleteTextView = ViewBindings.findChildViewById(rootView, id);
      if (autoCompleteTextView == null) {
        break missingId;
      }

      id = R.id.imageV5;
      ImageView imageV5 = ViewBindings.findChildViewById(rootView, id);
      if (imageV5 == null) {
        break missingId;
      }

      id = R.id.imageback;
      ImageButton imageback = ViewBindings.findChildViewById(rootView, id);
      if (imageback == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.linearLayout2;
      LinearLayout linearLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout2 == null) {
        break missingId;
      }

      id = R.id.scrollView2;
      ScrollView scrollView2 = ViewBindings.findChildViewById(rootView, id);
      if (scrollView2 == null) {
        break missingId;
      }

      id = R.id.stockCategory;
      TextInputLayout stockCategory = ViewBindings.findChildViewById(rootView, id);
      if (stockCategory == null) {
        break missingId;
      }

      id = R.id.stockID;
      TextInputLayout stockID = ViewBindings.findChildViewById(rootView, id);
      if (stockID == null) {
        break missingId;
      }

      id = R.id.stockName;
      TextInputLayout stockName = ViewBindings.findChildViewById(rootView, id);
      if (stockName == null) {
        break missingId;
      }

      id = R.id.stockQuantity;
      TextInputLayout stockQuantity = ViewBindings.findChildViewById(rootView, id);
      if (stockQuantity == null) {
        break missingId;
      }

      id = R.id.stockUnitPrice;
      TextInputLayout stockUnitPrice = ViewBindings.findChildViewById(rootView, id);
      if (stockUnitPrice == null) {
        break missingId;
      }

      id = R.id.text10;
      TextInputEditText text10 = ViewBindings.findChildViewById(rootView, id);
      if (text10 == null) {
        break missingId;
      }

      id = R.id.text2;
      TextInputEditText text2 = ViewBindings.findChildViewById(rootView, id);
      if (text2 == null) {
        break missingId;
      }

      id = R.id.text4;
      TextInputEditText text4 = ViewBindings.findChildViewById(rootView, id);
      if (text4 == null) {
        break missingId;
      }

      id = R.id.text8;
      TextInputEditText text8 = ViewBindings.findChildViewById(rootView, id);
      if (text8 == null) {
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

      return new AddBinding((ConstraintLayout) rootView, appCompatImageView, appCompatImageView2,
          appCompatImageView3, autoCompleteTextView, imageV5, imageback, linearLayout,
          linearLayout2, scrollView2, stockCategory, stockID, stockName, stockQuantity,
          stockUnitPrice, text10, text2, text4, text8, topText2, topView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
